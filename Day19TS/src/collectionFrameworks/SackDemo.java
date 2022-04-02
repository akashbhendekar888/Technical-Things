package collectionFrameworks;

import java.util.Stack;

public class SackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Float>list1=new Stack();   //LIFO datastructure of stack
		list1.push(1.52f);               //use push method for adding data element in a stack top
		list1.push(5.52f);
		list1.push(4.56f);
		list1.push(5.52f);
		list1.push(5.64f);
		list1.push(6.26f);
		list1.push(8.25f);
		System.out.println(list1);
		
		for(float element:list1)
		System.out.println("Stack element ::"+element);
		
		System.out.println("Delete top element::"+list1.pop());  //use pop method for deleting data element of a top
		System.out.println("Stack is Empty::"+list1.isEmpty());
		System.out.println("Size of stack::"+list1.size());
		
		
		

	}

}
