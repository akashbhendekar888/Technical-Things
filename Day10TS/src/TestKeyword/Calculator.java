package TestKeyword;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the first number::");
		int num1=scan.nextInt();
		
		System.out.println("Enter the second number::");
		int num2=scan.nextInt();
		
		System.out.println("Which is Arithmatic Operation you want to perform::");
		char operator=scan.next().charAt(0);
	    
		switch(operator) {
		
		case '+': System.out.println(num1+num2);
		     break;
		     
		case '-': System.out.println(num1-num2);
	     break;
	     
		case '*': System.out.println(num1*num2);
	     break;
	     
		case '/': 
		          if(num2==0) {
   		                  System.out.println("Invalid Operation");
   	                      }else {
   		              System.out.println(num1/num2);
   	                    } break;
	     
		case '%': System.out.println(num1%num2);
	     break;
	     default:
	    	 System.out.println("Invalid Inputs");
	    	 
		}
	}

	
	
}
