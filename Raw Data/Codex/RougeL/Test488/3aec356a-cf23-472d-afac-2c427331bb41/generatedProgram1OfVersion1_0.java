public class GetCharacterBeforeIndex {

    public static void main(String[] args) {
        String inputString = "Hello World!";
        int index = 6; // Example index

        if (args.length >= 2) {  // Check if command-line arguments are provided
            try {
                inputString = args[0];
                index = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid index provided. Using defaults.");
            }
        }


        if (index > 0 && index <= inputString.length()) {
            int codePoint = inputString.codePointBefore(index);
            System.out.println("Character before index " + index + ": " + (char) codePoint + " (Unicode: " + codePoint + ")");
        } else {
            System.out.println("Invalid index. Index should be between 1 and " + inputString.length() + " (inclusive).");
        }


        // More test cases (demonstration)
        test("ExampleString", 5);
        test("AnotherTest", 1);  // Edge case: beginning of string
        test("Testing", 8); // Edge case: end of string
        test("UnicodeExample: \uD83D\uDE00", 2); // Example with a surrogate pair (emoji)

    }


    // Helper function for testing (not required by prompt, but good practice)
    public static void test(String str, int index) {
        if (index > 0 && index <= str.length()) {
            int codePoint = str.codePointBefore(index);
            System.out.println("String: \"" + str + "\", Index: " + index + " -> Character: " + (char) codePoint + " (Unicode: " + codePoint + ")");
        } else {
            System.out.println("String: \"" + str + "\", Index: " + index + " -> Invalid index.");
        }
    }
}
