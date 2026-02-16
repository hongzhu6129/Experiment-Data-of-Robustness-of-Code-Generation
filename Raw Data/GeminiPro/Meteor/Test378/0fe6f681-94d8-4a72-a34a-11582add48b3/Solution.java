class Solution {
    /**
     * Creates a new string by taking a specified number of characters from the beginning and end of a given string.
     *
     * @param str The input string.
     * @param n   The number of characters to take from the beginning and end.
     * @return The new string formed by concatenating the first 'n' and last 'n' characters of 'str'. 
     *         Returns the original string if 'n' exceeds the string length.
     */
    public String nTwice(String str, int n) {
        int len = str.length();

        if (n > len) {
            return str;
        }

        return str.substring(0, n) + str.substring(len - n);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "Hello";
        int n1 = 2;
        System.out.println(solution.nTwice(str1, n1)); // Output: Heo

        String str2 = "Chocolate";
        int n2 = 3;
        System.out.println(solution.nTwice(str2, n2)); // Output: Choate

        String str3 = "Java";
        int n3 = 5;  // n exceeds string length
        System.out.println(solution.nTwice(str3, n3)); // Output: Java

        String str4 = ""; // Empty string
        int n4 = 2;
        System.out.println(solution.nTwice(str4, n4)); // Output: ""


    }
}
