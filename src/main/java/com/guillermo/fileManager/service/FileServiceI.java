package com.guillermo.fileManager.service;

import java.util.List;

import com.guillermo.fileManager.entity.File;
import com.guillermo.fileManager.entity.dto.FileDTO;

public interface FileServiceI {

	public File getById(int id);
	public List<File> getAll();
	public File create(FileDTO dto);
	public File update(FileDTO dto);
	public boolean delete(int id);
}
