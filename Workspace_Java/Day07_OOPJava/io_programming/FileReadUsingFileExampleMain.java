package io_programming;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class FileReadUsingFileExampleMain {

	public static void main(String[] args) {
		String filePath="./src/resources/cartoons.txt";
		File file=new File(filePath);
		if(file.isFile() && file.exists()) {
			long fileSize =file.length();
			byte[] data=new byte[(int)fileSize];
			try (FileInputStream fin= new FileInputStream(file);
					BufferedInputStream bin= new BufferedInputStream(fin);
					){
				bin.read(data);
				String fileData= new String(data);
				System.out.println(fileData);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("unable to proceed bcz given path is invalid.");
		}
	}

}




