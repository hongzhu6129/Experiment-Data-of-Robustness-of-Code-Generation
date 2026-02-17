public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }

        int strLength = str.length();

        if (n <= 0) {
            System.out.println("Invalid value of n (must be greater than 0).");
            return;
        }
        
        if (strLength < n) {
            System.out.println("String length is less than n. Cannot split.");
            return;
        }

        int partLength = strLength / n; // Calculate the length of each part


        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            int endIndex = startIndex + partLength;
            if (i == n - 1) {
                // For the last part, include any remaining characters
                endIndex = strLength; 
            }
            System.out.println(str.substring(startIndex, endIndex));
            startIndex = endIndex; // Update the starting index for the next part
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuvwxy";
        int n1 = 5;
        System.out.println("Splitting \"" + str1 + "\" into " + n1 + " parts:");
        splitString(str1, n1);

        System.out.println("\n"); // Add an empty line for separation

        String str2 = "HelloWorld";
        int n2 = 2;
        System.out.println("Splitting \"" + str2 + "\" into " + n2 + " parts:");
        splitString(str2, n2);



        System.out.println("\n");

        String str3 = "programming"; // Example with uneven split
        int n3 = 3;
        System.out.println("Splitting \"" + str3 + "\" into " + n3 + " parts:");
        splitString(str3, n3);

        System.out.println("\n");


        String str4 = "test"; // Example with string shorter than n
        int n4 = 5;
        System.out.println("Splitting \"" + str4 + "\" into " + n4 + " parts:");
        splitString(str4, n4);


        System.out.println("\n");


        String str5 = ""; // Example with empty string
        int n5 = 2;
        System.out.println("Splitting \"" + str5 + "\" into " + n5 + " parts:");
        splitString(str5, n5);



        System.out.println("\n");


        String str6 = "java"; // Example with n = 0
        int n6 = 0;
        System.out.println("Splitting \"" + str6 + "\" into " + n6 + " parts:");
        splitString(str6, n6);





    }
}
