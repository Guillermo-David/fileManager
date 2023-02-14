package com.fileManager.entity.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fileManager.entity.FileType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileTypeDTO implements Serializable {

	private static final long serialVersionUID = -3867692303331971546L;
	
	private Integer id;
	private String name;
	
	
	//OUT
	public FileTypeDTO(@NotNull FileType fileType) {
		setId(id);
		setName(name);
	}
	
	//IN
	public FileType parse(@NotNull FileType fileType) {
		
		fileType.setId(id);
		fileType.setName(name);
		
		return fileType;
	}
	
	public FileType parse() {
		return parse(new FileType());
	}
}
