class Solution {
    /**
     * Returns an updated string using every character of even position from a given string.
     *
     * @param str The input string.
     * @return The updated string with characters at even positions.
     */
    public String makeWithEvenCharacters(String str) {
        StringBuilder result = new StringBuilder();
        if (str == null || str.isEmpty()) {
            return "";
        }

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) { // Check for even positions (0-based indexing)
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "Python";
        String result1 = solution.makeWithEvenCharacters(str1);
        System.out.println(result1); // Output: Pto

        String str2 = "JavaScript";
        String result2 = solution.makeWithEvenCharacters(str2);
        System.out.println(result2); // Output: JvScr

        String str3 = ""; // Empty String
        String result3 = solution.makeWithEvenCharacters(str3);
        System.out.println(result3); // Output: (Empty String)


        String str4 = null; // Null String
        String result4 = solution.makeWithEvenCharacters(str4);
        System.out.println(result4); // Output: (Empty String)

        
        String str5 = "0123456789";
        String result5 = solution.makeWithEvenCharacters(str5);
        System.out.println(result5); // Output: 02468
    }
}
