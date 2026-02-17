class Solution {
    /**
     * Given a column number in Excel, return its corresponding column name.
     *
     * @param n The column number.
     * @return The corresponding column name.
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
        System.out.println("Column 1: " + Column(1)); // Output: A
        System.out.println("Column 28: " + Column(28)); // Output: AB
        System.out.println("Column 701: " + Column(701)); // Output: ZY
        System.out.println("Column 702: " + Column(702)); //Output: ZZ
        System.out.println("Column 703: " + Column(703)); // Output: AAA
        System.out.println("Column 26: " + Column(26)); // Output: Z
        System.out.println("Column 52: " + Column(52)); // Output: AZ


    }
}
