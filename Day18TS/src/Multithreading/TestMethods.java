package Multithreading;
import java.io.*;
public class TestMethods extends Thread {
	  TestMethods(String threadName){
		 super(threadName);
		
		 }
	 public void run() {
		 System.out.println("The Thread is Executing");
		 try {
			 
			 Thread.sleep(7000);
		 }catch(Exception e) {System.out.println(e);}
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethods tm=new TestMethods("Thread1");
        TestMethods tm2=new TestMethods("ThreadABC");
        
        tm2.start();
        System.out.println("The Thread Name is::"+tm.getName());
        System.out.println("The changing Name of Thread is::"+tm2.getName());
	}

}
