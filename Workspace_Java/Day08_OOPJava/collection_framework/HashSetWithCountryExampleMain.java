package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetWithCountryExampleMain {

	public static void main(String[] args) {
		Set<County> country=new HashSet<>();
		County ind= new County();
		County usa= new County("USA","Washington");
		County japan= new County("Japan","Tokyo");
		County ger= new County("Germany", "Berlin");
		County fra= new County("france", "PAris");
		country.add(ind);
		country.add(usa);
		country.add(ger);
		country.add(fra);
		country.add(japan);
		country.add(new County("Japan","Tokyo"));//it breaks the rules of prevents 
		//duplicate rules 
		//bz it will check memory and thats why it will be added in row override equals method
		
		//if you want to prevents duplicates use the equals method in country class
		for(County ctr:country)
			System.out.println(ctr);

	}

}
