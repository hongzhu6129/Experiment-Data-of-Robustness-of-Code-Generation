class Solution {
    /**
     * Given an integer column number, return its corresponding column title as it appears in an Excel sheet.
     *
     * For example:
     *
     *     1 -> A
     *     2 -> B
     *     3 -> C
     *     ...
     *     26 -> Z
     *     27 -> AA
     *     28 -> AB
     *     ...
     *
     * @param columnNumber The column number.
     * @return The corresponding column title.
     */
    public static String Column(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26; // Adjust to 0-based indexing
            sb.insert(0, (char)('A' + remainder));
            columnNumber = (columnNumber - 1) / 26; // Adjust for 0-based indexing
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Column(1)); // Output: A
        System.out.println(Column(28)); // Output: AB
        System.out.println(Column(701)); // Output: ZY
        System.out.println(Column(2147483647)); // Output: FXSHRXW
    }
}
