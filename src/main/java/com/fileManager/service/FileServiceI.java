package com.fileManager.service;

import java.util.List;

import com.fileManager.entity.File;
import com.fileManager.entity.dto.FileDTO;

public interface FileServiceI {

	public File getById(int id);
	public List<File> getAll();
	public File createFile(FileDTO dto);
	public File updateFile(int id, FileDTO dto);
	public File deleteFile(int id);
}
