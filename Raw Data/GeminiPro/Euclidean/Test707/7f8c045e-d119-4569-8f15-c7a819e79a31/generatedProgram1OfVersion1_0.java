class Solution {
    /**
     * Given an integer column number, return its corresponding column title as it appears in an Excel sheet.
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
            n--; // Adjust for 0-based indexing
            char c = (char) ('A' + n % 26);
            sb.insert(0, c);
            n /= 26;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(Column(1));  // Output: A
        System.out.println(Column(26)); // Output: Z
        System.out.println(Column(27)); // Output: AA
        System.out.println(Column(52)); // Output: AZ
        System.out.println(Column(701)); // Output: ZY 
        System.out.println(Column(702));  //Output: ZZ
        System.out.println(Column(703)); // Output: AAA

    }
}
