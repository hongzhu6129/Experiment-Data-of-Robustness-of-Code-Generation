class Solution {
    /**
     * Checks if the substring "abc" appears before the first period ('.') in a given string.
     *
     * @param str The input string.
     * @return True if "abc" appears before the first period, false otherwise.
     */
    public Boolean abcBeforePeriod(String str) {
        int abcIndex = str.indexOf("abc");
        int periodIndex = str.indexOf('.');

        if (abcIndex != -1 && (periodIndex == -1 || abcIndex < periodIndex)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "abcabc.def";
        System.out.println(str1 + ": " + solution.abcBeforePeriod(str1)); // Output: true

        String str2 = "def.abc";
        System.out.println(str2 + ": " + solution.abcBeforePeriod(str2)); // Output: false

        String str3 = "abc";
        System.out.println(str3 + ": " + solution.abcBeforePeriod(str3)); // Output: true

        String str4 = "def";
        System.out.println(str4 + ": " + solution.abcBeforePeriod(str4)); // Output: false


        String str5 = ".abc";
        System.out.println(str5 + ": " + solution.abcBeforePeriod(str5)); // Output: false

        String str6 = "abcdef";  //No period
        System.out.println(str6 + ": " + solution.abcBeforePeriod(str6)); // Output: true


         String str7 = ""; // Empty string
        System.out.println(str7 + ": " + solution.abcBeforePeriod(str7)); // Output: false

    }
}
