package Generics;

import java.util.ArrayList;

public class TestGenerics {

	public static void main(String[] args) {
		//before the generics
		ArrayList number=new ArrayList();
		 number.add("Akash");
		 number.add(100);
		 number.add(72.54);
		 number.add("a");
		 System.out.println(number);
		 
		 //after the generics
		 ArrayList<Integer>list1=new ArrayList();
		 list1.add(55);
		 list1.add(54);
		 System.out.println(list1);
		 
		 

	}

}
