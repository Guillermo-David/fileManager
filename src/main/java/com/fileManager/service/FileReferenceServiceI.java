package com.fileManager.service;

import java.util.List;

import com.fileManager.entity.FileReference;
import com.fileManager.entity.dto.FileReferenceDTO;

public interface FileReferenceServiceI {

	public FileReference getById(int id);
	public List<FileReference> getAll();
	public FileReference createFileReference(FileReferenceDTO dto);
	public FileReference updateFileReference(int id, FileReferenceDTO dto);
	public FileReference deleteFileReference(int id);
}
