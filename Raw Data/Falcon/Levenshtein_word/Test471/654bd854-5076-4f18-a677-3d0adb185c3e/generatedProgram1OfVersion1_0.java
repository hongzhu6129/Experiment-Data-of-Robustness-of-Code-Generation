class Solution {
    /**
     * Given a column number (integer value), find its corresponding Excel column name.
     *
     * @param n The column number (1-based index).
     * @return The Excel column name.
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = (n - 1) % 26; // Adjust for 0-based indexing
            sb.insert(0, (char) ('A' + rem));
            n = (n - 1) / 26;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(Column(1));   // Output: A
        System.out.println(Column(28));  // Output: AB
        System.out.println(Column(701)); // Output: ZY
        System.out.println(Column(702)); // Output: ZZ
        System.out.println(Column(703)); // Output: AAA
        System.out.println(Column(26));  // Output: Z
        System.out.println(Column(52));  // Output: AZ
    }
}
