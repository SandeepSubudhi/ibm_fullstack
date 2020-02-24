package com.threading;

/* 	//has-a Relationship
public class PingPongTest implements Runnable {

Thread t1,t2;
public PingPongTest() {
t1=new Thread(this);
t2=new Thread(this);
t1.setName("Ping");
t2.setName("Pong");
t1.start();
t2.start();
}
public static void main(String[] args) {
// TODO Auto-generated method stub
new PingPongTest();

}
@Override
public void run() {
Thread currentThread=Thread.currentThread();
if(currentThread.getName().equals("Ping"))
{
for(int i=0;i<30;i++)
{
System.out.println("\tPING");
try {
Thread.sleep(300);
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
System.out.println("PONG");
try {
Thread.sleep(380);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}
}
}

}*/

/*//Is-a relationship

public class PingPongTest extends Thread {

public PingPongTest(String threadName) {

super.setName(threadName);
super.start();
}
public static void main(String[] args) {
// TODO Auto-generated method stub
new PingPongTest("PING");
new PingPongTest("PONG");

}
@Override
public void run() {
Thread currentThread=Thread.currentThread();
if(currentThread.getName().equals("PING"))
{
for(int i=0;i<30;i++)
{
System.out.println("\tPING");
try {
Thread.sleep(300);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}
}
else if(currentThread.getName().equals("PONG"))
{
for(int i=0;i<30;i++)
{
System.out.println("PONG");
try {
Thread.sleep(380);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}
}
}

}*/

/*anonymous Inner class
public class PingPongTest extends Thread {

public static void main(String[] args) {

Runnable r1 = new Runnable() {
public void run() {
for(int i=0;i<20;i++) {
System.out.println("PING");
try {
Thread.sleep(500);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
};
Runnable r2 = new Runnable() {
public void run() {
for(int i=0;i<20;i++) {
System.out.println("\tPONG");
try {
Thread.sleep(300);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
};

Thread t1 = new Thread(r1);
Thread t2 = new Thread(r2);
t1.start();
t2.start();
}
}
*/

public class PingPongTest extends Thread
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable() 
		{
			public void run() 
			{
				for(int i=0;i<20;i++)
				{
					System.out.println("PING");
					try
					{
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("\tPONG");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable r3 = new Runnable() {
			public void run() {
				for(;;) {
					System.out.println("\t\tTONG");
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3=new Thread(r3);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		}
}
