package com.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AccDetailsTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file=new File("G:\\FULL STACK JAVA\\CORE JAVA\\account.txt");
		FileOutputStream fos=new FileOutputStream(file);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(1254);
		dos.writeDouble(2500.00);
		dos.writeUTF("Sandeep");
		dos.writeInt(5896);
		dos.writeDouble(2100.50);
		dos.writeUTF("Swadhin");
		dos.writeInt(9969);
		dos.writeDouble(6900.05);
		dos.writeUTF("Sandy");
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
		FileInputStream fis= new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		for(int i=0;i<3;i++)
		{
		int acc_no= dis.readInt();
		double balance= dis.readDouble();
		String name = dis.readUTF();
		System.out.println("Account no.:- "+ acc_no +"\nBalance:- "+ balance +"\nName:- "+ name);
		}
		dis.close();
		fis.close();
	}

}
