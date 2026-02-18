class Solution {
    /**
     * Given a positive integer, return its corresponding column title as appear in Excel sheet.
     * For example:
     *     1 -> A
     *     2 -> B
     *     3 -> C
     *     ...
     *     26 -> Z
     *     27 -> AA
     *     28 -> AB 
     *     ...
     */
    public static String Column(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; // Adjust n to be 0-indexed
            int rem = n % 26;
            sb.insert(0, (char)('A' + rem));
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("1 => " + Column(1));
        System.out.println("2 => " + Column(2));
        System.out.println("3 => " + Column(3));
        System.out.println("26 => " + Column(26));
        System.out.println("27 => " + Column(27));
        System.out.println("28 => " + Column(28));
        System.out.println("52 => " + Column(52));
        System.out.println("702 => "+ Column(702)); //ZZ
        System.out.println("703 => "+ Column(703)); //AAA
        System.out.println("18278 => "+ Column(18278));//ZZZ
        System.out.println("18279 => "+ Column(18279)); //AAAA
    }
}
