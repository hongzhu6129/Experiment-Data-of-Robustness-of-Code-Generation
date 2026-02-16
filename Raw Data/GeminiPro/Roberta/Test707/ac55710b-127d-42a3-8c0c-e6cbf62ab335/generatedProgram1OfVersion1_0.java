class Solution {
    /**
     * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
     * For example:
     * 1 -> A
     * 2 -> B
     * 3 -> C
     * ...
     * 26 -> Z
     * 27 -> AA
     * 28 -> AB
     * ...
     *
     * @param n The column number (integer value).
     * @return The corresponding Excel column name.
     */
    public static String Column(int n) {
        StringBuilder columnName = new StringBuilder();

        while (n > 0) {
            int rem = n % 26;

            if (rem == 0) {
                columnName.append("Z");
                n = (n / 26) - 1;
            } else {
                columnName.append((char) ((rem - 1) + 'A'));
                n = n / 26;
            }
        }

        return columnName.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("701: " + Column(701)); // Expected: ZY
        System.out.println("1: " + Column(1));   // Expected: A
        System.out.println("28: " + Column(28));  // Expected: AB
        System.out.println("702: " + Column(702)); // Expected: ZZ
        System.out.println("703: " + Column(703)); // Expected: AAA
        System.out.println("52: " + Column(52));  // Expected: AZ
        System.out.println("26: " + Column(26));  // Expected: Z
        System.out.println("27: " + Column(27));  // Expected: AA


    }
}
