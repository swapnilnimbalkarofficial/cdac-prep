package io_programming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExampleMain {

	public static void main(String[] args) {
		String filePath="./src/resources/cartoons.txt";
		FileInputStream fin=null;
		try {
			fin=new FileInputStream(filePath);//stream is open for reading
			while(true) {
				int charVal =fin.read();
				if(charVal==-1)
					break;
				char ch=(char)charVal;
				System.out.print(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();//stream is close
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
