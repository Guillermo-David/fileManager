package com.fileManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fileManager.entity.FileType;
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
}
