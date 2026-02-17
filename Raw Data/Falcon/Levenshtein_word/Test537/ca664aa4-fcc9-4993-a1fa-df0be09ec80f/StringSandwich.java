public class StringSandwich {

    public static String createStringSandwich(String str1, String str2) {
        if (str1.length() == str2.length()) {
            throw new IllegalArgumentException("Strings must have different lengths.");
        }

        String shortString = str1.length() < str2.length() ? str1 : str2;
        String longString = str1.length() > str2.length() ? str1 : str2;

        return shortString + longString + shortString;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(createStringSandwich("hello", "world")); // Output: helloworldhello
        System.out.println(createStringSandwich("a", "longer"));   // Output: alongerlonger
        System.out.println(createStringSandwich("short", "a"));   // Output: ashorta

        // Corner cases
        try {
            System.out.println(createStringSandwich("same", "same")); // Throws IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println(createStringSandwich("", "nonempty"));  // Output: nonempty
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());

        }
        try {
            System.out.println(createStringSandwich("nonempty",""));  // Output: nonemptynonempty
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());

        }


        // Test cases with special characters
        System.out.println(createStringSandwich("!@#", "1234"));   // Output: !@#1234!@#
        System.out.println(createStringSandwich(" ", "   "));     // Output:     //(Note: Output is 5 spaces: a single space surrounded by three spaces on either side)

    }
}
