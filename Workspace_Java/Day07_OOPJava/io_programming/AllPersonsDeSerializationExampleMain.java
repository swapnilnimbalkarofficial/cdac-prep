package io_programming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class AllPersonsDeSerializationExampleMain {

	public static void main(String[] args) {
		String filePath="./src/resources/all_person.txt";
		try(
				FileOutputStream fout= new FileOutputStream(filePath);
				ObjectOutputStream out= new ObjectOutputStream(fout);
				){
			Person p1=new Person("Smriti","Mandana",30);
			Person p2=new Person("Saina","Nehval",39);
			Person p3=new Person("Ashok","Saraf",67);
			Person p4=new Person("Nana","Patekar",67);
			Person p5=new Person("Sonu","Sood",57);
			Person[]all_person= {p1,p2,p3,p4,p5};
			out.writeObject(all_person);
			System.out.println("All person Serialized.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
