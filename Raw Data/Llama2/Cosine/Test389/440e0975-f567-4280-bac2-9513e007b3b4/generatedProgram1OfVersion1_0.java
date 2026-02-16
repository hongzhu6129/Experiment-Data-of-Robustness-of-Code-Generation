class Solution {
    /**
     * Finds the index of the first unique character in a given string.
     *
     * @param s The input string.
     * @return The index of the first unique character.
     * @throws IllegalArgumentException if the string is null or empty, or if no unique character is found.
     */
    public static int first_Uniq_Char(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }

        int[] charCounts = new int[26]; // Assuming only lowercase English alphabet characters

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        throw new IllegalArgumentException("No unique character found in the string."); // Should not happen based on problem description
    }


    public static void main(String[] args) {
        String str = "wresource";
        System.out.println("Original String: " + str);

        int index = first_Uniq_Char(str);
        System.out.println("First unique character of the above: " + index);


        str = "aabbccddeeffgg"; // Test with no unique character (violates assumption)
        try {
            index = first_Uniq_Char(str);
            System.out.println("First unique character of '" + str + "': " + index); // This line shouldn't execute
        } catch (IllegalArgumentException e) {
            System.out.println("Error for '" + str + "': " + e.getMessage()); // Expected output
        }


        str = "loveleetcode";
        System.out.println("Original String: " + str);
        index = first_Uniq_Char(str);
        System.out.println("First unique character of the above: " + index); // Should be 2


        str = ""; // Empty string test
        try {
            index = first_Uniq_Char(str);
            System.out.println("First unique character of '': " + index); // Should not execute
        } catch (IllegalArgumentException e) {
            System.out.println("Error for '': " + e.getMessage()); // Expected output
        }

    }
}
