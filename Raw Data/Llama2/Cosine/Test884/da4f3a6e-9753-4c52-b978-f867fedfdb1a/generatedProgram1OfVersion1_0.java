class Solution {
    /**
     * Given a column number in Excel, return its corresponding column name.
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

            // If remainder is 0, then a 'Z' must be appended
            if (rem == 0) {
                columnName.append("Z");
                n = (n / 26) - 1;
            } else { // If remainder is non-zero
                columnName.append((char) ((rem - 1) + 'A'));
                n = n / 26;
            }
        }

        return columnName.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Column name for 1: " + Column(1));
        System.out.println("Column name for 26: " + Column(26));
        System.out.println("Column name for 27: " + Column(27));
        System.out.println("Column name for 52: " + Column(52));
        System.out.println("Column name for 701: " + Column(701)); 
        System.out.println("Column name for 702: " + Column(702));
        System.out.println("Column name for 703: " + Column(703));
        System.out.println("Column name for 16384: " + Column(16384)); // XFD
        System.out.println("Column name for 16385:" + Column(16385)); // XFE
         System.out.println("Column name for 26:" + Column(26)); // Z
    }
}
