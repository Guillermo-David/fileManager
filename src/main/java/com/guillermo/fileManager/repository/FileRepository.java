package com.guillermo.fileManager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guillermo.fileManager.entity.File;
import com.guillermo.fileManager.entity.FileReference;

@Repository
public interface FileRepository extends JpaRepository<File, Integer>{
	
	public List<File> findByFileReferenceId(int id);
	public List<File> findByFileReference(FileReference fileReference);
}
