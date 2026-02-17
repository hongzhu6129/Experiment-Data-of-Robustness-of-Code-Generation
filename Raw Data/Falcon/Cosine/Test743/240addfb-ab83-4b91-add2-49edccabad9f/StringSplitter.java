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
            System.out.println("String length is less than the number of parts. Cannot split.");
            return;
        }


        int partSize = strLength / n;
        int remainder = strLength % n; // Handle cases where string length is not perfectly divisible by n

        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            int endIndex = startIndex + partSize;

            // Distribute remainder characters among the parts
            if (i < remainder) {
                endIndex++; 
            }

            System.out.println("Part " + (i + 1) + ": " + str.substring(startIndex, endIndex));
            startIndex = endIndex;
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuvwxy";  //Example with equal split
        int n1 = 5;
        splitString(str1, n1);

        System.out.println("\n---\n"); // Separator

        String str2 = "abcdefghij"; // Example with unequal split due to remainder
        int n2 = 3;
        splitString(str2, n2);

        System.out.println("\n---\n"); // Separator

        //Test cases to check edge cases and validation
        splitString(null, 5);
        splitString("", 3);
        splitString("abc", 0);
        splitString("abc", 5); // n > string length




    }
}

