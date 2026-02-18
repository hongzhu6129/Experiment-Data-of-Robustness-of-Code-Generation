class Solution {
    /**
     * Given a positive integer, return its corresponding column title as appear in Excel sheet.
     * For example:
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
     * Example 2:
     * Input: 28
     * Output: "AB"
     * Example 3:
     * Input: 701
     * Output: "ZY"
     * Example 4:
     * Input: 2147483647
     * Output: "FXSHRXW"
     * @param n the column number
     * @return the column title
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; // Adjust n to be 0-based
            sb.insert(0, (char)('A' + n % 26));
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Column(1)); // A
        System.out.println(Column(28)); // AB
        System.out.println(Column(701)); // ZY
        System.out.println(Column(2147483647)); // FXSHRXW
        System.out.println(Column(52)); //AZ

    }
}
