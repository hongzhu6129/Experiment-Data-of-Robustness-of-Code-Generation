class Solution {
    /**
     * Given a column number in Excel, return the corresponding column name.
     *
     * For example:
     * 1 -> A
     * 2 -> B
     * 3 -> C
     * ...
     * 26 -> Z
     * 27 -> AA
     * 28 -> AB
     * ...
     * 702 -> ZZ
     * 703 -> AAA
     * ...
     *
     * @param n The column number.
     * @return The corresponding column name.
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--; // Adjust n to be 0-indexed for modulo operation
            int remainder = n % 26;
            char c = (char) ('A' + remainder);
            sb.insert(0, c); // Insert at beginning to maintain order
            n /= 26; 
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Column(1));   // Output: A
        System.out.println(Column(26));  // Output: Z
        System.out.println(Column(27));  // Output: AA
        System.out.println(Column(52));  // Output: AZ
        System.out.println(Column(701)); // Output: ZY
        System.out.println(Column(702)); // Output: ZZ
        System.out.println(Column(703)); // Output: AAA 
        System.out.println(Column(16384)); // Output: XFD

    }
}
