public class SubstringExample {

    public static void main(String[] args) {
        String str = "programming";
        int start = 3; // Start position (inclusive)
        int end = 7;   // End position (exclusive)

        if (start >= 0 && end <= str.length() && start <= end) {
            String sub = str.substring(start, end);
            System.out.println("Original string: " + str);
            System.out.println("Substring: " + sub);
        } else {
            System.out.println("Invalid start or end positions.");
        }


        // Another example with different positions:
         str = "example string";
         start = 2;
         end = 9;

        if (start >= 0 && end <= str.length() && start <= end) {
            String sub = str.substring(start, end);
            System.out.println("Original string: " + str);
            System.out.println("Substring: " + sub);
        } else {
            System.out.println("Invalid start or end positions.");
        }


        // Example demonstrating error handling
        str = "short";
        start = 2;
        end = 10; //  Beyond the string length

        if (start >= 0 && end <= str.length() && start <= end) {
            String sub = str.substring(start, end);
            System.out.println("Original string: " + str);
            System.out.println("Substring: " + sub);

        } else {
            System.out.println("Invalid start or end positions.");
        }


    }
}
