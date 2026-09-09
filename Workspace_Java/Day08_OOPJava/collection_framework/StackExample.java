package collection_framework;

import java.util.Stack;

import io_programming.Person;

public class StackExample {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.add("Swapnil");
		stack.add("Welcome to colection");
		stack.add("AI is booming");
		stack.add(20);
		stack.add(new Person("Rahul", "Gandhi",54));
		stack.add(2.58);
		int marks=364;
		stack.add(marks);//autoboxing add(new Integer() Automatically created warapper and pass the value
		float myPercettage=83.50f;
		stack.add(myPercettage);
		boolean pass=true;
		stack.add(pass);
		System.out.println(stack);
		int size=stack.size();
		System.out.println(size);
		System.out.println("---------traditional Loop---------");
		for(int index=0; index<size; index++) {
			Object val=stack.get(index);
			System.out.println(val);
		}
		System.out.println("---------For Each Loop---------");
		for(Object val:stack) {
			System.out.println(val);
		}

	}

}
