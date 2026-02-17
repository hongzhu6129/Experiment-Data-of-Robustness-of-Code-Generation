public class SubstringExample {

    public static void main(String[] args) {
        String str = "This is a test string";
        int startIndex = 10;
        int endIndex = 15;

        // Handle potential IndexOutOfBoundsException
        if (startIndex < 0 || endIndex > str.length() || startIndex > endIndex) {
            System.out.println("Invalid start or end indices.");
            return; // Exit if indices are invalid
        }

        String substring = str.substring(startIndex, endIndex);
        System.out.println("Original String: " + str);
        System.out.println("Substring: " + substring);


        // Example with different indices, demonstrating robust handling:
        startIndex = 5;
        endIndex = 25; // Beyond the string length
        if (startIndex < 0 || endIndex > str.length() || startIndex > endIndex) {
            System.out.println("Invalid start or end indices (second example).");
            return; // Exit if indices are invalid
        }


        startIndex = 15;
        endIndex = 10; // start > end
         if (startIndex < 0 || endIndex > str.length() || startIndex > endIndex) {
            System.out.println("Invalid start or end indices (third example).");
            return; 
        }
    }
}
