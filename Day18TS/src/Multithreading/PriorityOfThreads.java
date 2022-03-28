package Multithreading;
import java.io.*;
public class PriorityOfThreads extends Thread{
	public void run() {
		for(int i=0;i<1;i++) {
			System.out.println("Thread priority is::"+Thread.NORM_PRIORITY);
			System.out.println("Count of Threads::"+Thread.activeCount());
			System.out.println("Current Thread is::"+Thread.currentThread());
			System.out.println(""+Thread.holdsLock(10));
			
			}
	}
		public static void main(String[]args) {
		PriorityOfThreads pof=new PriorityOfThreads();
		pof.start();
		pof.getId();
		}
		
	}
	


