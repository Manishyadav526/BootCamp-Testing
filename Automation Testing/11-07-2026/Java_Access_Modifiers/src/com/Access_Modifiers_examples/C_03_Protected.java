package com.Access_Modifiers_examples;

public class C_03_Protected {

    protected String college = "GL Bajaj";

    protected void displayCollege() {
        System.out.println("College = " + college);
    }

    public static void main(String[] args) {

        C_03_Protected obj = new C_03_Protected();

        System.out.println(obj.college);
        obj.displayCollege();
    }
}