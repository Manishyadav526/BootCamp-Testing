package com.ExceptionHandling;

public class ExceptionsExampleTest {

    public static void main(String[] args) {

        try {

            String str = null;

            System.out.println(str.length());

        } catch (NullPointerException e) {

            System.out.println("Null Pointer Exception Caught.");

        }

        try {

            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Out Of Bounds Exception Caught.");

        }

        System.out.println("Program executed successfully.");
    }
}