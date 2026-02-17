public class StringSplitter {

    static void splitString(String str, int n) {
        int str_size = str.length();

        // Check if string can be divided into n equal parts
        if (str_size % n != 0) {
            System.out.println("String cannot be divided into " + n + " equal parts.");
            return;
        }

        int part_size = str_size / n;
        for (int i = 0; i < str_size; i += part_size) {
            System.out.println(str.substring(i, i + part_size));
        }
    }


    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrst";
        int n = 4;
        splitString(str, n);


        str = "abcdefghijklm";
        n = 3;
        splitString(str, n);


        str = "abcdefgh";
        n = 5;
        splitString(str, n); // Demonstrates the "cannot be divided" case
    }
}
