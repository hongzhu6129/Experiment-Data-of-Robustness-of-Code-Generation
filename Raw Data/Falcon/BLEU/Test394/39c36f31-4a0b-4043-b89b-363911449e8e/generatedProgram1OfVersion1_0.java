class Solution {
    /**
     * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
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
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; // Adjust n to be 0-indexed for character calculation
            int remainder = n % 26;
            char ch = (char) ('A' + remainder);
            sb.insert(0, ch);
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Column 1: " + Column(1)); // A
        System.out.println("Column 2: " + Column(2)); // B
        System.out.println("Column 26: " + Column(26)); // Z
        System.out.println("Column 27: " + Column(27)); // AA
        System.out.println("Column 28: " + Column(28)); // AB
        System.out.println("Column 52: " + Column(52)); // AZ
        System.out.println("Column 701: " + Column(701)); // ZY
        System.out.println("Column 702: " + Column(702)); // ZZ
        System.out.println("Column 703: " + Column(703)); // AAA 
        System.out.println("Column 18278: " + Column(18278)); // ZZZ

    }
}
