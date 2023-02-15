package com.fileManager.enums;

public class FileTypes {

	private FileTypes() {}
	
	public static final String IMG = "image";
	public static final String DOC = "doc";
	public static final String PDF = "pdf";
	public static final String XLS = "xls";
	public static final String XML = "xml";
	public static final String JSON = "json";
	public static final String MISC = "miscellaneous";
	
	
	public static String valueOf(String input) {
		switch(input.toLowerCase()) {
			case "image", "img", "jpg", "bmp", "png", "jpeg": 
				return IMG;
			case "doc", "docx":
				return DOC;
			case "pdf":
				return PDF;
			case "xls", "xlsm", "csv":
				return XLS;
			case "xml":
				return XML;
			case "json":
				return JSON;
			default:
				return MISC;					
		}
	}
}
