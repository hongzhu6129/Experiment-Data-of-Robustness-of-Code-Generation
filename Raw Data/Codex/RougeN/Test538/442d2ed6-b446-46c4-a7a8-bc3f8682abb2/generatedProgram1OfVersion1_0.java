public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string cannot be null or empty.");
            return;
        }

        int strLength = str.length();

        if (n <= 0 || n > strLength) {
            System.out.println("Invalid value for 'n'.  'n' must be a positive integer less than or equal to the string length.");
            return;
        }


        int partLength = strLength / n;
        int remainder = strLength % n;

        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            int endIndex = startIndex + partLength;

            // Distribute the remainder across the parts
            if (i < remainder) {
                endIndex++;
            }

            System.out.println(str.substring(startIndex, endIndex));

            startIndex = endIndex;
        }

    }

    public static void main(String[] args) {
        // Example usage:
        String str1 = "abcdefghijklmnopqrst";
        int n1 = 4;
        splitString(str1, n1);
        System.out.println();  // Add a separator between examples

        String str2 = "abcdefghijklm";
        int n2 = 3;
        splitString(str2, n2);
        System.out.println();

        splitString("", 3); // Test empty string
        splitString("abc", 0); // Test n = 0
        splitString("abc", 4); // Test n > string length
        splitString(null, 2); // Test null string

    }
}
