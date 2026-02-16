class Solution {
    /**
     * Checks if the first instance of any character in a given string is immediately followed by the same character.
     *
     * @param str The input string.
     * @return True if any character appears consecutively in its first instance, false otherwise.
     */
    boolean appearTwice(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            if (str.charAt(i + 1) == currentChar) {
                // Found consecutive characters. Check if this is the first instance of currentChar
                boolean firstInstance = true;
                for (int j = 0; j < i; j++) {
                    if (str.charAt(j) == currentChar) {
                        firstInstance = false;
                        break;
                    }
                }
                if (firstInstance) {
                    return true;
                }
            }

        }
        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.appearTwice("aba")); // Output: false
        System.out.println(solution.appearTwice("aabb")); // Output: true 
        System.out.println(solution.appearTwice("aabbc"));  // Output: true
        System.out.println(solution.appearTwice("abc")); // Output: false
        System.out.println(solution.appearTwice("abbc"));  // Output: false
        System.out.println(solution.appearTwice("Aabbc")); // Output: false
        System.out.println(solution.appearTwice("AAabbc")); // Output: true


    }
}
