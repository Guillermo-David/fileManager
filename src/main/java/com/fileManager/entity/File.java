package com.fileManager.entity;

import javax.validation.constraints.NotNull;

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
	private int id;
	
	@NotNull
	@Column(name = "name", nullable = false, unique = true, length = 64)
	private String name;
	
	@NotNull
	@Column(name = "originalname", nullable = false, length = 255)
	private String originalName;
	
	@NotNull
	@Column(name = "size", nullable = false)
	private Long size;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "filereferenceId", nullable = false)
	private FileReference fileReference;
}
