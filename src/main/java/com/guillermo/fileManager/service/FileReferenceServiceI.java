package com.guillermo.fileManager.service;

import java.util.List;

import com.guillermo.fileManager.entity.FileReference;
import com.guillermo.fileManager.entity.dto.FileReferenceDTO;

public interface FileReferenceServiceI {

	public FileReference getById(int id);
	public List<FileReference> getAll();
	public FileReference create(FileReferenceDTO dto);
	public FileReference update(FileReferenceDTO dto);
	public boolean delete(int id);
}
