class Solution {
    /**
     * Given two strings, append them together (known as "concatenation") and return the result. 
     * However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. 
     * So "Hello" and "Hi" yield "loHi". The strings may be any length.
     *
     * @param a First string
     * @param b Second string
     * @return Concatenated string with equalized lengths
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
        Solution sol = new Solution();

        System.out.println(sol.minCat("Hello", "Hi")); // Output: loHi
        System.out.println(sol.minCat("Hi", "Hello")); // Output: HiHe
        System.out.println(sol.minCat("java", "code")); // Output: javacode
        System.out.println(sol.minCat("shotl", "java")); // Output: tljava
        System.out.println(sol.minCat("abc", "abcde")); // Output: abcbcde
        

    }
}
