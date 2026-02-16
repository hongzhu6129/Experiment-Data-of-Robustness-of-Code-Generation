public class StringEndsWithAnother {

    public static void main(String[] args) {
        // Example strings
        String str1 = "Hello World";
        String suffix1 = "World";
        String suffix2 = "world"; // Case-sensitive check
        String suffix3 = "Hello";


        // Using endsWith() method
        boolean endsWith1 = str1.endsWith(suffix1);
        boolean endsWith2 = str1.endsWith(suffix2);
        boolean endsWith3 = str1.endsWith(suffix3);


        // Printing the results
        System.out.println("\"" + str1 + "\" ends with \"" + suffix1 + "\"? " + endsWith1); // Output: true
        System.out.println("\"" + str1 + "\" ends with \"" + suffix2 + "\"? " + endsWith2); // Output: false
        System.out.println("\"" + str1 + "\" ends with \"" + suffix3 + "\"? " + endsWith3); // Output: false



        // Demonstrating edge cases:

        // Empty string as suffix
        String emptySuffix = "";
        boolean endsWithEmpty = str1.endsWith(emptySuffix);  // An empty string is considered a suffix of any string
        System.out.println("\"" + str1 + "\" ends with \"" + emptySuffix + "\"? " + endsWithEmpty); // Output: true


        // Suffix longer than the main string
        String longSuffix = "Hello World!";
        boolean endsWithLong = str1.endsWith(longSuffix);
        System.out.println("\"" + str1 + "\" ends with \"" + longSuffix + "\"? " + endsWithLong); // Output: false

        // Null string and suffix
        String nullString = null;
        String nullSuffix = null;

       try {
            System.out.println("\"" + nullString + "\" ends with \"" + suffix1 + "\"? " + nullString.endsWith(suffix1)); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Checking if a null string ends with a suffix throws NullPointerException");
        }

         try {
             System.out.println("\"" + str1 + "\" ends with \"" + nullSuffix + "\"? " + str1.endsWith(nullSuffix)); // Throws NullPointerException
         } catch (NullPointerException e) {
             System.out.println("Checking if a string ends with a null suffix throws NullPointerException");
         }




    }
}
