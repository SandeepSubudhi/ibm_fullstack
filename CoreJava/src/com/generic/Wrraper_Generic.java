package com.generic;
 class GenericWrapper<T>
 {
	 private T t;

	public GenericWrapper(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	} 
 }
public class Wrraper_Generic {

	public static void main(String[] args) 
	{
		GenericWrapper<Integer> gwrap=new GenericWrapper<Integer>(132);
		int x=gwrap.getT();	
		System.out.println(x);
	}
}
