package MyPack;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String args[]) {
		LinkedList<Integer>elements=new LinkedList<Integer>();
		System.out.println();
		elements.add(2);
		elements.add(4);
		elements.add(6);
		elements.add(8);
		elements.add(10);
		elements.add(12);
		
		
		for(Integer i:elements) {
			System.out.println(i);
		}
		
		elements.add(1,12);
		System.out.println("Add the elements to first Index::\n"+elements);
		
		
		elements.addAll(elements);
		System.out.println(elements);
		
		elements.addFirst(22);
		System.out.println("Elements are add First position::\n"+elements);
		System.out.println("  ");
		System.out.println("get the last elements ::\n"+elements.getLast());
		System.out.println("  ");
		System.out.println("get the first elements::\n"+elements.getFirst());
		System.out.println("  ");
		
		System.out.println("peek the first elements::\n"+elements.peek());
		System.out.println("  ");
		System.out.println("Remove the first elements::\n"+elements.removeFirst());
		System.out.println(" ");
		System.out.println("Remove the last elements::\n"+elements.removeLast());
		System.out.println("  ");
		
		System.out.println(" \n"+elements);
		
		
	
	}

}
