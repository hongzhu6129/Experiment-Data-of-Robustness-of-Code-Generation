import java.util.*;

class Solution {
    /**
     * Given a string, find the first non-repeating character in it.
     *
     * @param str The string to search in.
     * @return The first non-repeating character in the string, or -1 if no such character exists.
     */
    public int firstNonRepeatingChar(String str) {
        // Create a map to store the count of each character in the string.
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over the string and update the count of each character.
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Iterate over the string again and find the first character with a count of 1.
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCountMap.get(c) == 1) {
                return i;
            }
        }

        // If no non-repeating character is found, return -1.
        return -1;
    }
}
