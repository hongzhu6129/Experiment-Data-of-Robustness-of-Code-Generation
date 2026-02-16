public class StringStartsWith {

    public static void main(String[] args) {
        // Test cases
        String str1 = "Hello World";
        String prefix1 = "Hello";
        String prefix2 = "World";
        String prefix3 = "hello"; // Case-sensitive check
        String prefix4 = "He";
        String prefix5 = "Hello World!"; // Longer than the main string

        // Using startsWith() method
        System.out.println("\"" + str1 + "\" starts with \"" + prefix1 + "\"? " + str1.startsWith(prefix1)); // Output: true
        System.out.println("\"" + str1 + "\" starts with \"" + prefix2 + "\"? " + str1.startsWith(prefix2)); // Output: false
        System.out.println("\"" + str1 + "\" starts with \"" + prefix3 + "\"? " + str1.startsWith(prefix3)); // Output: false
        System.out.println("\"" + str1 + "\" starts with \"" + prefix4 + "\"? " + str1.startsWith(prefix4)); // Output: true
        System.out.println("\"" + str1 + "\" starts with \"" + prefix5 + "\"? " + str1.startsWith(prefix5)); // Output: false



        // Demonstrating handling null and empty strings (important for robust code)

        String nullString = null;
        String emptyString = "";

        // These will NOT throw NullPointerExceptions due to the behavior of startsWith()
        System.out.println("\"" + str1 + "\" starts with null? " + str1.startsWith(nullString));  // Output: false
        System.out.println("\"" + str1 + "\" starts with empty string? " + str1.startsWith(emptyString)); // Output: true


        // Be cautious with null main strings:
        // System.out.println("\"" + nullString + "\" starts with \"Hello\"? " + nullString.startsWith("Hello")); // This WILL throw a NullPointerException!


        // Safe way to handle potentially null main strings:

       if (nullString != null) {
           System.out.println("\"" + nullString + "\" starts with \"Hello\"? " + nullString.startsWith("Hello")); 
       } else {
           System.out.println("Main string is null, cannot check startsWith().");
       }
    }
}
