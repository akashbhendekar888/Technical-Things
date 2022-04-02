
package CollectionFramework;

import java.util.LinkedList;          //use a doubly linked list to store the elements

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<Integer>list1=new LinkedList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);                 //add element
		list1.add(50);
		list1.add(60);
		for(int element:list1) 
		System.out.println(element);
		System.out.println("Peek the First element in the list::"+list1.peek());   
		System.out.println("Remove the third element::"+list1.remove(3));          //delete element
		

	}

}