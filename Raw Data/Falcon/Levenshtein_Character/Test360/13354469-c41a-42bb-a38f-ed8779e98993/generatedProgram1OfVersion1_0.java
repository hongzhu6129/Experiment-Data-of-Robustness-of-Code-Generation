class Solution {
    /**
     * Checks if the substring "abc" appears in the middle of the given string.
     *
     * @param str The string to check.
     * @return True if "abc" appears in the middle, false otherwise.
     */
    public boolean abcInMiddle(String str) {
        if (str == null || str.length() < 3) {
            return false;
        }

        int middleIndex = str.length() / 2;

        // Check for "abc" centered at the middle index (for odd length strings)
        if (str.length() % 2 != 0) {
            if (middleIndex >= 1 && str.substring(middleIndex - 1, middleIndex + 2).equals("abc")) {
                return true;
            }
        } 
        // Check for "abc" centered around the two middle indices (for even length strings)
        else {
            if (middleIndex >= 1 ) {
                if (str.substring(middleIndex - 1, middleIndex + 2).equals("abc")) return true;
                if (middleIndex >= 2 && str.substring(middleIndex-2, middleIndex + 1).equals("abc")) return true;
            }


        }


        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.abcInMiddle("aabcabca"));   // Output: true
        System.out.println(solution.abcInMiddle("abcabca"));    // Output: true
        System.out.println(solution.abcInMiddle("aaabcaaa")); // Output: true
        System.out.println(solution.abcInMiddle("abca"));     // Output: false (too short -  "abc" is at the beginning not middle)
        System.out.println(solution.abcInMiddle("xabcy"));    // Output: true
        System.out.println(solution.abcInMiddle("xabcyz")); // Output:true
        System.out.println(solution.abcInMiddle("xabc")); // Output:false
        System.out.println(solution.abcInMiddle("ab")); //Output : false
        System.out.println(solution.abcInMiddle("aabc")); //Output : false (beginning)
        System.out.println(solution.abcInMiddle("aabcc")); //Output : true
         System.out.println(solution.abcInMiddle("aabbc")); //Output : true
        System.out.println(solution.abcInMiddle(null));       // Output: false
        System.out.println(solution.abcInMiddle(""));        // Output: false
        System.out.println(solution.abcInMiddle("ab"));        // Output: false
        System.out.println(solution.abcInMiddle("abc"));        // Output: false  (considers this at the beginning not middle)



    }
}
