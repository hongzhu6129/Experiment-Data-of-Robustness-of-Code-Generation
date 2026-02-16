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
        System.out.println(Column(1));   // Output: A
        System.out.println(Column(26));  // Output: Z
        System.out.println(Column(27));  // Output: AA
        System.out.println(Column(28));  // Output: AB
        System.out.println(Column(52));  // Output: AZ
        System.out.println(Column(701)); // Output: ZY
        System.out.println(Column(702)); // Output: ZZ
        System.out.println(Column(703)); // Output: AAA 
        System.out.println(Column(16384)); // Output: XFD (26^3)


    }
}
