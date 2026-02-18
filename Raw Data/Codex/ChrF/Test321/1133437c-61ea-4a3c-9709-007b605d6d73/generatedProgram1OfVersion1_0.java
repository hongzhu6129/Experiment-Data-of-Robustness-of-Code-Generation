class Solution {
    /**
     * Given a column number (integer value), return the corresponding Excel column name.
     *
     * @param n The column number (1-based index).
     * @return The Excel column name.
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = (n - 1) % 26;
            sb.insert(0, (char) ('A' + rem));
            n = (n - 1) / 26;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println("Column 1: " + Column(1)); // A
        System.out.println("Column 28: " + Column(28)); // AB
        System.out.println("Column 701: " + Column(701)); // ZY
        System.out.println("Column 26: " + Column(26)); // Z
        System.out.println("Column 52: " + Column(52)); // AZ
        System.out.println("Column 702: " + Column(702)); // ZZ
        System.out.println("Column 703: " + Column(703)); // AAA

    }
}
