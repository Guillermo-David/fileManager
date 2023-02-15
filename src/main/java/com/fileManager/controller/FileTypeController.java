package com.fileManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fileManager.entity.FileType;
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
}
