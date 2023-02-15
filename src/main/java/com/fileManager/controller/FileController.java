package com.fileManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fileManager.entity.File;
import com.fileManager.entity.dto.FileDTO;
import com.fileManager.service.FileServiceImpl;

@Controller
public class FileController {

	@Autowired
	private FileServiceImpl fileService;
	
	public File getById(int id) {
		return fileService.getById(id);
	}
	
	
	public List<File> getAll(){
		return fileService.getAll();
	}
	
	
	public File create(FileDTO dto) {
		
		return fileService.create(dto);
	}
	
	
	public File update(FileDTO dto) {
		
		return fileService.update(dto);
	}
	
	
	public boolean delete(int id) {
		return fileService.delete(id);
	}
}
