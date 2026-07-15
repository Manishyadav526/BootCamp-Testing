package Task62_Java_LabSessions;

public class FibonacciAndPalindrome {

    // Generates the first n terms of the Fibonacci series
    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci series (" + n + " terms): ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Checks whether a string reads the same forwards and backwards
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        printFibonacci(10);

        String[] wordsToCheck = {"madam", "hello", "level", "Java", "racecar"};
        for (String word : wordsToCheck) {
            System.out.println("\"" + word + "\" is palindrome? " + isPalindrome(word));
        }
    }
}
