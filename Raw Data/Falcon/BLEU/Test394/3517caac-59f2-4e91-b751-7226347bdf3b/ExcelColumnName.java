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
        System.out.println("Column name for 28 : " + Column(28)); // AB
        System.out.println("Column name for 51 : " + Column(51)); // AY
        System.out.println("Column name for 52 : " + Column(52)); // AZ
        System.out.println("Column name for 80 : " + Column(80)); // CB
        System.out.println("Column name for 676 : " + Column(676)); // YZ
        System.out.println("Column name for 702 : " + Column(702)); // ZZ
        System.out.println("Column name for 705 : " + Column(705)); // AAC

    }
}



