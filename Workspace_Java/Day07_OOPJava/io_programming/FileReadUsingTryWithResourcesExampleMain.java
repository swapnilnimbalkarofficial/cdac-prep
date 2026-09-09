//feature try-with-resources

package io_programming;

import java.io.FileInputStream;

public class FileReadUsingTryWithResourcesExampleMain {

	public static void main(String[] args) {
		String filePath="./src/resources/cartoons.txt";
		try(FileInputStream fin=new FileInputStream(filePath)){
			while(true) {
				int charVal =fin.read();//Stream is getting close
				if(charVal==-1)//checking for end of file 
					break;
				char ch=(char)charVal;
				System.out.print(ch);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*

Feature: Try-with-Resources


Try-with-resources is a feature introduced in Java 7.
It is used to automatically close resources such as
FileInputStream, FileOutputStream, BufferedReader, etc.


The resource must implement AutoCloseable or Closeable.


In this example, FileInputStream is automatically closed
when the try block finishes, even if an exception occurs.


fin.read() reads one byte at a time from the file.
It returns -1 when the end of the file is reached.


Advantage:


Automatically closes the resource.


Prevents resource leaks.


No need to explicitly call close().


Makes code shorter and safer.
*/
