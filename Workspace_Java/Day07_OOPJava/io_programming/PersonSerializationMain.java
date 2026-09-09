package io_programming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class PersonSerializationMain {

	public static void main(String[] args) {
		String filePath="./src/resources/person.txt";
		try(
				FileOutputStream fout= new FileOutputStream(filePath);
				ObjectOutputStream out= new ObjectOutputStream(fout);
				){
			Person personObject=new Person("Smriti","Mandana",30);
			out.writeObject(personObject);
			System.out.println("Person is serilized");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
