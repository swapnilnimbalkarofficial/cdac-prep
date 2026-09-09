package io_programming;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferReaderForObjectCreationExampleMain {

	public static void main(String[] args) {
		String filePath="./src/resources/mobiles_numbers.txt";//
		try(FileReader fr=new FileReader(filePath);
				BufferedReader br= new BufferedReader(fr)){
			while(true) {
				String line=br.readLine();
				if(line==null)
					break;
				String[] tokens=line.split("-");
				String country_code=tokens[0];
				String mobile_no=tokens[1];
				MobileNumber mobNum= new MobileNumber(country_code,mobile_no);
				System.out.println(mobNum);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}



/*

* Feature: BufferedReader - Object Creation from File Data
*
* In this example, data is read line by line from a text file
* and each line is converted into a MobileNumber object.
*
* Example file data:
* +91-9876543210
*
* Program flow:
*
* 1. FileReader reads character data from the file.
* 2. BufferedReader reads the file line by line using readLine().
* 3. split("-") separates the country code and mobile number.
* 4. MobileNumber object is created using the constructor.
* 5. toString() is used to print the object data.
*
* Example:
*
* String[] tokens = line.split("-");
*
* tokens[0] -> country code
* tokens[1] -> mobile number
*
* MobileNumber mobNum =
* ```
     new MobileNumber(country_code, mobile_no);
  ```
*
* Important:
*
* BufferedReader -> reads text line by line
* split()        -> separates String data
* Constructor    -> creates object with data
* toString()     -> converts object data into String
*
* Developer use:
* This approach is useful when data is stored in a simple
* text/CSV-like format and needs to be converted into Java objects.
  */
