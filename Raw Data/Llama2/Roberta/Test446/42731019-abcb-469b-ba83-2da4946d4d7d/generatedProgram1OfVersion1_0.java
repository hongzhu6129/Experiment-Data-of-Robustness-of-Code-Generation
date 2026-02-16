class Solution {
    /**
     * Checks if a specified character is happy in a string.
     *
     * @param str The input string.
     * @return True if the character is happy, false otherwise.
     */
    public boolean aCharacterIsHappy(String str) {
        if (str == null || str.length() < 2) {
            return false; // A character cannot be happy in an empty or single-character string
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check left neighbor (if exists)
            if (i > 0 && str.charAt(i - 1) == currentChar) {
                return true;
            }

            // Check right neighbor (if exists)
            if (i < str.length() - 1 && str.charAt(i + 1) == currentChar) {
                return true;
            }
        }

        return false; // No happy character found
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "aabc";
        System.out.println("Is a character happy in \"" + str1 + "\"? " + solution.aCharacterIsHappy(str1)); // Output: true

        String str2 = "abc";
        System.out.println("Is a character happy in \"" + str2 + "\"? " + solution.aCharacterIsHappy(str2)); // Output: false

        String str3 = "aabbc";
        System.out.println("Is a character happy in \"" + str3 + "\"? " + solution.aCharacterIsHappy(str3)); // Output: true


        String str4 = "a";
        System.out.println("Is a character happy in \"" + str4 + "\"? " + solution.aCharacterIsHappy(str4)); // Output: false

        String str5 = "";
        System.out.println("Is a character happy in \"" + str5 + "\"? " + solution.aCharacterIsHappy(str5)); // Output: false

        String str6 = null;  // Test with null input
        System.out.println("Is a character happy in \"" + str6 + "\"? " + solution.aCharacterIsHappy(str6)); // Output: false
    }
}
