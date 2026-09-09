package io_programming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExampleMain {

	public static void main(String[] args) {
		String filePath="./src/resources/cartoons.txt";
		try(
				FileReader fr=new FileReader(filePath);
				BufferedReader br= new BufferedReader(fr)
				){
			while(true) {
				String line=br.readLine();
				if(line==null)
					break;
				System.out.println(line);
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*

* Feature: BufferedReader
*
* BufferedReader is used to read text data efficiently.
* It reads characters from a Reader and provides buffering.
*
* In this example:
*
* 1. FileReader connects to the cartoons.txt file.
* 2. BufferedReader wraps the FileReader.
* 3. readLine() reads one complete line at a time.
* 4. readLine() returns null when the end of the file is reached.
* 5. Try-with-resources automatically closes both readers.
*
* Important methods:
* readLine() -> reads one line
* read()     -> reads one character
*
* Difference:
*
* FileReader
* -> Reads character data from a file.
*
* BufferedReader
* -> Wraps a Reader and provides buffering.
* -> Can read data line by line using readLine().
*
* BufferedReader is useful when reading text files,
* especially when we need to process data line by line.
  */
