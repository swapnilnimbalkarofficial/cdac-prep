//feature try-with-resources

package io_programming;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputStreamExampleMain {

	public static void main(String[] args) {
		String filePath="./src/resources/cartoons.txt";
		try(FileInputStream fin=new FileInputStream(filePath);
				BufferedInputStream bin=new BufferedInputStream(fin)){
			while(true) {
				int charVal =bin.read();//Stream is getting close
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

* Feature: BufferedInputStream
*
* BufferedInputStream is used to read data efficiently from
* an input stream by using an internal buffer.
*
* In this example:
*
* 1. FileInputStream is used to connect to the cartoons.txt file.
*
* 2. BufferedInputStream wraps the FileInputStream:
*
* ```
   BufferedInputStream bin = new BufferedInputStream(fin);
  ```
*
* It reads data in blocks and stores it in a buffer.
* This reduces direct read operations from the file and
* improves performance.
*
* 3. bin.read() reads data from the BufferedInputStream.
*
* 4. read() returns -1 when the end of the file is reached.
*
* 5. The byte value is converted into a character and printed.
*
* 6. Try-with-resources automatically closes both streams
* after the try block is completed.
*
* Important:
*
* ```
   FileInputStream
  ```
* ```
         ↓
  ```
* ```
   BufferedInputStream
  ```
* ```
         ↓
  ```
* ```
       Program
  ```
*
* BufferedInputStream is a subclass of FilterInputStream.
*
* Advantage:
* * Improves input performance.
* * Reduces the number of direct file read operations.
* * Uses an internal buffer.
* * Automatically closes resources when used with
* try-with-resources.
  */
