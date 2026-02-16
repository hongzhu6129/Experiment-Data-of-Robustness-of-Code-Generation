public class StartsWithWord {

    public static void main(String[] args) {
        String str = "Hello World"; // Example string
        String prefix = "Hello"; // Prefix to check

        // Method 1: Using startsWith() method
        boolean startsWithPrefix = str.startsWith(prefix);
        System.out.println("Using startsWith(): \"" + str + "\" starts with \"" + prefix + "\": " + startsWithPrefix);


        // Method 2: Manual check (using substring and equals) - for demonstration
        if (str.length() >= prefix.length()) {
            String sub = str.substring(0, prefix.length());
            boolean manualCheck = sub.equals(prefix);
            System.out.println("Using manual check: \"" + str + "\" starts with \"" + prefix + "\": " + manualCheck);
        } else {
            System.out.println("Using manual check: String is shorter than prefix, so it cannot start with it.");

        }


        //More examples:
        checkStartsWith("This is a test", "This");
        checkStartsWith("This is a test", "That");
        checkStartsWith("Testing", "Test");
        checkStartsWith("Test", "Testing"); // Demonstrates that a longer prefix will not match
        checkStartsWith("", "Test");        // Empty string does not start with anything (except an empty prefix).
        checkStartsWith("Hello", "");        // Any string starts with an empty string

    }

    // Helper function to encapsulate the checks (optional) - this makes main cleaner
    private static void checkStartsWith(String str, String prefix) {
        boolean startsWith = str.startsWith(prefix);
        System.out.println("\"" + str + "\" starts with \"" + prefix + "\": " + startsWith);

    }


}
