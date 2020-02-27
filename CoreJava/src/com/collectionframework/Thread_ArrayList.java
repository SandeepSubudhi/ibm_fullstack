//It wont work because it is fail fast(ArrayList)
/*package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Thread_ArrayList implements Runnable{
	Thread t1,t2;
private static List<String> arrayList = new ArrayList<String>();
	public Thread_ArrayList() {
		t1=new Thread(this);
		t2=new Thread(this);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		
		new Thread_ArrayList();
	}
	@Override
	public void run() {
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("Thread1"))
		{
			for(int i=0;i<30;i++)
			{
				arrayList.add("Sandeep");
				arrayList.add("Adarsh");
				try {
					Thread.sleep(200);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			}
		}
		else
		{
			for(int i=0;i<30;i++)
			{
				Iterator<String> itr = arrayList.iterator();
				while(itr.hasNext()) {
					String name = itr.next();
					System.out.println(name);
					try {
						Thread.sleep(380);
						} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
				}
				}
				
		}
	}

}*/
/*//Fail-safe(CopyOnWriteArrayList)
package collectionframework;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Thread_ArrayList implements Runnable{
	Thread t1,t2;
private static CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<String>();
	public Thread_ArrayList() {
		t1=new Thread(this);
		t2=new Thread(this);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		
		new Thread_ArrayList();
	}
	@Override
	public void run() {
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("Thread1"))
		{
			for(int i=0;i<30;i++)
			{
				arrayList.add("Sandeep");
				arrayList.add("Adarsh");
				try {
					Thread.sleep(200);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			}
		}
		else
		{
			for(int i=0;i<30;i++)
			{
				Iterator<String> itr = arrayList.iterator();
				while(itr.hasNext()) {
					String name = itr.next();
					System.out.println(name);
					try {
						Thread.sleep(380);
						} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
				}
				}
				
		}
	}

}*/
package com.collectionframework;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Thread_ArrayList implements Runnable{
	Thread t1,t2;
private static ConcurrentHashMap<String,String> map= new ConcurrentHashMap<String,String>();
	public Thread_ArrayList() {
		t1=new Thread(this);
		t2=new Thread(this);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		
		new Thread_ArrayList();
	}
	@Override
	public void run() {
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("Thread1"))
		{
			for(int i=1;i<30;i++)
			{
				map.put(Integer.toString(i),"Subudhi");
				//map.put("Adarsh","Rout");
				try {
					Thread.sleep(200);
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			}
		}
		else
		{
			for(int i=0;i<30;i++)
		{
				Iterator<String> itr = map.keySet().iterator();
				while(itr.hasNext()) {
					String name = itr.next();
					System.out.println(name);
					try {
						Thread.sleep(380);
						} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
				}
				}
				
		}
	}

}

