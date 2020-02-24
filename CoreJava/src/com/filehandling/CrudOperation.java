package com.filehandling;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class Account 
{
	/*private int accid;
	private double accbal;
	private String name;
	public Account(int accid, double accbal, String name) {
		super();
		this.accid = accid;
		this.accbal = accbal;
		this.name = name;*/
	public static void create() throws Exception
	{
		File file= new File("G:\\FULL STACK JAVA\\CORE JAVA\\crud.txt");
		RandomAccessFile raf= new RandomAccessFile(file, "rw");
		raf.writeInt(1582);
		raf.writeDouble(12000.85);
		raf.writeUTF("sandeep");
		raf.close();
		System.out.println("Account is created");
	}
	public static void read() throws IOException
	{
		File file= new File("G:\\FULL STACK JAVA\\CORE JAVA\\crud.txt");
		RandomAccessFile raf= new RandomAccessFile(file, "r");
		long currentPosition= raf.getFilePointer(); 
		raf.seek(0); 
		int id = raf.readInt();
		double balance = raf.readDouble();
		String name = raf.readUTF();
		raf.close();
		System.out.println("Account id:-"+ id +"\nBalance:- "+balance+"\nAccount holder name:- "+name);	
	}
	public static void update()throws IOException
	{
		File file= new File("G:\\FULL STACK JAVA\\CORE JAVA\\crud.txt");
		RandomAccessFile raf= new RandomAccessFile(file, "rw");
		raf.seek(0); 
		raf.writeInt(853);
		raf.writeDouble(1200.85);
		raf.writeUTF("Swadhin");
		raf.close();
		System.out.println("Account is created");
		
	}
	public static void delete()
	{
	}
	
	
}
public class CrudOperation {

	public static void main(String[] args) throws Exception {
		
		Account a= new Account();
		//a.create();
		a.read();
		
	}

}
