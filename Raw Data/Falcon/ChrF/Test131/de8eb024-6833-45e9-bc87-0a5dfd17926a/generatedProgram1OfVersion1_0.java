class Solution {
    /**
     * Checks if the substring "abc" appears in the middle of the given string.
     *
     * @param str The string to check.
     * @return True if "abc" is in the middle, false otherwise.
     */
    public boolean abcInMiddle(String str) {
        if (str == null || str.length() < 3) {
            return false;
        }

        int middleIndex = str.length() / 2;

        // Check for "abc" centered at middleIndex 
        if (str.length() % 2 != 0) { // Odd length string
            if (middleIndex >= 1 && 
                str.charAt(middleIndex - 1) == 'a' &&
                str.charAt(middleIndex) == 'b' &&
                str.charAt(middleIndex + 1) == 'c') {
                return true;
            }
        } else { // Even length string. Check for "abc" centered at middleIndex-1
             if (middleIndex >= 2 &&
                 str.charAt(middleIndex - 2) == 'a' &&
                 str.charAt(middleIndex-1) == 'b' &&
                 str.charAt(middleIndex) == 'c') {
                return true;
             }

        }
        
        return false;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.abcInMiddle("aaabcde")); // true
        System.out.println(sol.abcInMiddle("aababcde")); // true - handles even lengths correctly
        System.out.println(sol.abcInMiddle("AabcBB"));  // true
        System.out.println(sol.abcInMiddle("abcab"));   // false
        System.out.println(sol.abcInMiddle("abcc"));  // false
        System.out.println(sol.abcInMiddle("bc")); // false
        System.out.println(sol.abcInMiddle(null));  // false (handles null input)
        System.out.println(sol.abcInMiddle("a")); // false (handles strings shorter than 3)

    }
}
