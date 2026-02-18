public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string cannot be null or empty.");
            return;
        }

        int len = str.length();
        int partSize;

        if (len % n != 0) {
            System.out.println("String cannot be divided into " + n + " equal parts.");
            return;
        } else {
            partSize = len / n;
        }

        for (int i = 0; i < len; i += partSize) {
            System.out.println(str.substring(i, i + partSize));
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuvwx";
        int n1 = 4;
        System.out.println("Splitting '" + str1 + "' into " + n1 + " parts:");
        splitString(str1, n1);

        System.out.println(); // Add a separator between examples

        String str2 = "abcdefghijklm";
        int n2 = 3;
        System.out.println("Splitting '" + str2 + "' into " + n2 + " parts:");
        splitString(str2, n2);


        System.out.println();

        String str3 = "hello";
        int n3 = 2;
        System.out.println("Splitting '" + str3 + "' into " + n3 + " parts:");
        splitString(str3, n3); // Example demonstrating unequal split handling

        System.out.println();

        String str4 = null; // Testing null string input
        int n4 = 2;
        System.out.println("Splitting '" + str4 + "' into " + n4 + " parts:"); 
        splitString(str4, n4);

         System.out.println();

        String str5 = "";  // Testing empty string input
        int n5 = 3;
        System.out.println("Splitting '" + str5 + "' into " + n5 + " parts:");
        splitString(str5, n5);
    }
}
