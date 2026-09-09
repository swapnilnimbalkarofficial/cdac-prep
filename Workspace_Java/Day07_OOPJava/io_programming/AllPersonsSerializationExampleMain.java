package io_programming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class AllPersonsSerializationExampleMain {

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


/*

* Feature: Serialization of Multiple Objects
*
* In this example, multiple Person objects are created and
* stored inside a Person array.
*
* Program flow:
*
* 1. Create multiple Person objects.
* 2. Store all objects in a Person[] array.
* 3. ObjectOutputStream is used to serialize the array.
* 4. writeObject(all_person) writes the complete array
* and its objects into the file.
* 5. Try-with-resources automatically closes the streams.
*
* Important:
*
* Person must implement Serializable.
*
* Person[] all_person = {p1, p2, p3, p4, p5};
*
* out.writeObject(all_person);
*
* Here, the complete array is serialized, including all
* Person objects inside it.
*
* Developer use:
* When multiple objects need to be stored together,
* they can be placed in an array or collection and
* serialized as a single object.
*
* Interview point:
*
* Serialization   -> Object to Byte Stream
* Deserialization -> Byte Stream to Object
  */
