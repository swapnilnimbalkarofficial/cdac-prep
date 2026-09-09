package collection_framework;

import java.util.Vector;

public class VectorExampleMain {
	public static void main(String[] args) {
		Vector myVector = new Vector();

		System.out.println("Size: " + myVector.size());
		System.out.println("Capacity: " + myVector.capacity());

		System.out.println("--------------------");

		for (int count = 0; count <= 10; count++)
			myVector.add(count);

		System.out.println("Size: " + myVector.size());
		System.out.println("Capacity: " + myVector.capacity());                                       

		System.out.println("--------------------");

		myVector.add(11);

		System.out.println("Size: " + myVector.size());
		System.out.println("Capacity: " + myVector.capacity());
	}
}
