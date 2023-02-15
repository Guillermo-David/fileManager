package com.fileManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fileManager.entity.FileReference;
import com.fileManager.entity.dto.FileReferenceDTO;
import com.fileManager.repository.FileReferenceRepository;

@Service
public class FileReferenceServiceImpl implements FileReferenceServiceI {

	@Autowired
	private FileReferenceRepository fileReferenceRepository;
	
	
	@Override
	public FileReference getById(int id) {
		return fileReferenceRepository.findById(id).orElse(null);
	}

	@Override
	public List<FileReference> getAll() {
		return fileReferenceRepository.findAll();
	}

	@Override
	public FileReference create(FileReferenceDTO dto) {
		return fileReferenceRepository.save(dto.parse());
	}

	@Override
	public FileReference update(FileReferenceDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
