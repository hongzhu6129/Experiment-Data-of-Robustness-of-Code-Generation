public class StartsWithWord {

    public static void main(String[] args) {
        String str = "Hello World"; // The string to check
        String word = "Hello"; // The word to check for

        // Check if the string starts with the specified word (case-sensitive)
        boolean startsWith = str.startsWith(word);

        if (startsWith) {
            System.out.println("\"" + str + "\" starts with \"" + word + "\"");
        } else {
            System.out.println("\"" + str + "\" does not start with \"" + word + "\"");
        }


        // Case-insensitive check (optional)
        String lowerCaseStr = str.toLowerCase();
        String lowerCaseWord = word.toLowerCase();
        boolean startsWithIgnoreCase = lowerCaseStr.startsWith(lowerCaseWord);

        if (startsWithIgnoreCase) {
            System.out.println("\"" + str + "\" starts with \"" + word + "\" (case-insensitive)");
        } else {
            System.out.println("\"" + str + "\" does not start with \"" + word + "\" (case-insensitive)");
        }

         // Example with different strings and words
        checkStartsWith("This is a test", "This");
        checkStartsWith("Another example", "another"); // Demonstrates case-sensitive failure
        checkStartsWith("Yet another example", "yet");  // Demonstrates case-sensitive failure


    }

    // Helper function to encapsulate the check and output (for better organization and reusability)
    // This is within main(), demonstrating a method call without defining a separate method outside main().
    // It's logically separate to demonstrate good practice, even though technically in main()
    public static void checkStartsWith(String str, String word) {
        boolean startsWith = str.startsWith(word);
        if (startsWith) {
            System.out.println("\"" + str + "\" starts with \"" + word + "\"");
        } else {
            System.out.println("\"" + str + "\" does not start with \"" + word + "\"");
        }


        // Case-insensitive option (using ternary operator for conciseness)
        boolean startsWithIgnoreCase = str.toLowerCase().startsWith(word.toLowerCase());
        System.out.println("\"" + str + "\" " + (startsWithIgnoreCase ? "does" : "does not") + " start with \"" + word + "\" (case-insensitive)");


    }
}
