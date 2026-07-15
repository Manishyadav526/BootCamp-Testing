package com.Access_Modifiers_examples;

public class C_04_Public {

    public String name = "Manish";

    public void displayName() {
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {

        C_04_Public obj = new C_04_Public();

        System.out.println(obj.name);
        obj.displayName();
    }
}