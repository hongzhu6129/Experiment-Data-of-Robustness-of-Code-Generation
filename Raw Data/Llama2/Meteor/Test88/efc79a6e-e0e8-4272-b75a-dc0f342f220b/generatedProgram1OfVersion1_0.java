class Solution {
    /**
     * Appends two strings, omitting one character if the concatenation creates a "double feature" 
     * (i.e., the last character of the first string is the same as the first character of the second string).
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return The concatenated string.
     */
    public String conCat(String str1, String str2) {
        if (str1.isEmpty() || str2.isEmpty()) {
            return str1 + str2;
        }

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            return str1 + str2.substring(1);
        } else {
            return str1 + str2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.conCat("abc", "cat")); // Output: abcat
        System.out.println(solution.conCat("dog", "cat")); // Output: dogcat
        System.out.println(solution.conCat("abc", ""));     // Output: abc
        System.out.println(solution.conCat("", "cat"));     // Output: cat
        System.out.println(solution.conCat("abc", "c"));   // Output: abc

           System.out.println(solution.conCat("door", "rat"));
           System.out.println(solution.conCat("coding", "ninjas"));

    }
}
