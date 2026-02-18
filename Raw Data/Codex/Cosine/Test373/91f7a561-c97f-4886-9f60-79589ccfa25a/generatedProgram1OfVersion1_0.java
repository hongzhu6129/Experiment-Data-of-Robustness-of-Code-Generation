class Solution {
    /**
     * Given two strings, append them together (known as "concatenation") and return the result. 
     * However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. 
     * So "Hello" and "Hi" yield "loHi". The strings may be different lengths.
     *
     * @param a The first string.
     * @param b The second string.
     * @return The concatenated string with equalized lengths.
     */
    public String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        if (lenA == lenB) {
            return a + b;
        } else if (lenA > lenB) {
            return a.substring(lenA - lenB) + b;
        } else {
            return a + b.substring(lenB - lenA);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.minCat("Hello", "Hi")); // Output: loHi
        System.out.println(solution.minCat("Hi", "Hello")); // Output: Hiell
        System.out.println(solution.minCat("java", "code")); // Output: javacode
        System.out.println(solution.minCat("abc", "x"));   // Output: cx
        System.out.println(solution.minCat("x", "abc"));   // Output: xbc

    }
}
