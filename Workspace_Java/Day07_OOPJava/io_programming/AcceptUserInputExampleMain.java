package io_programming;

import java.io.InputStream;
import java.util.Scanner;

public class AcceptUserInputExampleMain {

	public static void main(String[] args) {
		InputStream keyBoard =System.in;
		try(
				Scanner sc= new Scanner(keyBoard);
				){
			System.out.println("Enter full name: ");
			String fullName=sc.nextLine();
			System.out.println("Enter your age: ");
			int age =sc.nextInt();
			System.out.println("Enter weight: ");
			float weight=sc.nextFloat();
			System.out.println("Here is my details:");
			System.out.println("My Name: "+fullName);
			System.out.println("My age: "+age+" years");
			System.out.println("My weight: "+weight+" kg");
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
