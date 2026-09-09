package io_programming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteExampleMain {
	public static void main(String[] args) {
		String filePath="./src/resources/games.txt";
		//value through indicates APPEND mode is enabled
		try(FileOutputStream fout=new FileOutputStream(filePath,true)){
			String gamesData="\n4.Badmiton \n5.Play \n5.Cricket \n6. basebball";
			byte[] data=gamesData.getBytes();
			fout.write(data);
			System.out.println("Data is written successfully");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
}

/*

* Feature: File Writing using FileOutputStream
*
* FileOutputStream is used to write data into a file.
*
* In this example:
* 1. FileOutputStream opens/creates the games.txt file.
* 2. String data is converted into a byte array using getBytes().
* 3. fout.write(data) writes the byte data into the file.
* 4. Try-with-resources automatically closes the FileOutputStream.
*
* Important:
* * If the file does not exist, it will be created.
* * If the file already exists, its old content will be overwritten.
* * getBytes() converts String data into bytes because
* FileOutputStream works with byte data.
*
* Example data written:
* 1. soccer
* 2. Cricket
* 3. Tennis
*
* Advantage of Try-with-Resources:
* The FileOutputStream is automatically closed after the
* try block, so we do not need to call fout.close() manually.
  */
