class Solution {
    /**
     * Creates a string containing every character twice of a given string.
     *
     * @param str The input string.
     * @return The string with every character repeated twice.
     */
    public String repeatAllTwice(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c).append(c);
        }
        return sb.toString();
    }

    /**
     * Main method for testing.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "hello";
        String result1 = solution.repeatAllTwice(str1);
        System.out.println(result1); // Output: hheelllloo

        String str2 = "abc";
        String result2 = solution.repeatAllTwice(str2);
        System.out.println(result2); // Output: aabbcc

        String str3 = "";
        String result3 = solution.repeatAllTwice(str3);
        System.out.println(result3); // Output: (empty string)

        String str4 = null; // Handling null input
        String result4 = solution.repeatAllTwice(str4); 
        System.out.println(result4); // Output: null (or handle as needed, e.g., return an empty string or throw an exception)



    }
}

