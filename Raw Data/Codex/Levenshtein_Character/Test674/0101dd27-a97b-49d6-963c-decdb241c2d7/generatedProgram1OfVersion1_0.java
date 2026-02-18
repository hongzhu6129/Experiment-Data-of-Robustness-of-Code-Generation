class Solution {
    /**
     * Given a column number (integer value), return its corresponding Excel column name.
     *
     * @param n the column number
     * @return the Excel column name
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = n % 26;
            if (rem == 0) {
                sb.append("Z");
                n = (n / 26) - 1;
            } else {
                sb.append((char) ((rem - 1) + 'A'));
                n = n / 26;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(Column(1)); // Output: A
        System.out.println(Column(28)); // Output: AB
        System.out.println(Column(701)); // Output: ZY
        System.out.println(Column(26)); // Output: Z
        System.out.println(Column(52)); // Output: AZ
        System.out.println(Column(702)); // Output: ZZ
        System.out.println(Column(703)); // Output: AAA

    }
}
