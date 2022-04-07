package Generics;

public class TestGenericClass{
     public static <E>void print(E[]elements) {
    	 for(E element:elements) {
    		 System.out.println(element);
    	 }
    	 System.out.println();
    		 
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] array= {10,20,30,40,50,60,70,80,90,100};
		Character[]chararray= {'A','K','A','S','H'};
		
		System.out.println("Print the Integer Array");
		print(array);
		System.out.println("Print the character Array");
        print(chararray);
	}

}