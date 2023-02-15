package com.fileManager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.fileManager.entity.FileType;
import com.fileManager.repository.FileTypeRepository;

@Component
public class FileManagerRunner implements ApplicationRunner {

	@Autowired
	private FileTypeRepository fileTypeRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		if(fileTypeRepository.findAll().isEmpty()) {
			List<FileType> fileTypes = new ArrayList<>();
			String[] names = {"image", "pdf", "doc", "xls"};
			
			for(String name : names) {
				FileType fileType = new FileType();
				fileType.setName(name);
				fileTypes.add(fileType);
			}
			
			fileTypeRepository.saveAll(fileTypes);			
		}
		
		
	}

}
