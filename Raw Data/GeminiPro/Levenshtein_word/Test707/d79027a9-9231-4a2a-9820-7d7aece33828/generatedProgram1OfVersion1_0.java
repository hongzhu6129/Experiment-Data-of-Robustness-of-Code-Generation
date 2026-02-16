class Solution {
    /**
     * Given a positive integer that represents the column number in an Excel spreadsheet,
     * return its corresponding column name.
     *
     * For example:
     *
     * 1 -> A
     * 2 -> B
     * ...
     * 26 -> Z
     * 27 -> AA
     * 28 -> AB
     * ...
     * 701 -> ZY
     * 702 -> ZZ
     * 703 -> AAA
     * ...
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
        System.out.println("Column name of 1: " + Column(1)); // Output: A
        System.out.println("Column name of 26: " + Column(26)); // Output: Z
        System.out.println("Column name of 27: " + Column(27)); // Output: AA
        System.out.println("Column name of 52: " + Column(52)); // Output: AZ
        System.out.println("Column name of 701: " + Column(701)); // Output: ZY
        System.out.println("Column name of 702: " + Column(702)); // Output: ZZ
        System.out.println("Column name of 703: " + Column(703)); // Output: AAA
		System.out.println("Column name of 28: " + Column(28)); // Output: AB
        System.out.println("Column name of 705: " + Column(705)); // Output: AAC

    }
}
