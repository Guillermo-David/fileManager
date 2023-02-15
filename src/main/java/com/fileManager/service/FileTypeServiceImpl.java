package com.fileManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fileManager.entity.FileType;
import com.fileManager.entity.dto.FileTypeDTO;
import com.fileManager.repository.FileTypeRepository;

@Service
public class FileTypeServiceImpl implements FileTypeServiceI {

	@Autowired
	private FileTypeRepository fileTypeRepository;
	
	
	@Override
	public FileType getById(int id) {
		return fileTypeRepository.findById(id).orElse(null);
	}

	@Override
	public List<FileType> getAll() {
		return fileTypeRepository.findAll();
	}

	@Override
	public FileType create(FileTypeDTO dto) {
		return fileTypeRepository.save(dto.parse());
	}

	@Override
	public FileType update(FileTypeDTO dto) {
		FileType fileType = getById(dto.getId());
		return fileType != null ? fileTypeRepository.save(fileType) : null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
