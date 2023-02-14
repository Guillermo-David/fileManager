package com.fileManager.entity.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fileManager.entity.FileReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileReferenceDTO implements Serializable {

	private static final long serialVersionUID = -2649814295710037441L;
	
	private Integer id;
	
	
	//OUT
	public FileReferenceDTO(@NotNull FileReference fileReference) {
		setId(id);
	}
	
	//IN
	public FileReference parse(@NotNull FileReference fileReference) {
		fileReference.setId(id);
		
		return fileReference;
	}
	
	public FileReference parse() {
		return parse(new FileReference());
	}
}
