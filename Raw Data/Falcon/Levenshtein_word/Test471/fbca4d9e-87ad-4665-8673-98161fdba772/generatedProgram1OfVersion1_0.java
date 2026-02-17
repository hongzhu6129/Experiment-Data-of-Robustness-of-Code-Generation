public class ExcelColumnName {

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
        System.out.println("Column name for 1: " + Column(1)); // A
        System.out.println("Column name for 28: " + Column(28)); // AB
        System.out.println("Column name for 702: " + Column(702)); // ZZ
        System.out.println("Column name for 52: " + Column(52)); // AZ
        System.out.println("Column name for 705: " + Column(705)); // AAC

        // More test cases:
        System.out.println("Column name for 27: " + Column(27)); // AA
        System.out.println("Column name for 51: " + Column(51)); // AY
        System.out.println("Column name for 78 : " + Column(78 )); // BZ
        System.out.println("Column name for 18278: " + Column(18278)); // AAAA

    }
}
