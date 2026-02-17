class Solution {
    /**
     * Given a column number in an Excel sheet, return its corresponding column name.
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
        StringBuilder columnName = new StringBuilder();

        while (n > 0) {
            int remainder = (n - 1) % 26;
            columnName.insert(0, (char) ('A' + remainder));
            n = (n - 1) / 26;
        }

        return columnName.toString();
    }

    public static void main(String[] args) {
        System.out.println(Column(1));   // Output: A
        System.out.println(Column(26));  // Output: Z
        System.out.println(Column(27));  // Output: AA
        System.out.println(Column(52));  // Output: AZ
        System.out.println(Column(701)); // Output: ZY
        System.out.println(Column(702)); // Output: ZZ
        System.out.println(Column(703)); // Output: AAA
        System.out.println(Column(705)); // Output: AAC

    }
}
