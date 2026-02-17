class Solution {
    /**
     * Checks if a character in a string is "happy" - meaning it has the same character immediately to its left or right.
     *
     * @param str The input string.
     * @return True if a character in the string is happy, false otherwise.
     */
    public boolean aCharacterIsHappy(String str) {
        if (str == null || str.length() < 2) {
            return false; // A string with less than 2 characters can't have a happy character.
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check left (if applicable)
            if (i > 0 && str.charAt(i - 1) == currentChar) {
                return true;
            }

            // Check right (if applicable)
            if (i < str.length() - 1 && str.charAt(i + 1) == currentChar) {
                return true;
            }
        }

        return false; // No happy character found.
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "aabcdd";
        System.out.println(str1 + ": " + solution.aCharacterIsHappy(str1)); // Output: true (because of 'd')

        String str2 = "aabb";
        System.out.println(str2 + ": " + solution.aCharacterIsHappy(str2)); // Output: true (because of 'a' and 'b')

        String str3 = "abc";
        System.out.println(str3 + ": " + solution.aCharacterIsHappy(str3)); // Output: false

        String str4 = "aa";
        System.out.println(str4 + ": " + solution.aCharacterIsHappy(str4)); // Output: true

        String str5 = "a";
        System.out.println(str5 + ": " + solution.aCharacterIsHappy(str5)); // Output: false

        String str6 = null;
        System.out.println(str6 + ": " + solution.aCharacterIsHappy(str6)); // Output: false
    }
}
