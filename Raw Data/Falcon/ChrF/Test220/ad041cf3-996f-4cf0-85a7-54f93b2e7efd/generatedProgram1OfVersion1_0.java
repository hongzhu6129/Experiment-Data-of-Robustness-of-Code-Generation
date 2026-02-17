public class StringCompareIgnoreCase {

    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "World";

        // Using equalsIgnoreCase()
        boolean areEqual12 = string1.equalsIgnoreCase(string2);
        boolean areEqual13 = string1.equalsIgnoreCase(string3);

        System.out.println("\"" + string1 + "\" equals \"" + string2 + "\"? (Ignoring Case): " + areEqual12); // Output: true
        System.out.println("\"" + string1 + "\" equals \"" + string3 + "\"? (Ignoring Case): " + areEqual13); // Output: false


        // Demonstrating with null and empty strings
        String string4 = null;
        String string5 = "";

        // Handle null carefully - otherwise, NullPointerException!
        boolean areEqual14 = (string1 != null) && string1.equalsIgnoreCase(string4); // Corrected to handle null safely.
        boolean areEqual15 = string1.equalsIgnoreCase(string5);


        System.out.println("\"" + string1 + "\" equals \"" + string4 + "\"? (Ignoring Case): " + areEqual14); // Output: false
        System.out.println("\"" + string1 + "\" equals \"" + string5 + "\"? (Ignoring Case): " + areEqual15); // Output: false

        // More examples with different cases and whitespace.
        String str6 = "  Hello World  ";
        String str7 = "hello world";

        System.out.println("\"" + str6 + "\" equals \"" + str7 + "\"? (Ignoring Case): " + str6.trim().equalsIgnoreCase(str7)); // Output: true (after trimming)

    }
}
