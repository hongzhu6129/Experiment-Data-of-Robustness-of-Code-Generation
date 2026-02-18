class Solution {
    /**
     * Given a positive integer, return its corresponding column title as appear in Excel sheet.
     *
     * For example:
     *
     * 1 -> A
     * 2 -> B
     * 3 -> C
     * ...
     * 26 -> Z
     * 27 -> AA
     * 28 -> AB
     * ...
     * Example 1:
     * Input: 1
     * Output: "A"
     *
     * Example 2:
     * Input: 28
     * Output: "AB"
     *
     * Example 3:
     * Input: 701
     * Output: "ZY"
     *
     * Example 4:
     * Input: 2147483647
     * Output: "FXSHRXW"
     *
     * Constraints:
     * 1 <= columnNumber <= 2^31 - 1
     */
    public static String Column(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26; // Adjust for 0-based indexing
            char ch = (char) ('A' + remainder);
            sb.insert(0, ch); // Insert at the beginning
            columnNumber = (columnNumber - 1) / 26; // Integer division for next iteration
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Column(1));     // Output: A
        System.out.println(Column(28));    // Output: AB
        System.out.println(Column(701));   // Output: ZY
        System.out.println(Column(2147483647)); // Output: FXSHRXW

        // Additional test cases:
        System.out.println(Column(26));    // Output: Z
        System.out.println(Column(52));    // Output: AZ
        System.out.println(Column(702));   // Output: ZZ
        System.out.println(Column(703));   // Output: AAA
    }
}
