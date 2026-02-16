class Solution {
    /**
     * Makes up a string with each character before and after a non-empty substring 
     * whichever it appears in a non-empty given string.
     *
     * @param str The given string.
     * @param sub The substring.
     * @return The resulting string.
     */
    public String mAndTstring(String str, String sub) {
        if (str == null || str.isEmpty() || sub == null || sub.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int index = str.indexOf(sub);

        if (index != -1) {
            if (index > 0) {
                result.append(str.charAt(index - 1));
            }

            if (index + sub.length() < str.length()) {
                result.append(str.charAt(index + sub.length()));
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.mAndTstring("Python", "yt")); // Output: ho
        System.out.println(solution.mAndTstring("JavaScript", "va")); // Output: Sc
        System.out.println(solution.mAndTstring("Hello", "el")); // Output: Hl
        System.out.println(solution.mAndTstring("coding", "ing")); // Output: d
        System.out.println(solution.mAndTstring("abcdef", "bc")); // Output: ad
        System.out.println(solution.mAndTstring("abc", "c")); // Output: b
        System.out.println(solution.mAndTstring("ab", "b"));  // Output: a
         System.out.println(solution.mAndTstring("coding", "cod")); // Output: i

        System.out.println(solution.mAndTstring("", "yt")); // Output: ""
        System.out.println(solution.mAndTstring("Python", "")); // Output: ""
        System.out.println(solution.mAndTstring(null, "yt")); // Output: ""
         System.out.println(solution.mAndTstring("Python", null)); // Output: ""
        
    }
}
