package com.guillermo.fileManager.service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.guillermo.fileManager.entity.File;
import com.guillermo.fileManager.entity.FileReference;
import com.guillermo.fileManager.entity.FileType;
import com.guillermo.fileManager.entity.dto.FileDTO;
import com.guillermo.fileManager.entity.dto.FileReferenceDTO;
import com.guillermo.fileManager.enums.FileTypes;
import com.guillermo.fileManager.repository.FileReferenceRepository;
import com.guillermo.fileManager.repository.FileRepository;
import com.guillermo.fileManager.repository.FileTypeRepository;
import com.guillermo.fileManager.utils.Utils;

@Service
public class FileServiceImpl implements FileServiceI {

	@Autowired
	private FileRepository fileRepository;
	@Autowired
	private FileReferenceRepository fileReferenceRepository;
	@Autowired
	private FileTypeRepository fileTypeRepository;
	@Autowired
	private FileReferenceServiceImpl fileReferenceService;
	
	
	@Override
	public File getById(int id) {
		return fileRepository.findById(id).orElse(null);
	}

	@Override
	public List<File> getAll() {
		return fileRepository.findAll();
	}

	@Override
	public File create(FileDTO dto) {
		
		try {
			MultipartFile multipart = dto.getFile();
			
			String dir = getClass().getClassLoader().getResource(".").getFile().replaceFirst("/", "") + LocalDate.now().toString().replace("-","");
			String ext = FilenameUtils.getExtension(multipart.getOriginalFilename());
			String fileName = Utils.generateName(32) + ext;
			
			java.io.File fileIO = new java.io.File(dir + "/" + "." + fileName);
			fileIO.mkdirs();
			multipart.transferTo(fileIO);
			
			FileReference fileReference = fileReferenceRepository.findById(dto.getFileReferenceId()).orElse(null);
			if(fileReference == null) fileReference = fileReferenceService.create(new FileReferenceDTO());
			
			FileType fileType = fileTypeRepository.findById(dto.getFileTypeId()).orElse(null);
			if(fileType == null) {
				fileType = fileTypeRepository.findByName(FileTypes.valueOf(ext));
			}
			
			File file = dto.parse();
			file.setName(fileName);
			file.setOriginalName(multipart.getOriginalFilename());
			file.setFilePath(dir);
			file.setFileReference(fileReference);
			file.setFileType(fileType);
			file.setDefault(dto.isDefault());
			file.setSize(multipart.getSize());
			file.setDateCreation(LocalDateTime.now());
			
			return fileRepository.save(file);
			
		} catch (IllegalStateException e) {
			System.out.println("1");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("2");
			e.printStackTrace();
		}
		
		return null;
		
	}

	@Override
	public File update(FileDTO dto) {
		File file = dto.parse(getById(dto.getId()));
		return file != null ? fileRepository.save(file) : null;
	}

	@Override
	public boolean delete(int id) {
		File file = getById(id);
		if(file != null) {
			java.io.File fileIO = new java.io.File(file.getFilePath() + "/" + file.getName());
			if(fileIO != null) fileIO.delete();
			fileRepository.delete(file);
			return true;
		} else
			return false;
	}

}
