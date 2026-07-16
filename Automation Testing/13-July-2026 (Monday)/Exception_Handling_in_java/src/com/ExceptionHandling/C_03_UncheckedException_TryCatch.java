package com.ExceptionHandling;

public class C_03_UncheckedException_TryCatch {

    int x = 100;
    int y = 0;

    public static void main(String[] args) {

        C_03_UncheckedException_TryCatch obj = new C_03_UncheckedException_TryCatch();

        try {
            int result = obj.x / obj.y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught!");
            e.printStackTrace();
        }

        System.out.println("Program continues...");
    }
}