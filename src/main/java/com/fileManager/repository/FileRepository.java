package com.fileManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fileManager.entity.File;

@Repository
public interface FileRepository extends JpaRepository<File, Integer>{
	
}
