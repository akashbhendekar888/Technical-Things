package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void  main(String args[]) {
		LinkedHashSet<Integer>set1=new LinkedHashSet();
		set1.add(52);
		set1.add(53);
		set1.add(54);
		set1.add(55);
		set1.add(56);
		set1.add(57);
		set1.add(58);
		set1.add(59);
		System.out.println(set1);
		for(int i:set1)
		System.out.println(i);
		
		
		}

}