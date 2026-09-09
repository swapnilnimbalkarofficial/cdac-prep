package io_programming;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationExampleMain {

	public static void main(String[] args) {
		String filePath="./src/resources/all_person.txt";
		try(
				FileInputStream fin= new FileInputStream(filePath);
				ObjectInputStream in= new ObjectInputStream(fin);
				){
			Object obj=in.readObject();
			Person[] allAvailablePerson=(Person[])obj;
			for(Person currentPerson: allAvailablePerson) {
				System.out.println(currentPerson);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


/*

* Feature: Deserialization
*
* Deserialization is the process of converting a byte stream
* back into a Java object.
*
* In this example:
*
* 1. FileInputStream reads the serialized file.
* 2. ObjectInputStream reads the serialized object.
* 3. readObject() returns the object as Object type.
* 4. The Object is type-casted to Person[].
* 5. The Person objects are accessed using a for-each loop.
*
* Important:
*
* Object obj = in.readObject();
*
* Person[] allAvailablePerson = (Person[]) obj;
*
* readObject() returns Object, so type casting is required
* when we know the actual object type.
*
* Requirements:
* * Person must implement Serializable.
* * The class structure should be compatible with the
* ```
   serialized data.
  ```
*
* Interview point:
*
* Serialization:
* ```
     Object -> Byte Stream
  ```
*
* Deserialization:
* ```
     Byte Stream -> Object
  ```
*
* Common methods:
* writeObject() -> Serialization
* readObject()  -> Deserialization
  */
