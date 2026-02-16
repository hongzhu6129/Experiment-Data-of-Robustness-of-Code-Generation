class Solution {
    /**
     * Checks if a specified character is "happy" within a string.
     * A character is considered "happy" if the same character appears immediately to its left or right.
     *
     * @param str The input string.
     * @return True if the character is happy, false otherwise.
     */
    public boolean aCharacterIsHappy(String str) {
        if (str == null || str.length() < 2) {
            return false; // A character cannot be happy in an empty or single-character string.
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check left neighbor (if it exists)
            if (i > 0 && str.charAt(i - 1) == currentChar) {
                return true;
            }

            // Check right neighbor (if it exists)
            if (i < str.length() - 1 && str.charAt(i + 1) == currentChar) {
                return true;
            }
        }

        return false; // No happy character found
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "aabbcc";
        System.out.println(str1 + ": " + solution.aCharacterIsHappy(str1)); // Output: true

        String str2 = "abc";
        System.out.println(str2 + ": " + solution.aCharacterIsHappy(str2)); // Output: false


        String str3 = "a";
        System.out.println(str3 + ": " + solution.aCharacterIsHappy(str3)); // Output: false

        String str4 = "";
        System.out.println(str4 + ": " + solution.aCharacterIsHappy(str4)); // Output: false

         String str5 = "aabbccaa";
        System.out.println(str5 + ": " + solution.aCharacterIsHappy(str5)); // Output: true

        String str6 = null;  // Test with null input
        System.out.println(str6 + ": " + solution.aCharacterIsHappy(str6)); // Output: false


    }
}
