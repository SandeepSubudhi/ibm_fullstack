package com.filehandling;

import java.io.File;
import java.util.Date;

public class DirDetails {

	public static void main(String[] args) throws Exception
	{
	
		 String dirName = "G:\\FULL STACK JAVA\\CORE JAVA\\";
	        
	        File fileName = new File(dirName);
	        File[] fileList = fileName.listFiles();
	        
	        for (File file: fileList) {
	            
	           // System.out.println(file);
	            System.out.println(file.getName());
	            System.out.println(file.length());
	            System.out.println(file.canRead());
	            System.out.println(file.canWrite());
	            System.out.println(file.canExecute());
	            System.out.println(new Date(file.lastModified()));
	        }

	}

}
