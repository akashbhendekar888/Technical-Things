package Multithreading;

import java.io.IOException;

public class TestThread extends Thread{
	public  void run()  {
		
		for(int i=0;i<=2;i++) {
		System.out.println("Thread run succesfully::"+Thread.MAX_PRIORITY);
		}
		try {
		Thread.sleep(8000);
		System.out.println("Thread sleeping for 8 second");
		}catch(Exception e) {System.out.println(e);}
		System.out.println("Current Thread Name is::"+Thread.currentThread().getName());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread t=new TestThread();
		t.start();
	    t.setName("Thread1");
		System.out.println("Thread ID::"+t.getId());
	}

}
