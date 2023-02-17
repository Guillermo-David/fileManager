package com.guillermo.fileManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.guillermo.fileManager.entity.FileType;
import com.guillermo.fileManager.service.FileTypeServiceImpl;

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
