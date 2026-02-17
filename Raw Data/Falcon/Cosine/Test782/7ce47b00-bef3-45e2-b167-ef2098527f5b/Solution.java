class Solution {
    /**
     * Given a string, return an updated string using every character of even position from a given string.
     *
     * @param str The input string.
     * @return The updated string with characters at even positions.
     *
     * Examples:
     * makeWithEvenCharacters("Python") => "yhn"
     * makeWithEvenCharacters("JavaScript") => "aaScipt"
     * makeWithEvenCharacters("") => ""
     */
    public String makeWithEvenCharacters(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "Python";
        String result1 = solution.makeWithEvenCharacters(str1);
        System.out.println(result1); // Output: yhn

        String str2 = "JavaScript";
        String result2 = solution.makeWithEvenCharacters(str2);
        System.out.println(result2); // Output: aaScipt

        String str3 = "";
        String result3 = solution.makeWithEvenCharacters(str3);
        System.out.println(result3); // Output: ""
    }
}
