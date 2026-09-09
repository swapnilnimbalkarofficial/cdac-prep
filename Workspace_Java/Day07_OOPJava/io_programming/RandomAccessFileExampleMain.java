package io_programming;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExampleMain {

	public static void main(String[] args) {
		String filePath="./src/resources/mobiles_numbers.txt";
		try(RandomAccessFile rf=new RandomAccessFile(filePath,"r")){
			long fileSize=rf.length();
			long midPosition=fileSize/2;
			rf.seek(midPosition);
			while(true) {
				int charVal =rf.read();//Stream is getting close
				if(charVal==-1)//checking for end of file 
					break;
				char ch=(char)charVal;
				System.out.print(ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


/*

* Feature: RandomAccessFile
*
* RandomAccessFile is used to read or write data from any
* specific position of a file.
*
* In this example:
*
* 1. "r" opens the file in read mode.
* 2. length() gets the total file size.
* 3. seek() moves the file pointer to a specific position.
* 4. read() reads data from the current file pointer position.
* 5. -1 indicates the end of the file.
* 6. Try-with-resources automatically closes the file.
*
* Important methods:
* length() -> returns file size
* seek()   -> moves file pointer
* read()   -> reads one byte
*
* RandomAccessFile is useful when we need to directly access
* a particular position of a large file.
*
* Modes:
* "r"  -> Read only
* "rw" -> Read and Write
  */

