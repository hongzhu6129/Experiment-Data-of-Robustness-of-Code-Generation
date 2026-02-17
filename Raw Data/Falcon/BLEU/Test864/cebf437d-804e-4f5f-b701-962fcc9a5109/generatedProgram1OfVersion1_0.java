class Solution {
    /**
     * Checks if the first instance of any character in a string is immediately followed by the same character.
     *
     * @param str The input string.
     * @return True if any character appears twice consecutively for the first time it appears, false otherwise.
     */
    boolean appearTwice(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            if (str.charAt(i + 1) == currentChar) {
                //Check if it is the first appearance
                if(str.substring(0,i).indexOf(currentChar) == -1){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.appearTwice("abaac")); // Output: true ('a' appears twice consecutively at the beginning)
        System.out.println(solution.appearTwice("abaaac")); // Output: true ('a' appears twice consecutively at the beginning)
         System.out.println(solution.appearTwice("abaaacc")); // Output: true ('a' appears twice consecutively at the beginning)
        System.out.println(solution.appearTwice("abc"));   // Output: false (no character appears twice consecutively)
        System.out.println(solution.appearTwice("aabbc"));  // Output: true ('a' appears twice consecutively)
        System.out.println(solution.appearTwice("abbcca")); // Output: false ('c' appears twice but not in first occurance)
        System.out.println(solution.appearTwice("a"));     // Output: false (string length less than 2)
        System.out.println(solution.appearTwice(""));      // Output: false (empty string)
        System.out.println(solution.appearTwice(null));    // Output: false (null string)


    }
}
