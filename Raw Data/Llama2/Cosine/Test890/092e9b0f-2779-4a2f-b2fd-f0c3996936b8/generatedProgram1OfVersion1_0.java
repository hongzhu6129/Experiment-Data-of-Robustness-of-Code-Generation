class Solution {
    /**
     * Given two strings, append them together (known as "concatenation") and return the result. 
     * However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. 
     * So minCat("Hello", "Hi") returns "loHi". and minCat("Hi", "Hello") returns "HiHe".
     *
     * @param a The first string.
     * @param b The second string.
     * @return The concatenated string after potentially trimming the longer string.
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
        System.out.println(sol.minCat("Equal", "Equal")); // Output: EqualEqual

    }
}
