package collection_framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExampleMain {

	public static void main(String[] args) {
		Map<String ,County> countryMap=new HashMap<>();
		County ind= new County();
		County usa= new County("USA","Washington");
		County japan= new County("Japan","Tokyo");
		County ger= new County("Germany", "Berlin");
		County fra= new County("france", "Paris");
		countryMap.put("IND", ind);
		countryMap.put("USA", usa);
		countryMap.put("Germany", ger);
		countryMap.put("France", fra);
		//fetching set of keyss from map
		//first approrach 
		Set<String> allKeys= countryMap.keySet();
		for(String currentKey:allKeys) {
			County currentValue=countryMap.get(currentKey);
			System.out.println("Key: "+currentKey);
			System.out.println("Value: "+currentValue);
			System.out.println("------------------------");
		}
		System.out.println("=========================================");
		//fetching the set of entries 
		Set<Map.Entry<String, County>> 
		setEntries=countryMap.entrySet();
		
		for(Map.Entry<String, County> currentEntry: setEntries) {
			String key=currentEntry.getKey();
			County value=currentEntry.getValue();
			System.out.println("Key: "+key);
			System.out.println("Value: "+value);
			System.out.println("-------------------------------------------");
		}
		System.out.println("=========================================");
		//fetching values directly 
		Collection<County> allCountries=countryMap.values();
		for(County currerntCountry: allCountries)
			System.out.println(currerntCountry);
		
		
	}

}
