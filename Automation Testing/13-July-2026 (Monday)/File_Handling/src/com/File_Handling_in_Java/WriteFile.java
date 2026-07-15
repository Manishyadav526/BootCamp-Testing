package com.File_Handling_in_Java;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("C:\\Files\\Manish.txt");

            myWriter.write("Hello Manish!\n");
            myWriter.write("Welcome to Java File Handling.\n");
            myWriter.write("This file is created using FileWriter.");

            myWriter.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}