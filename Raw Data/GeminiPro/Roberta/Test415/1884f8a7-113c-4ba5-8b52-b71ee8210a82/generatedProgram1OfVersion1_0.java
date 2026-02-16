class Solution {
    /**
     * Checks if the first occurrence of a specific character in a given string
     * is immediately followed by the same character.
     *
     * @param str The input string.
     * @return True if the first occurrence of any character is immediately
     *         followed by the same character, false otherwise.
     */
    boolean appearTwice(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == i && str.charAt(i + 1) == currentChar) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.appearTwice("abaac"));  // Output: true ('a' appears twice consecutively)
        System.out.println(solution.appearTwice("abc"));   // Output: false 
        System.out.println(solution.appearTwice("abca"));  // Output: false (although 'a' appears twice, they aren't consecutive at first occurrence)
        System.out.println(solution.appearTwice("aabbc"));  // Output: true
        System.out.println(solution.appearTwice("xxyy"));   // Output: true
        System.out.println(solution.appearTwice("xyxy"));   // Output: false
        System.out.println(solution.appearTwice("a"));     // Output: false (string too short)
        System.out.println(solution.appearTwice(null));    // Output: false (handles null input)

    }
}
