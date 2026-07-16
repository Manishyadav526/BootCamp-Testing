package com.ExceptionHandling;

public class CheckedException {

    public void delay() throws InterruptedException {

        System.out.println("Program will pause for 2 seconds...");
        Thread.sleep(2000);
        System.out.println("Execution resumed.");
    }

    public static void main(String[] args) throws InterruptedException {

        CheckedException obj = new CheckedException();
        obj.delay();
    }
}