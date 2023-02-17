package com.guillermo.fileManager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.guillermo.fileManager.entity.FileType;
import com.guillermo.fileManager.repository.FileTypeRepository;

@Component
public class FileManagerRunner implements ApplicationRunner {

	@Autowired
	private FileTypeRepository fileTypeRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		if(fileTypeRepository.findAll().isEmpty()) {
			List<FileType> fileTypes = new ArrayList<>();
			String[] names = {"image", "pdf", "doc", "xls", "xml", "json", "miscellaneous"};
			
			for(String name : names) {
				FileType fileType = new FileType();
				fileType.setName(name);
				fileTypes.add(fileType);
			}
			
			fileTypeRepository.saveAll(fileTypes);			
		}
		
		
	}

}
