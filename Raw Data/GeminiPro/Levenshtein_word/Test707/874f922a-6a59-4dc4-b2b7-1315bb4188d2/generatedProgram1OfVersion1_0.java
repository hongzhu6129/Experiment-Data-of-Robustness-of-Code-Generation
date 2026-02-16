class Solution {
    /**
     * Given a positive integer representing an Excel column number, return its corresponding column name.
     *
     * @param n The column number (1-based index).
     * @return The corresponding column name.
     *
     * Examples:
     * 1 -> "A"
     * 2 -> "B"
     * 26 -> "Z"
     * 27 -> "AA"
     * 28 -> "AB"
     * 701 -> "ZY"
     * 702 -> "ZZ"
     * 703 -> "AAA"
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
        System.out.println("1 -> " + Column(1));
        System.out.println("2 -> " + Column(2));
        System.out.println("26 -> " + Column(26));
        System.out.println("27 -> " + Column(27));
        System.out.println("28 -> " + Column(28));
        System.out.println("701 -> " + Column(701));
        System.out.println("702 -> " + Column(702));
        System.out.println("703 -> " + Column(703));
        System.out.println("52 -> " + Column(52)); 
        System.out.println("705 -> " + Column(705)); //AAB
        System.out.println("18278 -> " + Column(18278)); //ZZZ

    }
}
