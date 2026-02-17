public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }

        int len = str.length();
        if (len % n != 0) {
            System.out.println("String cannot be divided into " + n + " equal parts.");
            return;
        }

        int partSize = len / n;

        for (int i = 0; i < n; i++) {
            int startIndex = i * partSize;
            int endIndex = startIndex + partSize;
            System.out.println(str.substring(startIndex, endIndex));
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuv";
        int n1 = 4;
        System.out.println("Splitting \"" + str1 + "\" into " + n1 + " parts:");
        splitString(str1, n1);


        String str2 = "abcdefghijklm";
        int n2 = 3;
        System.out.println("\nSplitting \"" + str2 + "\" into " + n2 + " parts:");
        splitString(str2, n2);



        String str3 = "abcdefgh";
        int n3 = 5; // Example where the string can't be evenly divided.
        System.out.println("\nSplitting \"" + str3 + "\" into " + n3 + " parts:");
        splitString(str3, n3);

         String str4 = null; //test null input
        System.out.println("\nSplitting \"" + str4 + "\" into " + n3 + " parts:");
        splitString(str4, 3);

        String str5 = "";// test empty String
        System.out.println("\nSplitting \"" + str5 + "\" into " + n3 + " parts:");
        splitString(str5, 3);

    }
}
