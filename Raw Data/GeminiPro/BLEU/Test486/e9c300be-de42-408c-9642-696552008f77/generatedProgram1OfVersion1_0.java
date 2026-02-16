class Solution {
    /**
     * Given a string, return the middle character(s).
     * If the string has an odd length, return the middle two characters.
     * If the string has an even length, return the middle character.
     *
     * Examples:
     * middle("abcde") == "c"
     * middle("abcd") == "bc"
     * middle("a") == "a"
     * middle("") == ""
     *
     * @param str The input string.
     * @return The middle character(s) of the string.
     */
    public static String middle(String str) {
        if (str.length() == 0) {
            return "";
        }

        int mid = str.length() / 2;

        if (str.length() % 2 == 0) { // Even length
            return str.substring(mid - 1, mid + 1);
        } else { // Odd length
            return str.substring(mid, mid + 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(middle("abcde")); // Output: c
        System.out.println(middle("abcd"));  // Output: bc
        System.out.println(middle("a"));     // Output: a
        System.out.println(middle(""));      // Output: 
        System.out.println(middle("abcdef")); // Output: cd

    }
}
