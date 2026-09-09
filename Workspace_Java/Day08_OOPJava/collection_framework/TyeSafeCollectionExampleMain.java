package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class TyeSafeCollectionExampleMain {
	public static void main(String[] args) {
		List<String> cities= new ArrayList<>();//type safe this string going to 
		//hold only String objects
		
		cities.add("Mumbai");
		cities.add("Mumbai");
		cities.add("Nashik");
		cities.add("Ahilyanagar"); 
		//cities.add(100);
		for(Object obj: cities) {
			String city=(String)obj;
			System.out.println(city.toUpperCase());
		}
	}
}
