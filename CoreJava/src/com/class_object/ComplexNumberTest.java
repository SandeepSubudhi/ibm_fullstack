package com.class_object;
class ComplexNumber{
		private int real;
		private int img;
		public ComplexNumber(int x,int y)
			{
			this.real=x;
			this.img=y;
			}	
		public ComplexNumber add(ComplexNumber n)
		{
			int myreal=this.real+n.real;
			int myimg=this.img+n.img;
			ComplexNumber temp=new ComplexNumber(myreal,myimg);
			return temp;  
		}
		public ComplexNumber sub(ComplexNumber n)
		{
			int myreal=this.real-n.real;
			int myimg=this.img-n.img;
			ComplexNumber temp1=new ComplexNumber(myreal,myimg);
			return temp1;  
		}
		public int getReal()
		{
			return this.real;
		}
		public int getImg()
		{
			return this.img;
		}
	/*	public ComplexNumber swap(ComplexNumber cn[])
		{
			ComplexNumber temp;
			temp=cn[0];
			cn[0]=cn[1];
			cn[1]=temp;
		}
		public String toString(){
			return this.getReal()+"+"+this.getImg()+"i";
		}*/
		
}
public class ComplexNumberTest{
		public static void main(String args[])
		{
				ComplexNumber n1=new ComplexNumber(15,9);
				ComplexNumber n2=new ComplexNumber(4,7);
				ComplexNumber temp=n1.add(n2);
				ComplexNumber temp1=n1.sub(n2);
				//System.out.println("Result of Addition= "+temp.getReal()+" + " +temp.getImg()+"i");
				//System.out.println("Result of Substraction= "+temp1.getReal()+" + " +temp1.getImg()+"i");
				System.out.println("Result="+temp);
					System.out.println("Result="+temp1);
		}
		
		
}