class Solution {
    /**
     * Appends two strings, omitting a character if the concatenation creates double characters.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return The concatenated string with no double characters at the junction.
     */
    public String conCat(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return (str1 == null) ? str2 : str1;
        }

        if (str1.isEmpty()) {
            return str2;
        }

        if (str2.isEmpty()) {
            return str1;
        }


        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            return str1 + str2.substring(1);
        } else {
            return str1 + str2;
        }
    }



    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.conCat("abc", "cat")); // Output: abccat
        System.out.println(solution.conCat("dog", "gopher")); // Output: dogopher
        System.out.println(solution.conCat("abc", ""));     // Output: abc
        System.out.println(solution.conCat("", "cat"));     // Output: cat
        System.out.println(solution.conCat(null, "cat"));   // Output: cat
        System.out.println(solution.conCat("abc", null));   // Output: abc
        System.out.println(solution.conCat("door", "r"));   // Output: door
        System.out.println(solution.conCat("food", "d"));    //Output: food
        

    }
}
