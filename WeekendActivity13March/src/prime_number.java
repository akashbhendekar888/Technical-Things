
public class prime_number {
	
	     public static void main(String args[]) {
	    	   int n=20;
	    	   int count;
	    	   int j;
	    	   System.out.println("print the prime number untill the "+n);
	    	 for(int i=2;i<=n;i++) {
	    		 count=0;
	    		 for( j=1;j<=i;j++) {
	    			 if(i%j==0) {
	    				 count++; 
	    	             }
	    			 
	    		 }if(count==2) {System.out.println(i+" ");}	 
	        }
	    	 
	     }
	}
	     

	//
	//import java.util.Scanner;
	//class primitive_datatypes
	//{
//		public static void main(String arg[])	
//		{
//		int i,count;
//	              
//		int n=100;
//	               System.out.println("Prime numbers between 1 to "+n+" are ");
//		for(int j=2;j<=n;j++)
//		{
//		count=0;
//		for(i=1;i<=j;i++)
//		{
//		   if(j%i==0)
//		   {
//		        count++;        
//		   }
//		}
//		if(count==2)
//		       System.out.print(j+"  ");     
//		}
//		}
	//}



