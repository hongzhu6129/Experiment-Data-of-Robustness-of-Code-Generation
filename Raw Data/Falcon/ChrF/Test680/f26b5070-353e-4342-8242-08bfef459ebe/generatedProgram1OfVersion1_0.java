public class StartsWithWord {

    public static void main(String[] args) {
        String str = "Hello World"; // The string to check
        String prefix = "Hello"; // The word to check for at the beginning

        // Method 1: Using startsWith()
        boolean startsWithPrefix = str.startsWith(prefix);
        System.out.println("Using startsWith(): Does \"" + str + "\" start with \"" + prefix + "\"? " + startsWithPrefix);


        // Method 2:  Manual check using substring (for demonstration)
        if (str.length() >= prefix.length()) {
            String sub = str.substring(0, prefix.length());
            boolean manualCheck = sub.equals(prefix);
            System.out.println("Using substring and equals(): Does \"" + str + "\" start with \"" + prefix + "\"? " + manualCheck);

        } else {
            System.out.println("Using substring and equals(): String is shorter than prefix, so it cannot start with it.");
        }



        // Example with different strings and prefixes:
        checkStartsWith("This is a test", "This"); //true
        checkStartsWith("This is a test", "That"); //false
        checkStartsWith("Testing", "Test"); //true
        checkStartsWith("Short", "Longer Prefix"); //false


    }

    // Helper method to encapsulate the checks (not strictly necessary but improves readability)
    public static void checkStartsWith(String str, String prefix) {
        boolean startsWith = str.startsWith(prefix);
        System.out.println("Does \"" + str + "\" start with \"" + prefix + "\"? " + startsWith);
    }
}
