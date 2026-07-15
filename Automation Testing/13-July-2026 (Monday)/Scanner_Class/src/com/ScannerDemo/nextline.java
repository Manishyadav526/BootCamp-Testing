package com.ScannerDemo;

import java.util.Scanner;

public class nextline {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        System.out.println("Full Name = " + fullName);

        sc.close();
    }
}