package com.fileManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fileManager.entity.File;
import com.fileManager.entity.dto.FileDTO;
import com.fileManager.service.FileServiceImpl;

@RestController
@RequestMapping("/file")
public class FileController {

	@Autowired
	private FileServiceImpl fileService;
	
	public File getById(int id) {
		return fileService.getById(id);
	}
	
	
	public List<File> getAll(){
		return fileService.getAll();
	}
	
	
	@PostMapping("")
	public File create(@ModelAttribute FileDTO dto) {
		
		return fileService.create(dto);
	}
	
	
	public File update(FileDTO dto) {
		
		return fileService.update(dto);
	}
	
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable int id) {
		return fileService.delete(id);
	}
}
