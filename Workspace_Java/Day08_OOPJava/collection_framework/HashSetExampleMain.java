package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleMain {

	public static void main(String[] args) {
		Set<String> countries= new HashSet();//type safe
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("Japan");
		countries.add("Japan");
		countries.add("Japan");
		countries.add("Chaina");//prevents duplicates
		System.out.println("Size: "+countries.size());
		for(String country: countries)
			System.out.println(country);
	}

}
