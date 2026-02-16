class Solution {
    /**
     * Checks if a specified character is happy in a string.
     * A character is happy when the same character appears to its left or right in the string.
     *
     * @param str The input string.
     * @return True if the specified character is happy, false otherwise.
     */
    public boolean aCharacterIsHappy(String str) {
        if (str == null || str.length() < 2) {
            return false; // A single character or empty string can't be happy
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

        String str1 = "aabcda";
        System.out.println(str1 + ": " + solution.aCharacterIsHappy(str1)); // Output: true (because of 'aa')

        String str2 = "aabbcda";
        System.out.println(str2 + ": " + solution.aCharacterIsHappy(str2)); // Output: true

        String str3 = "abcd";
        System.out.println(str3 + ": " + solution.aCharacterIsHappy(str3)); // Output: false

        String str4 = "a";
        System.out.println(str4 + ": " + solution.aCharacterIsHappy(str4)); // Output: false

        String str5 = "";
        System.out.println(str5 + ": " + solution.aCharacterIsHappy(str5)); // Output: false



    }
}
