package com.guillermo.fileManager.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.guillermo.fileManager.entity.File;
import com.guillermo.fileManager.entity.dto.FileDTO;
import com.guillermo.fileManager.service.FileServiceImpl;

@Controller
public class FileController {

	private FileServiceImpl fileService = new FileServiceImpl();
	
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
