class Solution {
    /**
     * Images the middle character(s) of a string.
     *
     * @param str The input string.
     * @return The middle character(s).
     * Examples:
     * middle("abc") returns "b"
     * middle("abcd") returns "bc"
     * middle("a") returns "a"
     * middle("") returns "" 
     */
    public static String middle(String str) {
        int len = str.length();
        if (len == 0) {
            return "";
        }

        if (len % 2 == 0) {
            // Even length, return two middle characters
            return str.substring(len / 2 - 1, len / 2 + 1);
        } else {
            // Odd length, return the middle character
            return str.substring(len / 2, len / 2 + 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(middle("abc")); // Output: b
        System.out.println(middle("abcd")); // Output: bc
        System.out.println(middle("a")); // Output: a
        System.out.println(middle("")); // Output: 
        System.out.println(middle("hello")); // Output: l
        System.out.println(middle("java")); // Output: av

    }
}
