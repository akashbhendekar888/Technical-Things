package MyPack;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list1=new ArrayList();
		list1.add("Java");
		list1.add("Python");
		list1.add("C#");
		list1.add("PHP");
		list1.add(".NET");
    System.out.println("ArrayList Length:"+list1.size());
	Collections.sort(list1);
	for(String languages:list1) 
		System.out.println("Languages of Back End::"+languages);
	System.out.println(" ");
	System.out.println(" ");
		
	ArrayList<Integer>list2=new ArrayList();
	list2.add(32);
	list2.add(56);
	list2.add(52);
	list2.add(8);
	list2.add(54);
	list2.add(3);
	list2.add(32);
	
	System.out.println("ArrayList Length:"+list2.size());
	System.out.println("Returning Array Elements::"+list2.get(1));
	System.out.println("Set the Elements 78::"+list2.set(1,78));
	Collections.sort(list2);
	for(Integer i:list2)
		System.out.println("Integer Values::"+i);

	}

}
