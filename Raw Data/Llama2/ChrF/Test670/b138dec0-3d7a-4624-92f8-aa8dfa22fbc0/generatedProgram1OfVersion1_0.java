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
     * @param n the column number
     * @return the column title
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; // Adjust n to be 0-indexed
            int remainder = n % 26;
            char c = (char) ('A' + remainder);
            sb.insert(0, c);
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Column(1)); // A
        System.out.println(Column(26)); // Z
        System.out.println(Column(27)); // AA
        System.out.println(Column(28)); // AB
        System.out.println(Column(52)); // AZ
        System.out.println(Column(701)); // AAY
        System.out.println(Column(702)); // AAZ
        System.out.println(Column(703)); // ABA

    }
}
