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
            return false; // Empty or single-character strings can't have happy characters
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

        return false; // No happy character found
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "aabcda";
        System.out.println("String: " + str1 + ", Is happy: " + solution.aCharacterIsHappy(str1)); // Output: true (because of 'a' at index 0 and 1)

        String str2 = "abecd";
        System.out.println("String: " + str2 + ", Is happy: " + solution.aCharacterIsHappy(str2)); // Output: false

        String str3 = "aabb";
        System.out.println("String: " + str3 + ", Is happy: " + solution.aCharacterIsHappy(str3)); // Output: true

        String str4 = "a";
        System.out.println("String: " + str4 + ", Is happy: " + solution.aCharacterIsHappy(str4)); // Output: false (single character)

        String str5 = "";
        System.out.println("String: " + str5 + ", Is happy: " + solution.aCharacterIsHappy(str5)); // Output: false (empty string)

        String str6 = null;
        System.out.println("String: " + str6 + ", Is happy: " + solution.aCharacterIsHappy(str6)); // Output: false (null)
    }
}
