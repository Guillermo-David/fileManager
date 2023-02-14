package com.fileManager.service;

import java.util.List;

import com.fileManager.entity.FileType;
import com.fileManager.entity.dto.FileTypeDTO;

public interface FileTypeServiceI {

	public FileType getById(int id);
	public List<FileType> getAll();
	public FileType create(FileTypeDTO dto);
	public FileType update(FileTypeDTO dto);
	public boolean delete(int id);
	
}
