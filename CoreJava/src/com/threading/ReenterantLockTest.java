package com.threading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterantLockTest extends Frame implements Runnable {

	Thread t1,t2,t3;
	private static final long serialVersionUID = 1L;
	int y1 = 400, y2 = 400, y3 = 400;
	int c=0;
	public ReenterantLockTest() {
		super("Oval game Syan");
			t1=new Thread(this);
			t2=new Thread(this);
			t3=new Thread(this);
			t1.setName("RED BALL");
			t2.setName("GREEN BALL");
			t3.setName("BLUE BALL");
			t1.start();
			t2.start();	
			t3.start();
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
		
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) {
		Frame mf = new ReenterantLockTest();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

	@Override
	public void run() {
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("RED BALL"))
		{
			while(true) 
			{
				for(int i=y1;y1>50;i--)
					{
						y1=y1-3;
						repaint();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				c++;
				try {
					counter();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(y1<=50)
				{
					for(int i=y1;y1<400;i++)
					{
						y1=y1+3;
						repaint();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}c++;
				try {
					counter();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
			else if(currentThread.getName().equals("GREEN BALL"))
			{
				while(true) 
				{
					for(int i=y2;y2>50;i--)
					{
						y2=y2-3;
						repaint();
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}c++;
					try {
						counter();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(y2<50)
					{
						for(int i=y2;y2<400;i++)
						{
							y2=y2+3;
							repaint();
							try {
								Thread.sleep(20);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}c++;
					try {
						counter();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		
			else if(currentThread.getName().equals("BLUE BALL"))
			{
				while(true) 
				{
					for(int i=y3;y3>50;i--)
					{
						y3=y3-3;
						repaint();
						try {
							Thread.sleep(30);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					c++;
					try {
						counter();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(y3<50)
					{
						for(int i=y3;y3<400;i++)
						{
							y3=y3+3;
							repaint();
							try {
								Thread.sleep(30);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}c++;
					try {
						counter();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		
		
	}
	ReentrantLock lock=new ReentrantLock();
	Condition c1=lock.newCondition();
	public  void counter() throws InterruptedException
	{
		lock.lock();
		//System.out.println(c);
		try {
			if(c==3)
			{ 
				c=0;
				c1.signalAll();
			}
			else 
			{
				c1.await();
				
			}
		}
		finally {
			lock.unlock();
		}
	}
}
