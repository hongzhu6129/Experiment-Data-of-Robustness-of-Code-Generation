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
        System.out.println("701 = " + Column(701)); //ZY
        System.out.println("1 = " + Column(1));     //A
        System.out.println("26 = " + Column(26));   //Z
        System.out.println("27 = " + Column(27));   //AA
        System.out.println("28 = " + Column(28));  //AB
        System.out.println("52 = " + Column(52));  //AZ
        System.out.println("53 = " + Column(53)); //BA

    }
}
