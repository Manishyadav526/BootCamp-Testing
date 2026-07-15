package Task62_Java_LabSessions;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacterFinder {

    public static Map<Character, Integer> findDuplicates(String input) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                continue;
            }
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Keep only characters that occur more than once
        Map<Character, Integer> duplicates = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Integer> duplicates = findDuplicates(input);

        System.out.println("Duplicate characters in \"" + input + "\":");
        for (Map.Entry<Character, Integer> entry : duplicates.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
        }
    }
}
