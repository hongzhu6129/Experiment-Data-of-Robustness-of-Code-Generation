class Solution {
    /**
     * Checks if the first instance of any character in the given string is immediately followed by the same character.
     *
     * @param str The input string.
     * @return True if the first instance of a character is followed by the same character, false otherwise.
     */
    boolean appearTwice(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == i && str.charAt(i + 1) == currentChar) { // Check if it's the first occurrence
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.appearTwice("abaac"));      // Output: true (a followed by a)
        System.out.println(solution.appearTwice("abc"));       // Output: false
        System.out.println(solution.appearTwice("abbc"));       // Output: true (b followed by b)
        System.out.println(solution.appearTwice("aabb"));       // Output: true (a followed by a)
        System.out.println(solution.appearTwice("aabbc"));     // Output: true (a followed by a)
        System.out.println(solution.appearTwice("a"));         // Output: false (string too short) 
        System.out.println(solution.appearTwice(""));          // Output: false (empty string)
        System.out.println(solution.appearTwice(null));        // Output: false (null string)


    }
}
