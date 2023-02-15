package com.fileManager.entity;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="file")
public class File {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Column(name = "name", nullable = false, unique = true, length = 64)
	private String name;
	
	@NotNull
	@Column(name = "originalName", nullable = false, length = 255)
	private String originalName;
	
	@NotNull
	@Column(name = "filePath", nullable = false, length = 255)
	private String filePath;

	@Column(name = "notes", nullable = true)
	private String notes = "";
	
	@NotNull
	@Column(name = "size", nullable = false)
	private Long size;
	
	@Column(name="isDefault")
	private boolean isDefault = true;
	
	@NotNull
	@Column(name="dateCreation")
	private LocalDateTime dateCreation = LocalDateTime.now();
	
	@JsonIgnore
	@NotNull
	@ManyToOne
	@JoinColumn(name = "fileReferenceId", nullable = false)
	private FileReference fileReference;

	@JsonIgnore
	@NotNull
	@ManyToOne
	@JoinColumn(name = "fileTypeId", nullable = false)
	private FileType fileType;
}
