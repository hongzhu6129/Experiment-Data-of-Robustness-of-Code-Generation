class Solution {
    /**
     * Checks if the first instance of any character in a given string is immediately followed by the same character.
     *
     * @param str The input string.
     * @return True if any character appears twice consecutively for its first appearance, false otherwise.
     */
    boolean appearTwice(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            if (str.charAt(i + 1) == currentChar) {
                // Check if this is the first instance of currentChar
                boolean isFirstInstance = true;
                for (int j = 0; j < i; j++) {
                    if (str.charAt(j) == currentChar) {
                        isFirstInstance = false;
                        break;
                    }
                }
                if (isFirstInstance) {
                    return true;
                }
            }

        }
        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.appearTwice("aba"));     // Output: false
        System.out.println(solution.appearTwice("aabb"));    // Output: true
        System.out.println(solution.appearTwice("abc"));     // Output: false 
        System.out.println(solution.appearTwice("abbaa"));    // Output: true
        System.out.println(solution.appearTwice("aabc"));    // Output: false
        System.out.println(solution.appearTwice("aabbc"));   // Output: true
        System.out.println(solution.appearTwice("aaabc"));   // Output: true //'a' appears consecutively in the first instance.
        System.out.println(solution.appearTwice(null));      // Output: false
        System.out.println(solution.appearTwice(""));       // Output: false
        System.out.println(solution.appearTwice("a"));      // Output: false
        System.out.println(solution.appearTwice("aa"));     // Output: true


    }
}
