import java.util.HashSet;
import java.util.Set;

class Solution {

    /**
     * Checks if a given string has all distinct characters.
     *
     * @param str The input string.
     * @return True if the string has all distinct characters, false otherwise.
     */
    public static boolean is_Unique_str(String str) {
        // Create a set to store the characters encountered so far.
        Set<Character> charSet = new HashSet<>();

        // Iterate through the string.
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the character is already in the set, the string does not have all distinct characters.
            if (charSet.contains(c)) {
                return false;
            }

            // Add the character to the set.
            charSet.add(c);
        }

        // If all characters were added to the set without duplicates, the string has all distinct characters.
        return true;
    }


    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "abacdefg";

        System.out.println(str1 + " has all unique characters: " + is_Unique_str(str1)); // Output: true
        System.out.println(str2 + " has all unique characters: " + is_Unique_str(str2)); // Output: false


        String str3 = ""; // Empty String
        String str4 = "a"; // Single character string
        String str5 = "aA"; // Case-sensitive check

        System.out.println(str3 + " has all unique characters: " + is_Unique_str(str3)); // Output: true
        System.out.println(str4 + " has all unique characters: " + is_Unique_str(str4)); // Output: true
        System.out.println(str5 + " has all unique characters: " + is_Unique_str(str5)); // Output: true


    }
}
