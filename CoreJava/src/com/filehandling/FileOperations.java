package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOperations {

	public static void main(String[] args) throws Exception {
	
		File file= new File("G:\\FULL STACK JAVA\\CORE JAVA\\abc.txt");
		File file1= new File("G:\\FULL STACK JAVA\\CORE JAVA\\pqr.txt");
		FileInputStream fis= new FileInputStream(file);
		FileOutputStream fos= new FileOutputStream(file1);
		StringBuilder sb= new StringBuilder("");
		int i= 0;
		do {
		i= fis.read();
		if(i!= -1)
		sb.append((char)i);
		}
		while(i!= -1); 
		String str=sb.toString();
		//System.out.println("File contents:  "+ sb);
		fos.write(str.getBytes());
		fos.flush();
		fis.close();
		fos.close();
	}

}
