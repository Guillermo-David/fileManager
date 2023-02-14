package com.fileManager.entity.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import com.fileManager.entity.File;
import com.fileManager.entity.FileReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileDTO implements Serializable {

	private static final long serialVersionUID = -2959530211095843380L;

	private Integer id;
	private String name;
	private String originalName;
	private Long size;
	private FileReference fileReference;
	
	private MultipartFile multipart;
	
	
	//OUT
	public FileDTO(@NotNull File file) {
		setId(id);
		setName(name);
		setOriginalName(originalName);
		setSize(size);
		setFileReference(fileReference);
	}
	
	//IN
	public File parse(@NotNull File file) {
		file.setId(id);
		file.setName(name);
		file.setOriginalName(originalName);
		file.setSize(size);
		file.setFileReference(fileReference);
		
		return file;
	}
	
	public File parse() {
		return parse(new File());
	}
}
