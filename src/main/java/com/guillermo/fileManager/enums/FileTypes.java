package com.guillermo.fileManager.enums;

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
			case "image":
			case "img":
			case "jpg":
			case "bmp":
			case "png":
			case "jpeg": 
				return IMG;
			case "doc":
			case"docx":
				return DOC;
			case "pdf":
				return PDF;
			case "xls":
			case "xlsm":
			case "csv":
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
