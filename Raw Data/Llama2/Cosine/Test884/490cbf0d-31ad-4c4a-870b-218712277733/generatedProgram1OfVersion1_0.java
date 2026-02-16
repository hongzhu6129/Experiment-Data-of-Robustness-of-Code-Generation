class Solution {
    /**
     * Given a positive integer, return its corresponding column title as appear in Excel sheet.
     * For example:
     *     1 -> A
     *     2 -> B
     *     3 -> C
     *     ...
     *     26 -> Z
     *     27 -> AA
     *     28 -> AB 
     *     ...
     * Example 1:
     * Input: 1
     * Output: "A"
     * Example 2:
     * Input: 28
     * Output: "AB"
     * Example 3:
     * Input: 701
     * Output: "ZY"
     * Example 4:
     * Input: 2147483647
     * Output: "FXSHRXW"
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--; // Adjust n to be 0-indexed
            int rem = n % 26;
            sb.insert(0, (char) ('A' + rem));
            n = n / 26;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Column 1: " + Column(1)); // Output: A
        System.out.println("Column 28: " + Column(28)); // Output: AB
        System.out.println("Column 701: " + Column(701)); // Output: ZY
        System.out.println("Column 2147483647: " + Column(2147483647)); // Output: FXSHRXW
        System.out.println("Column 703: " + Column(703)); // Output: AAA


        // Additional tests
        System.out.println("Column 26: " + Column(26)); // Z
        System.out.println("Column 52: " + Column(52)); // AZ
        System.out.println("Column 27: " + Column(27)); // AA
    }
}
