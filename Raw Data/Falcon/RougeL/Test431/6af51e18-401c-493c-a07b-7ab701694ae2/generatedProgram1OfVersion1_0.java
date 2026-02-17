class Solution {
    /**
     * Given two strings, append them together (known as "concatenation") and return the result. 
     * However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. 
     * So "Hello" and "Hi" yield "loHi". The answer should be the two suffixes of the same length.
     *
     * @param a First string
     * @param b Second string
     * @return The concatenated string with equal length suffixes
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

        // Test cases
        System.out.println(sol.minCat("Hello", "Hi")); // Output: loHi
        System.out.println(sol.minCat("java", "code")); // Output: javacode
        System.out.println(sol.minCat("shotl", "java")); // Output: shotljava
        System.out.println(sol.minCat("ab", "cdefgh")); // Output: abgh

    }
}
