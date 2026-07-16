package com.ExceptionHandling;

public class Exception_handling {

    public static void main(String[] args) {

        try {

            int num = 100 / 0;
            System.out.println(num);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }

        System.out.println("Exception handled successfully.");
    }
}