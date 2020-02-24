package com.filehandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceFileTest {

	public static void main(String[] args)throws Exception {
		FileInputStream fie1=new FileInputStream("G:\\FULL STACK JAVA\\CORE JAVA\\abc.txt");
		FileInputStream fie2=new FileInputStream("G:\\FULL STACK JAVA\\CORE JAVA\\pqr.txt");
		FileInputStream fie3=new FileInputStream("G:\\FULL STACK JAVA\\CORE JAVA\\xyz.txt");
		
		Vector v=new Vector();
		v.add(fie1);
		v.add(fie2);
		v.add(fie3);
		Enumeration e=v.elements();
		SequenceInputStream sis=new SequenceInputStream(e);
		int i;
		while((i=sis.read())!=-1){
		System.out.print((char)i);
		}
		sis.close();
		fie1.close();
		fie2.close();
		fie3.close();

	}

}
