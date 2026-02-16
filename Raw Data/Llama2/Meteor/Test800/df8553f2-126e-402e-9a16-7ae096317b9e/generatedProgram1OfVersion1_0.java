class Solution {
    /**
     * Generates a string made of repeating characters from the beginning of the input string.
     * The number of repetitions decreases progressively.
     *
     * @param str The input string.
     * @param p   The initial number of repetitions.
     * @return The generated string.
     */
    public String beginningRepetition(String str, int p) {
        if (str == null || str.isEmpty() || p <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = p; i > 0; i--) {
            for (int j = 0; j < i && j < str.length(); j++) {
                result.append(str.charAt(0));
            }

            if (i > 1) {
              if (str.length() > 1) {
                for (int k = 1; k < i && k < str.length(); k++) {
                    result.append(str.charAt(k));
                }
              }

            }


        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "abc";
        int p1 = 3;
        String expected1 = "aaabbab";  // corrected expected output. 
        String result1 = solution.beginningRepetition(str1, p1);
        System.out.println("Input: \"" + str1 + "\", p = " + p1);
        System.out.println("Expected: \"" + expected1 + "\"");
        System.out.println("Output: \"" + result1 + "\"");
        System.out.println(result1.equals(expected1));

        String str2 = "xyz";
        int p2 = 2;
        String expected2 = "xxy";
        String result2 = solution.beginningRepetition(str2, p2);
        System.out.println("Input: \"" + str2 + "\", p = " + p2);
        System.out.println("Expected: \"" + expected2 + "\"");
        System.out.println("Output: \"" + result2 + "\"");
        System.out.println(result2.equals(expected2));


        String str3 = "a"; // Example with a single-character string
        int p3 = 3;
        String expected3 = "aaa";
        String result3 = solution.beginningRepetition(str3, p3);
        System.out.println("Input: \"" + str3 + "\", p = " + p3);
        System.out.println("Expected: \"" + expected3 + "\"");
        System.out.println("Output: \"" + result3 + "\"");
        System.out.println(result3.equals(expected3));



    }
}
