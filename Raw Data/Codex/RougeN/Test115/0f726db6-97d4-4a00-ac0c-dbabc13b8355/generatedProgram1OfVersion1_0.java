class Solution {
    /**
     * Concatenates a given string with itself a given number of times.
     *
     * @param str The string to concatenate.
     * @param n   The number of times to concatenate the string.
     * @return The concatenated string.
     */
    public static String repeat_str(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "hello";
        int n1 = 3;
        String result1 = repeat_str(str1, n1);
        System.out.println(result1); // Output: hellohellohello


        String str2 = "abc";
        int n2 = 2;
        String result2 = repeat_str(str2, n2);
        System.out.println(result2); // Output: abcabc

        String str3 = "xyz";
        int n3 = 0;  // Test with 0 repetitions
        String result3 = repeat_str(str3, n3);
        System.out.println(result3); // Output: (empty string)


    }
}
