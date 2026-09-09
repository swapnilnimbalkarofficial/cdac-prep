package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class TypeUnsafeCollectionExampleMain {

	public static void main(String[] args) {
		List city= new ArrayList();//this collection not safe 
		city.add("satara");
		city.add("Pune");
		city.add("Mumbai");
		city.add("Nashik");
		city.add("Ahilyanagar");
		//runtime error type unsafe 
		city.add(100);//casting fails bcz String and Integer are siblings
		for(Object obj: city) {
			String cities=(String)obj;
			System.out.println(cities.toUpperCase());
		}
	}

}