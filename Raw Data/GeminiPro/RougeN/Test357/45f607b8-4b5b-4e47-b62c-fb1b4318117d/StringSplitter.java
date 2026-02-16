public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string cannot be null or empty.");
            return;
        }

        int len = str.length();
        int partLength = len / n;

        if (len % n != 0) {
            System.out.println("String cannot be divided into " + n + " equal parts.");
            return;
        }

        for (int i = 0; i < n; i++) {
            int start = i * partLength;
            int end = (i + 1) * partLength;
            System.out.println(str.substring(start, end));
        }
    }


    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrst";  // Example string
        int n = 4;                         // Number of parts

        splitString(str, n);

        str = "abcdefghijklmno";
        n = 3;
        splitString(str, n);

        str = "abcdefg";
        n = 3; // won't divide evenly
        splitString(str,n);

        str = ""; // Empty string
        n = 2;
        splitString(str, n);


        str = null; // Null string
        n = 2;
        splitString(str, n);

    }
}
