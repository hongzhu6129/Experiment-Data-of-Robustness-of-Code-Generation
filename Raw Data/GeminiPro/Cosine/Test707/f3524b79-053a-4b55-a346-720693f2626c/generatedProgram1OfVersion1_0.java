public class ExcelColumnName {

    public static String Column(int n) {
        StringBuilder columnName = new StringBuilder();

        while (n > 0) {
            int rem = n % 26;

            if (rem == 0) {
                columnName.insert(0, 'Z');
                n = (n / 26) - 1;
            } else {
                columnName.insert(0, (char) ((rem - 1) + 'A'));
                n = n / 26;
            }
        }
        return columnName.toString();
    }

    public static void main(String[] args) {
        System.out.println("Column name for 1: " + Column(1)); // A
        System.out.println("Column name for 28: " + Column(28)); // AB
        System.out.println("Column name for 701: " + Column(701)); // ZY
        System.out.println("Column name for 702: " + Column(702)); // ZZ
        System.out.println("Column name for 703: " + Column(703)); // AAA
        System.out.println("Column name for 18278: " + Column(18278)); //ZZZ
                System.out.println("Column name for 18279: " + Column(18279)); //AAAA

    }
}
