class Solution {
    /**
     * Given two strings, append them together and return the result.
     * If the strings are different lengths, remove characters from the 
     * beginning of the longer string so that they are the same length before appending.
     *
     * @param a The first string.
     * @param b The second string.
     * @return The concatenated string.
     */
    public String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        if (lenA > lenB) {
            a = a.substring(lenA - lenB);
        } else if (lenB > lenA) {
            b = b.substring(lenB - lenA);
        }

        return a + b;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.minCat("Hello", "Hi")); // "loHi"
        System.out.println(s.minCat("Hello", "java")); // "ellojava"
        System.out.println(s.minCat("java", "Hello")); // "javaello"

    }
}
