public class SubstringExample {

    public static void main(String[] args) {
        String str = "This is a test string";

        // Get substring from index 10 to 15 (exclusive of 15)
        int startIndex = 10;
        int endIndex = 15;

        if (startIndex >= 0 && endIndex <= str.length() && startIndex <= endIndex) {
            String substring = str.substring(startIndex, endIndex);
            System.out.println("Substring: " + substring); // Output: "a tes"
        } else {
            System.out.println("Invalid start or end indices.");
        }


        // Another Example (handling potential errors more robustly):

        String str2 = "Programming";
        int start2 = 4;
        int end2 = 12;  // Intentionally beyond the string length


        try {
            String substring2 = str2.substring(start2, end2);
            System.out.println("Substring 2: " + substring2);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());  //  Clearly indicate the error
        }


        // Example with user input (you would typically handle this in a larger application):

        String str3 = "JavaExample";

        if (args.length == 2) { // Check if two command-line arguments are provided.
            try {
                int start3 = Integer.parseInt(args[0]);
                int end3 = Integer.parseInt(args[1]);

                String substring3 = str3.substring(start3, end3);
                System.out.println("Substring 3 (from command-line arguments): " + substring3);

            } catch (NumberFormatException e) {
                System.err.println("Error: Invalid input.  Arguments must be integers.");
            } catch (StringIndexOutOfBoundsException e) {
                 System.err.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Please provide two integer arguments for start and end indices.");
        }

    }
}
