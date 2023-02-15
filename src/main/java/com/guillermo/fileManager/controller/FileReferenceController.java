package com.guillermo.fileManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.guillermo.fileManager.entity.FileReference;
import com.guillermo.fileManager.entity.dto.FileReferenceDTO;
import com.guillermo.fileManager.service.FileReferenceServiceImpl;

@Controller
public class FileReferenceController {

	@Autowired
	private FileReferenceServiceImpl fileReferenceService;
	
	public FileReference getById(int id) {
		return fileReferenceService.getById(id);
	}
	
	
	public List<FileReference> getAll(){
		return fileReferenceService.getAll();
	}
	
	
	public FileReference create(FileReferenceDTO dto) {
		
		return fileReferenceService.create(dto);
	}
	
	
	public FileReference update(FileReferenceDTO dto) {
		
		return fileReferenceService.update(dto);
	}
	
	
	public boolean delete(int id) {
		return fileReferenceService.delete(id);
	}
}