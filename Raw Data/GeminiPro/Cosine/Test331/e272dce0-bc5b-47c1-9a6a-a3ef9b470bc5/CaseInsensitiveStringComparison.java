public class CaseInsensitiveStringComparison {

    public static void main(String[] args) {

        String string1 = "hello";
        String string2 = "Hello";
        String string3 = "World";

        // Method 1: Using equalsIgnoreCase()
        System.out.println("Method 1: Using equalsIgnoreCase()");
        System.out.println("\"" + string1 + "\" equalsIgnoreCase \"" + string2 + "\": " + string1.equalsIgnoreCase(string2));
        System.out.println("\"" + string1 + "\" equalsIgnoreCase \"" + string3 + "\": " + string1.equalsIgnoreCase(string3));

        // Method 2: Converting to lowercase before comparison
        System.out.println("\nMethod 2: Converting to lowercase before comparison");
        System.out.println("\"" + string1 + "\" equals \"" + string2.toLowerCase() + "\": " + string1.toLowerCase().equals(string2.toLowerCase()));
        System.out.println("\"" + string1 + "\" equals \"" + string3.toLowerCase() + "\": " + string1.toLowerCase().equals(string3.toLowerCase()));

        // Method 3: Converting to uppercase before comparison (Less common but works the same)
        System.out.println("\nMethod 3: Converting to uppercase before comparison");
        System.out.println("\"" + string1 + "\" equals \"" + string2.toUpperCase() + "\": " + string1.toUpperCase().equals(string2.toUpperCase()));
        System.out.println("\"" + string1 + "\" equals \"" + string3.toUpperCase() + "\": " + string1.toUpperCase().equals(string3.toUpperCase()));



        // Demonstrating potential issues with null
        String string4 = null;
        // This will throw a NullPointerException because we are trying to call a method on a null object.
        // System.out.println(string4.equalsIgnoreCase(string1));

        // Proper way to handle nulls: Check for null before calling equalsIgnoreCase()
        if (string4 != null && string4.equalsIgnoreCase(string1)) {
            System.out.println("Strings are equal (after null check)");
        } else {
            System.out.println("Strings are not equal or one is null"); // This will execute
        }



        // Additional info: Region-sensitive comparisons (Rarely Needed)
        // For languages like Turkish, there are special case mappings.  equalsIgnoreCase() handles most of these,
        // but if extremely fine-grained control is necessary, consider java.text.Collator


    }
}

