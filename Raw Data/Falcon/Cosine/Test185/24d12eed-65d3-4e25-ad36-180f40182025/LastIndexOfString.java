public class LastIndexOfString {

    public static void main(String[] args) {
        String mainString = "This is a test string. This is another test.";
        String subString = "test";

        int lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" is: " + lastIndex);
        } else {
            System.out.println("\"" + subString + "\" not found in the string.");
        }



        //Demonstrating other variations//


        //Searching from a specific index:

        int lastIndexFromIndex = mainString.lastIndexOf(subString, 20);  // Search before index 20

         if (lastIndexFromIndex != -1) {
            System.out.println("Last index of \"" + subString + "\" before index 20 is: " + lastIndexFromIndex);
        } else {
            System.out.println("\"" + subString + "\" not found before index 20 in the string.");
        }




        //Handling null and empty strings:

         String nullString = null;
         String emptyString = "";

        // These will throw NullPointerExceptions if not handled carefully:
        // int indexNull = nullString.lastIndexOf("test"); 
        // int indexEmpty = emptyString.lastIndexOf("test");

        // Safer way to handle nulls: (requires Java 7+ for Objects.requireNonNullElse)
        String safeString = java.util.Objects.requireNonNullElse(nullString, "");
        int safeIndexNull = safeString.lastIndexOf("test");  // Returns -1 if the string was null
        System.out.println("Index in (potentially) null string: " + safeIndexNull);


         int indexEmpty = emptyString.lastIndexOf("test");  //Returns -1 for empty strings. This is safe.
        System.out.println("Index in empty string: " + indexEmpty);



        //Case sensitivity

        String caseSensitiveString = "Test String TEST";

        System.out.println("Case sensitive last index of \"Test\": " + caseSensitiveString.lastIndexOf("Test")); //Only matches the first "Test".
        


    }
}
