package com.Access_Modifiers_examples;

public class C_01_Private {

    private int age = 22;

    private void displayAge() {
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {

        C_01_Private obj = new C_01_Private();

        // Accessible because we're inside the same class
        System.out.println(obj.age);
        obj.displayAge();
    }
}