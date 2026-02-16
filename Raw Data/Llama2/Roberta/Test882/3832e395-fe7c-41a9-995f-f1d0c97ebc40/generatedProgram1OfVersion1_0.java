class Solution {
    /**
     * Concatenates a given string with itself a given number of times.
     *
     * @param str The string to concatenate.
     * @param n   The number of times to concatenate the string.
     * @return The concatenated string.
     *
     * Examples:
     * repeat_str("a", 3) == "aaa"
     * repeat_str("Hello", 2) == "HelloHello"
     * repeat_str("abc", 0) == ""
     */
    public static String repeat_str(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeat_str("a", 3)); // Output: aaa
        System.out.println(repeat_str("Hello", 2)); // Output: HelloHello
        System.out.println(repeat_str("abc", 0)); // Output: ""
        System.out.println(repeat_str("xyz", 1)); // Output: xyz

    }
}
