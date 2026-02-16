public class StringEndsWith {

    public static void main(String[] args) {

        // Example strings
        String str1 = "Hello World";
        String suffix1 = "World";
        String suffix2 = "world";  // Case-sensitive
        String suffix3 = "Hello";

        // Using endsWith() method
        System.out.println("\"" + str1 + "\" ends with \"" + suffix1 + "\"? " + str1.endsWith(suffix1)); // Output: true
        System.out.println("\"" + str1 + "\" ends with \"" + suffix2 + "\"? " + str1.endsWith(suffix2)); // Output: false
        System.out.println("\"" + str1 + "\" ends with \"" + suffix3 + "\"? " + str1.endsWith(suffix3)); // Output: false



        // Demonstration of empty string cases
        String emptyString = "";
        System.out.println("\"" + str1 + "\" ends with empty string? " + str1.endsWith(emptyString)); // Output: true 
        System.out.println("Empty string ends with \"" + suffix1 + "\"? " + emptyString.endsWith(suffix1)); // Output: false
        System.out.println("Empty string ends with empty string? " + emptyString.endsWith(emptyString)); // Output: true


        // Longer suffix than the main string
        String shortString = "abc";
        String longSuffix = "abcdef";
        System.out.println("\"" + shortString + "\" ends with \"" + longSuffix + "\"? " + shortString.endsWith(longSuffix)); // Output: false


        // Illustrating how to handle null
        String nullString = null;
        // The following line will throw a NullPointerException because you can't call methods on a null object.
        // System.out.println(nullString.endsWith(suffix1)); 

        // Safe way to handle null:
        System.out.println("Null string ends with \"" + suffix1 + "\"? " + (nullString != null && nullString.endsWith(suffix1))); // Output: false
          
    }
}
