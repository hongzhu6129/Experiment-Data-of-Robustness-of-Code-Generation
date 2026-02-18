class Solution {
    /**
     * Given an integer column number, return its corresponding column title as it appears in an Excel sheet.
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
     */
    public static String Column(int n) {
        StringBuilder columnName = new StringBuilder();

        while (n > 0) {
            n--; // Adjust for 0-based indexing
            int remainder = n % 26;
            char character = (char) ('A' + remainder);
            columnName.insert(0, character);
            n = n / 26; 
        }
        return columnName.toString();
    }


    public static void main(String[] args) {
        System.out.println("Column 1: " + Column(1));
        System.out.println("Column 28: " + Column(28));
        System.out.println("Column 701: " + Column(701));
        System.out.println("Column 26: " + Column(26));
        System.out.println("Column 52: " + Column(52));
        System.out.println("Column 702: " + Column(702)); // Example to demonstrate correct behavior beyond ZZ
        System.out.println("Column 18278: " + Column(18278));  // Example exceeding 3 characters

    }
}
