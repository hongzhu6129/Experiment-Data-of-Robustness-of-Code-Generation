class Solution {
    /**
     * Given a positive integer, return its corresponding column title as appear in Excel sheet.
     *
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
     * @param n The column number (1-based index)
     * @return The corresponding column title
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; // Adjust to 0-based indexing
            int remainder = n % 26;
            char ch = (char) ('A' + remainder);
            sb.insert(0, ch);
            n /= 26;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(Column(1)); // Output: A
        System.out.println(Column(26)); // Output: Z
        System.out.println(Column(27)); // Output: AA
        System.out.println(Column(28)); // Output: AB
        System.out.println(Column(701)); // Output: ZY
        System.out.println(Column(702)); // Output: ZZ
        System.out.println(Column(703)); // Output: AAA
        System.out.println(Column(18278)); // Output: ZZZ

    }
}
