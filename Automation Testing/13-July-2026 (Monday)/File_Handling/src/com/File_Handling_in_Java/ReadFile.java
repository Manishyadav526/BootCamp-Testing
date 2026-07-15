package com.File_Handling_in_Java;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj = new File("C:\\Files/Manish.txt");
			Scanner myReader = new Scanner(myObj);
			
			while(myReader.hasNextLine()) {
				String data=myReader.nextLine();
				 System.out.println(data);
			}
			myReader.close();
		}catch (FileNotFoundException e) {
			 System.out.println("An Error Occured - File not Found ");
			 e.printStackTrace();
		}
	}
}
