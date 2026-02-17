class Solution {
    /**
     * Given a column number (integer value), return the corresponding Excel column name.
     *
     * @param n The column number (1-based index).
     * @return The Excel column name.
     *
     * Examples:
     * 1 -> A
     * 2 -> B
     * 26 -> Z
     * 27 -> AA
     * 28 -> AB
     * 702 -> ZZ
     * 703 -> AAA
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; // Adjust for 0-based indexing
            int rem = n % 26;
            sb.insert(0, (char) ('A' + rem));
            n /= 26;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println("1 -> " + Column(1));     // A
        System.out.println("2 -> " + Column(2));     // B
        System.out.println("26 -> " + Column(26));    // Z
        System.out.println("27 -> " + Column(27));    // AA
        System.out.println("28 -> " + Column(28));    // AB
        System.out.println("702 -> " + Column(702));  // ZZ
        System.out.println("703 -> " + Column(703));  // AAA
        System.out.println("52 -> " + Column(52));  // AZ
        System.out.println("705 -> " + Column(705));  // AAC


    }
}
