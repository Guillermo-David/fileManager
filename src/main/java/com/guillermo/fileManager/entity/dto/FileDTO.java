package com.guillermo.fileManager.entity.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import com.guillermo.fileManager.entity.File;
import com.guillermo.fileManager.entity.FileReference;
import com.guillermo.fileManager.entity.FileType;

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
	private String filePath;
	private String notes;
	private Long size;
	private boolean isDefault;
	private LocalDateTime dateCreation;
	private FileReference fileReference;
	private FileType fileType;
	private int fileReferenceId;
	private int fileTypeId;
	
	private MultipartFile file;
	
	
	//OUT
	public FileDTO(@NotNull File file) {
		setId(file.getId());
		setName(file.getName());
		setOriginalName(file.getOriginalName());
		setFilePath(file.getFilePath());
		setNotes(file.getNotes());
		setSize(file.getSize());
		setDefault(file.isDefault());
		setDateCreation(file.getDateCreation());
		setFileReferenceId(file.getFileReference().getId());
		setFileTypeId(file.getFileType().getId());
	}
	
	//IN
	public File parse(@NotNull File file) {
		file.setId(id);
		file.setName(name);
		file.setOriginalName(originalName);
		file.setFilePath(filePath);
		file.setNotes(notes);
		file.setSize(size);
		file.setDateCreation(dateCreation);
		file.setDefault(isDefault);
		file.setFileReference(fileReference);
		file.setFileType(fileType);
		
		return file;
	}
	
	public File parse() {
		return parse(new File());
	}
}
