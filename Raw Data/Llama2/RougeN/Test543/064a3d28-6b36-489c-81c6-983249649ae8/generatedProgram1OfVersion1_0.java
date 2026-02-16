class Solution {
    /**
     * Checks if a specified character is "happy" within a string.
     * A character is considered "happy" if the same character appears immediately
     * to its left or right in the string.
     *
     * @param str The input string.
     * @return True if the character is happy, false otherwise.
     */
    public boolean aCharacterIsHappy(String str) {
        if (str == null || str.length() < 2) {
            return false; // Single character or empty string can't be happy
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

        String str1 = "aabc";
        System.out.println("Is a character happy in '" + str1 + "'? " + solution.aCharacterIsHappy(str1)); // Output: true (because of 'a')

        String str2 = "abbc";
        System.out.println("Is a character happy in '" + str2 + "'? " + solution.aCharacterIsHappy(str2)); // Output: true (because of 'b')


        String str3 = "abc";
        System.out.println("Is a character happy in '" + str3 + "'? " + solution.aCharacterIsHappy(str3)); // Output: false

        String str4 = "a";
        System.out.println("Is a character happy in '" + str4 + "'? " + solution.aCharacterIsHappy(str4)); // Output: false

        String str5 = "";
        System.out.println("Is a character happy in '" + str5 + "'? " + solution.aCharacterIsHappy(str5)); // Output: false



    }
}
