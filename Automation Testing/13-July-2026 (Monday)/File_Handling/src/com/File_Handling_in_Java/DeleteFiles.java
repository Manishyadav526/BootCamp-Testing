package com.File_Handling_in_Java;

import java.io.File;
import java.io.IOException;

public class DeleteFiles {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			try{
				File myObj=new File("C:\\Files/Manish1.txt");
			
			if(myObj.delete()) {
					System.out.println("Deleted the file : "+myObj.getName());
			}else {
				System.out.println("Failed to delete . " + myObj.getName());
			}
	   } catch(Exception e) {
				System.out.println("An Error Occured.");
				e.printStackTrace();
			}
		}
}
