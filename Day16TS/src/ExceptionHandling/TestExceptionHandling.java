package ExceptionHandling;
public class TestExceptionHandling {              //Exception-handle the runtime error and maintain the normal flow of application

	public static void main(String[] args) {       //two type exception checked and unchecked exception
		// TODO Auto-generated method stub
		try {                                     //try and catch block -handle the runtime error     
		int a=70/0;
		System.out.println(a);
		}catch(ArithmeticException ee) {System.out.println(ee);}  //unchecked exception-Arithmetic Exception
		 System.out.println("Programming langauge"); 
		    
		     try {
		    String s=null;
		    System.out.println(s.length());
		    }catch(Exception e) {System.out.println(e);}        //Null pointer Exception 
		System.out.println("Java Programs");
		
		try {
		int arr[]= {7,3,33,3,23};
		System.out.println(arr[20]);
		}catch(Exception es) {System.out.println(es);}        //ArrayIndexOutOfBoundException
		System.out.println("Exception Handling");
		
		try {
			String text="java";
		int num=Integer.parseInt(text);
		System.out.println(text);
		}catch(NumberFormatException ep) {System.out.println(ep);} //NumberFormatException
		System.out.println("It's Posible in java");
		try {
			String sp="Array Name";
		
			System.out.println(sp.charAt(40));
		}catch(Exception ea) {System.out.println(ea);}             //StringIndexOutOfBoundException
		finally {                                          //Finally Block-create a block of code that follows a try or catch block
		System.out.println("Successfully  Handling Exception");
		}
		
	}
	
}
