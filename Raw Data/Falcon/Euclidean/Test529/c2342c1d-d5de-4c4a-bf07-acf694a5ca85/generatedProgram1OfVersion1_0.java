class Solution {
    /**
     * Makes up a string with each character before and after a non-empty substring 
     * whichever it appears in a non-empty given string.
     *
     * @param str The given string.
     * @param sub The substring to search for.
     * @return The resulting string.
     */
    public String mAndTstring(String str, String sub) {
        if (str == null || str.isEmpty() || sub == null || sub.isEmpty()) {
            return ""; // Handle empty or null inputs
        }

        StringBuilder result = new StringBuilder();
        int index = str.indexOf(sub);

        if (index == -1) {
            return ""; // Substring not found
        }

        if (index > 0) {
            result.append(str.charAt(index - 1));
        }

        if (index + sub.length() < str.length()) {
            result.append(str.charAt(index + sub.length()));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.mAndTstring("testing", "ing"));  // Output: gt
        System.out.println(solution.mAndTstring("testing", "test")); // Output: ig
        System.out.println(solution.mAndTstring("testing", "t"));    // Output: es
        System.out.println(solution.mAndTstring("testing", "g"));    // Output: n
        System.out.println(solution.mAndTstring("test", "test"));   // Output: 
         System.out.println(solution.mAndTstring("ab", "b"));   // Output: a
         System.out.println(solution.mAndTstring("abc", "a"));   // Output: b
        System.out.println(solution.mAndTstring("", "test"));      // Output: 
        System.out.println(solution.mAndTstring("testing", ""));     // Output: 
        System.out.println(solution.mAndTstring(null, "test"));     // Output: 
        System.out.println(solution.mAndTstring("testing", null));    // Output:


    }
}
