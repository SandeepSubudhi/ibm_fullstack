package com.junittest;

public class ComplexNumberAddition {

	public double real;
	 public double imaginary;

	public ComplexNumberAddition(double real,double imaginary){
	this.real=real;
	this.imaginary=imaginary;
  }

	public ComplexNumberAddition add(ComplexNumberAddition c){
	double sreal=this.real+c.real;
	double simaginary=this.imaginary + c.imaginary;
	ComplexNumberAddition temp =new ComplexNumberAddition(sreal,simaginary);
	return temp;
 }
	



}