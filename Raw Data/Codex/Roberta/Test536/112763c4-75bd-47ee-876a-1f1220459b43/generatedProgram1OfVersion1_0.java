public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string cannot be null or empty.");
            return;
        }

        int strLength = str.length();

        if (n <= 0) {
            System.out.println("Number of parts (n) must be greater than 0.");
            return;
        }

        if (strLength < n) {
            System.out.println("The string length is less than the number of parts (n). Cannot split.");
            return;
        }

        int partSize = strLength / n;
        int remainder = strLength % n;

        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            int endIndex = startIndex + partSize;

            // Distribute the remainder across the parts
            if (remainder > 0) {
                endIndex++;
                remainder--;
            }

            System.out.println(str.substring(startIndex, endIndex));

            startIndex = endIndex;
        }
    }


    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuvwxy";
        int n1 = 5;
        System.out.println("Splitting '" + str1 + "' into " + n1 + " parts:");
        splitString(str1, n1);

        System.out.println("\n---");

        String str2 = "abcdefgh";
        int n2 = 3;
        System.out.println("Splitting '" + str2 + "' into " + n2 + " parts:");
        splitString(str2, n2);

        System.out.println("\n---");
         String str3 = "abc";  // String length less than n
        int n3 = 4;
        System.out.println("Splitting '" + str3 + "' into " + n3 + " parts:");
        splitString(str3, n3);


        System.out.println("\n---");
        String str4 = "abcdef";
        int n4 = 0; // n <= 0
        System.out.println("Splitting '" + str4 + "' into " + n4 + " parts:");
        splitString(str4, n4);


        System.out.println("\n---");
         String str5 = null; // null String 
        int n5 = 2; 
        System.out.println("Splitting '" + str5 + "' into " + n5 + " parts:");
        splitString(str5, n5);



    }
}
