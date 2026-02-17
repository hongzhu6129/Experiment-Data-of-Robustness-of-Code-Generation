public class StringSplitter {

    static void splitString(String str, int n) {
        if (n <= 0) {
            System.out.println("Invalid split count (n must be > 0).");
            return; 
        }

        int len = str.length();
        if (len < n) {
            System.out.println("String length is less than the split count.");
            return;
        }

        int partSize = len / n;
        int remainder = len % n;

        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            int endIndex = startIndex + partSize;

            // Distribute the remainder characters among the first 'remainder' parts
            if (i < remainder) {
                endIndex++;
            }

            System.out.println(str.substring(startIndex, endIndex));
            startIndex = endIndex;
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        int n1 = 3;
        System.out.println("Splitting \"" + str1 + "\" into " + n1 + " parts:");
        splitString(str1, n1);
        System.out.println();

        String str2 = "hello";
        int n2 = 2;
        System.out.println("Splitting \"" + str2 + "\" into " + n2 + " parts:");
        splitString(str2, n2);
        System.out.println();


        String str3 = "programming";
        int n3 = 5;
        System.out.println("Splitting \"" + str3 + "\" into " + n3 + " parts:");
        splitString(str3, n3);
        System.out.println();

        // Test cases for invalid input
        splitString("test", 0);  // n = 0
        splitString("short", 10); // string length < n


    }
}
