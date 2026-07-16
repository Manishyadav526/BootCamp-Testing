package com.ExceptionHandling;

public class MultipleCatchBlock {

    public static void main(String[] args) {

        try {

            int[] arr = new int[5];

            arr[10] = 50;

            int result = 20 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception Caught.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Out OfBounds Exception Caught.");

        } catch (Exception e) {

            System.out.println("General Exception Caught.");

        }

        System.out.println("Program Ends Successfully.");
    }
}