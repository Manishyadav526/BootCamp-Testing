package Task62_Java_LabSessions;

public class LargestOfTwoNumbers {

    public static int findLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 50;
        System.out.println("Largest of " + num1 + " and " + num2 + " is: " + findLargest(num1, num2));
    }
}
