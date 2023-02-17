package com.guillermo.fileManager.service;

import java.util.List;

import com.guillermo.fileManager.entity.FileType;

public interface FileTypeServiceI {

	public FileType getById(int id);
	public List<FileType> getAll();
	
}
