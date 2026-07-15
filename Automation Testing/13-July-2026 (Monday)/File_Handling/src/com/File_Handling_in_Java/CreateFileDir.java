package com.File_Handling_in_Java;

import java.io.File;
import java.io.IOException;

public class CreateFileDir {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		File myObj=new File("C:\\Files/Manish1.pdf");
		
		if(myObj.createNewFile()) {
				System.out.println("File Created:"+myObj.getName());
				System.out.println("Absolute Path:"+myObj.getAbsolutePath());
		}else {
			System.out.println("File Already Exists.");
		}
	} catch(IOException e) {
		System.out.println("An Error Occured.");
		e.printStackTrace();
	}
	}
}
