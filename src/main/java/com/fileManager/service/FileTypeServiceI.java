package com.fileManager.service;

import java.util.List;

import com.fileManager.entity.FileType;

public interface FileTypeServiceI {

	public FileType getById(int id);
	public List<FileType> getAll();
	
}
