import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String inputString = "leetcode"; // Example input
        char firstNonRepeatingChar = findFirstNonRepeatingCharacter(inputString);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
        } else {
            System.out.println("There is no non-repeating character in the string.");
        }


        inputString = "loveleetcode"; // Example input 2
        firstNonRepeatingChar = findFirstNonRepeatingCharacter(inputString);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
        } else {
            System.out.println("There is no non-repeating character in the string.");
        }

        inputString = "aabb"; // Example input 3 - No non-repeating char
         firstNonRepeatingChar = findFirstNonRepeatingCharacter(inputString);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
        } else {
            System.out.println("There is no non-repeating character in the string.");
        }
    }



    private static char findFirstNonRepeatingCharacter(String str) {
        // Use a HashMap to store character counts.
        Map<Character, Integer> charCounts = new HashMap<>();

        // Iterate through the string to count character occurrences.
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string again to find the first character with a count of 1.
        for (char c : str.toCharArray()) {
            if (charCounts.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return null character.
        return '\0'; 
    }
}
