package com.fileManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fileManager.entity.FileType;
import com.fileManager.entity.dto.FileTypeDTO;
import com.fileManager.service.FileTypeServiceImpl;

@Controller
public class FileTypeController {

	@Autowired
	private FileTypeServiceImpl fileTypeService;
	
	
	public FileType getById(int id) {
		return fileTypeService.getById(id);
	}
	
	
	public List<FileType> getAll(){
		return fileTypeService.getAll();
	}
	
	
	public FileType create(FileTypeDTO dto) {
		
		return fileTypeService.create(dto);
	}
	
	
	public FileType update(FileTypeDTO dto) {
		
		return fileTypeService.update(dto);
	}
	
	
	public boolean delete(int id) {
		return fileTypeService.delete(id);
	}
}
