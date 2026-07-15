package Task62_Java_LabSessions;

public class PrimeNumberCheck {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbersToCheck = {1, 2, 3, 4, 5, 17};
        for (int num : numbersToCheck) {
            System.out.println(num + " is prime? " + isPrime(num));
        }
    }
}
