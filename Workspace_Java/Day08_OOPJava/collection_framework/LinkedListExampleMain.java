package collection_framework;

import java.util.LinkedList;

public class LinkedListExampleMain {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add("Fan");
		list.add("TubeLiaght");
		list.add("Washing m");
		list.add("Mixer");
		list.add("microwav");
		for(Object homeap:list)
			System.out.println(homeap);
		System.out.println("--------------------");
		
		list.removeFirst();
		list.removeLast();
		for(Object homeap:list)
			System.out.println(homeap);
		System.out.println("First: "+list.getFirst());
		System.out.println("Last: "+list.getLast());
	}

}
