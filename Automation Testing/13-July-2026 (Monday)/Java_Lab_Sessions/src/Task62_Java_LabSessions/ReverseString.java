package Task62_Java_LabSessions;

public class ReverseString {

    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Coforge";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse(input));
    }
}
