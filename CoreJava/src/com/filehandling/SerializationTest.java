package com.filehandling;

import java.io.*;

public class SerializationTest 
{
	
	public static class Date implements Serializable
	{
		private static final long serialVersionUID= 1L;
		private int day;
		private int month;
		private int year;
		public Date(int day, int month, int year) 
		{
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}
		public Date() 
		{
			this.day = 10;
			this.month = 4;
			this.year = 2020;
		}
		@Override
		public String toString()
		{
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}
	}

    public static class Account implements Serializable 
    {
    	private static final long serialVersionUID= 1L;
    	
        public static String name  = null;
        public int  id = 0;
        public  double balance = 0;
        public  Date date   = new Date(6,8,2020);
        
        @Override
        public String toString()
        {
			return this.name +"-"+this.id +"-"+this.balance +"-" +this.date;
        	
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("G:\\FULL STACK JAVA\\CORE JAVA\\seracc.txt"));

        Account acc = new Account();
        acc.name   = "Sandeep";
        acc.id     = 401;
        acc.balance= 10000;
        acc.date=new Date(20,02,2020);

       /*Account acc1 = new Account();
        acc1.name   = "Swadhin";
        acc1.id     = 201;
        acc1.balance= 20000.89;
        acc.date=new Date(19,05,2020);*/

        objectOutputStream.writeObject(acc);
      //  objectOutputStream.writeObject(acc1);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("G:\\FULL STACK JAVA\\CORE JAVA\\seracc.txt"));
         
         //for (int i=0;i<2 ;i++ ) 
      // {
             
        System.out.println((Account) objectInputStream.readObject());
   
   
 //   }
        objectInputStream.close();
    }
}
