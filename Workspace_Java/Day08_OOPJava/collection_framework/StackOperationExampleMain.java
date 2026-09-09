package collection_framework;

import java.util.Stack;

public class StackOperationExampleMain {

	public static void main(String[] args) {
		Stack stack= new Stack();
		stack.push("Swapnil");
		stack.push("Ramesh");
		stack.push("Rahul");
		stack.push("Harish");
		stack.push("Ketan");
		stack.push("Ajay");
		stack.push("MAngesg");
		stack.push("Mayur");
		System.out.println("Before removing: ");
		for(Object names: stack) 
			System.out.println(names);
		
		stack.remove(3);
		stack.remove(1);
		
		System.out.println("After Removing: ");
		for(Object names: stack) 
			System.out.println(names);
		int valSize=stack.size();
		System.out.println("-----------------------------------");
		System.out.println("Val size of elements push: "+valSize);
		System.out.println("------------------------------------");
		Object poped= stack.pop();
		System.out.println("Poopped object: "+poped);
		System.out.println("current size: "+valSize);
		System.out.println("-----------------peek()---------------");
		Object peekedObj= stack.peek();
		System.out.println("Poopped object: "+poped);
		System.out.println("current size: "+valSize);
		
	}

}
