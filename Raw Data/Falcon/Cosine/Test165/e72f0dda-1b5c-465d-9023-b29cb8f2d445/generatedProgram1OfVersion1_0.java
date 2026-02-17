class Solution {
    /**
     * Given a column number (integer value), return its corresponding Excel column name.
     *
     * @param n The column number (1-based index).
     * @return The Excel column name.
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; // Adjust for 0-based indexing
            int remainder = n % 26;
            char ch = (char) ('A' + remainder);
            sb.insert(0, ch);
            n /= 26;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(Column(1));    // Output: A
        System.out.println(Column(28));   // Output: AB
        System.out.println(Column(701));  // Output: ZY
        System.out.println(Column(26));   // Output: Z
        System.out.println(Column(52));   // Output: AZ
        System.out.println(Column(702));  // Output: ZZ
        System.out.println(Column(703));   //Output: AAA

    }
}


