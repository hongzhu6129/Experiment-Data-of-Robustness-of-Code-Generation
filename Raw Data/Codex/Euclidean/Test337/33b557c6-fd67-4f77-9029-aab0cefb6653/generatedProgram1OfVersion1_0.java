class Solution {
    /**
     * Repeats the last 'n' characters of a string 'str' a specified number of 'times'.
     *
     * @param str   The input string.
     * @param n     The number of characters to repeat from the end of the string.
     * @param times The number of times to repeat the substring.
     * @return The string with the last 'n' characters repeated 'times'.
     *         Returns the original string if 'n' is negative, zero, or greater than the string length.
     */
    public String lastNchrRepeat(String str, int n, int times) {
        if (str == null || n <= 0 || n > str.length()) {
            return str;
        }

        String lastN = str.substring(str.length() - n);
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < times; i++) {
            sb.append(lastN);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.lastNchrRepeat("Wipro", 2, 3)); // Output: Wipropropro
        System.out.println(sol.lastNchrRepeat("Wipro", 0, 3)); // Output: Wipro
        System.out.println(sol.lastNchrRepeat("Wipro", -1, 3)); // Output: Wipro
        System.out.println(sol.lastNchrRepeat("Wipro", 6, 3)); // Output: WiproWiproWipro
        System.out.println(sol.lastNchrRepeat("hello", 3, 2)); // Output: hellollollo
        System.out.println(sol.lastNchrRepeat(null, 2, 3)); // Output: null



    }
}
