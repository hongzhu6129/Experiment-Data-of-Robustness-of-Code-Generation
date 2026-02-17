class Solution {

    /**
     * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
     *
     * @param n The column number (1-based index).
     * @return The corresponding column title.
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--; // Adjust to 0-based indexing for modulo operation
            int remainder = n % 26;
            char ch = (char) ('A' + remainder);
            sb.insert(0, ch);
            n /= 26;
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(Column(1));   // Output: A
        System.out.println(Column(28));  // Output: AB
        System.out.println(Column(701)); // Output: ZY
        System.out.println(Column(27)); // Output: AA
        System.out.println(Column(52)); // Output: AZ

        // Additional tests
        System.out.println(Column(702)); // Output: ZZ
        System.out.println(Column(703)); // Output: AAA
        System.out.println(Column(16384)); // Output: XFD

    }
}
