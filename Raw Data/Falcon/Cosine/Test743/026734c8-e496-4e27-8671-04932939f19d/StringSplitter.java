public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }

        int strLength = str.length();

        if (n <= 0) {
            System.out.println("n must be a positive integer.");
            return;
        }

        if (strLength % n != 0) {
            System.out.println("String cannot be divided into " + n + " equal parts.");
            return;
        }


        int partLength = strLength / n;

        for (int i = 0; i < n; i++) {
            int start = i * partLength;
            int end = start + partLength;
            System.out.println(str.substring(start, end));
        }
    }


    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuvwx";
        int n1 = 4;
        System.out.println("Splitting \"" + str1 + "\" into " + n1 + " parts:");
        splitString(str1, n1);

        System.out.println("\n------");


        String str2 = "hello";
        int n2 = 2;
        System.out.println("Splitting \"" + str2 + "\" into " + n2 + " parts:");
        splitString(str2, n2);

        System.out.println("\n------");

        String str3 = "programming";
        int n3 = 3; // Won't divide evenly
        System.out.println("Splitting \"" + str3 + "\" into " + n3 + " parts:");
        splitString(str3, n3);

        System.out.println("\n------");

        String str4 = ""; // Empty string
        int n4 = 2;
        System.out.println("Splitting \"" + str4 + "\" into " + n4 + " parts:");
        splitString(str4, n4);

        System.out.println("\n------");


        String str5 = "java";
        int n5 = 0; // Invalid n
        System.out.println("Splitting \"" + str5 + "\" into " + n5 + " parts:");
        splitString(str5, n5);



    }
}
