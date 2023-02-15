package com.guillermo.fileManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guillermo.fileManager.entity.FileReference;

@Repository
public interface FileReferenceRepository extends JpaRepository<FileReference, Integer>{
	
}
