public class StartsWithString {

    public static void main(String[] args) {
        // Example usage:
        String mainString1 = "Hello World";
        String prefix1 = "Hello";
        checkStartsWith(mainString1, prefix1); // Output: true

        String mainString2 = "Java Programming";
        String prefix2 = "Python";
        checkStartsWith(mainString2, prefix2); // Output: false

        String mainString3 = "coding";
        String prefix3 = "code";
        checkStartsWith(mainString3, prefix3); // Output: false

        String mainString4 = "apple";
        String prefix4 = "apple";
        checkStartsWith(mainString4, prefix4); // Output: true

        String mainString5 = "apple";
        String prefix5 = "appl";  // Shorter prefix
        checkStartsWith(mainString5, prefix5); // Output: true


        String mainString6 = "apple";
        String prefix6 = ""; //Empty string
        checkStartsWith(mainString6, prefix6); // Output: true

        // Handling null and edge cases
        String mainString7 = null;
        String prefix7 = "test";
        checkStartsWith(mainString7, prefix7); // Output: false

        String mainString8 = "test";
        String prefix8 = null;
        checkStartsWith(mainString8, prefix8); // Output: false
        

        String mainString9 = "";
        String prefix9 = "test";
        checkStartsWith(mainString9, prefix9); // Output: false


         String mainString10 = "test";
        String prefix10 = "";
        checkStartsWith(mainString10, prefix10); // Output: true

    }

    public static void checkStartsWith(String mainString, String prefix) {
        if (mainString == null || prefix == null) {
            System.out.println(false);  // Handle null inputs
            return;
        }


        if (prefix.length() > mainString.length()) {
            System.out.println(false);
            return;
        }


        boolean startsWith = mainString.startsWith(prefix); 
        System.out.println(startsWith);
    }
}
