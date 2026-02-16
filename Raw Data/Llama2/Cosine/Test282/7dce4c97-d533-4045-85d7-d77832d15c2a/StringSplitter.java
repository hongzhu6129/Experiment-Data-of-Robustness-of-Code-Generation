public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string cannot be null or empty.");
            return;
        }

        int len = str.length();
        int partLen = len / n; 

        if (len % n != 0) {
            System.out.println("String cannot be divided into " + n + " equal parts.");
            return;
        }


        for (int i = 0; i < n; i++) {
            int start = i * partLen;
            int end = start + partLen;
            String part = str.substring(start, end);
            System.out.println(part);
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        int n1 = 3;
        System.out.println("Splitting \"" + str1 + "\" into " + n1 + " parts:");
        splitString(str1, n1);

        System.out.println(); // Add a newline for clarity

        String str2 = "abcdefghijklm";
        int n2 = 4;
        System.out.println("Splitting \"" + str2 + "\" into " + n2 + " parts:");
        splitString(str2, n2);


        System.out.println();

        String str3 = "abcdefg";
        int n3 = 3;
        System.out.println("Splitting \"" + str3 + "\" into " + n3 + " parts:");
        splitString(str3, n3); // Example where the string cannot be equally divided


         System.out.println();

        String str4 = ""; // Empty string test case
        int n4 = 2;
        System.out.println("Splitting \"" + str4 + "\" into " + n4 + " parts:");
        splitString(str4, n4);

        System.out.println();

        String str5 = null; // Null string test case
        int n5 = 2;
        System.out.println("Splitting \"" + str5 + "\" into " + n5 + " parts:");
        splitString(str5, n5);





    }
}
