class Solution {
    /**
     * Takes two strings and appends them together after making them equal length 
     * by removing characters from the beginning of the longer string.
     *
     * @param a First string.
     * @param b Second string.
     * @return The concatenated string after making string lengths equal.
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
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.minCat("Hello", "Hi")); // loHi
        System.out.println(sol.minCat("Hello", "java")); // ellojava
        System.out.println(sol.minCat("java", "Hello")); // javaello

    }
}
