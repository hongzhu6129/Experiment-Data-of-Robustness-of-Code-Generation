public class StringStartsWith {

    public static void main(String[] args) {
        String str = "Hello World"; // The string to check
        String prefix = "Hello";     // The specified word (prefix)

        // Check if the string starts with the prefix using startsWith()
        boolean startsWithPrefix = str.startsWith(prefix);

        // Print the result
        if (startsWithPrefix) {
            System.out.println("\"" + str + "\" starts with \"" + prefix + "\"");
        } else {
            System.out.println("\"" + str + "\" does not start with \"" + prefix + "\"");
        }


        // Another example (case-insensitive check - must handle nulls safely)
        String str2 = "hello world";
        String prefix2 = "Hello";

        boolean startsWithPrefix2 = (str2 != null && prefix2 != null) && str2.toLowerCase().startsWith(prefix2.toLowerCase());

        if (startsWithPrefix2) {
            System.out.println("\"" + str2 + "\" starts with \"" + prefix2 + "\" (case-insensitive)");
        } else {
            System.out.println("\"" + str2 + "\" does not start with \"" + prefix2 + "\" (case-insensitive)");
        }

         // Example demonstrating null handling
        String str3 = null;
        String prefix3 = "Hello";

        boolean startsWithPrefix3 = (str3 != null && prefix3 != null) && str3.startsWith(prefix3); // Safe check

        if (startsWithPrefix3) {
            System.out.println("\"" + str3 + "\" starts with \"" + prefix3 + "\""); 
        } else {
            System.out.println("\"" + str3 + "\" does not start with \"" + prefix3 + "\""); // Correctly handles null
        }

    }
}
