package com.fileManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fileManager.entity.FileType;

@Repository
public interface FileTypeRepository extends JpaRepository<FileType, Integer>{

	FileType findByName(String name);
	
}
