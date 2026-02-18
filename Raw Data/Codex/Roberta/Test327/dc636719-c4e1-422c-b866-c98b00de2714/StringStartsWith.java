public class StringStartsWith {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello";
        String str3 = "World";

        // Using startsWith() method
        boolean startsWithStr2 = str1.startsWith(str2);
        boolean startsWithStr3 = str1.startsWith(str3);

        System.out.println("\"" + str1 + "\" starts with \"" + str2 + "\": " + startsWithStr2);
        System.out.println("\"" + str1 + "\" starts with \"" + str3 + "\": " + startsWithStr3);


        // Demonstrating startsWith(String prefix, int offset) - checks from a specific index
        String str4 = "Programming is fun";
        String str5 = "gram";

        boolean startsWithGramFromIndex2 = str4.startsWith(str5, 2); // Check if "gram" starts at index 2
        System.out.println("\"" + str4 + "\" starts with \"" + str5 + "\" from index 2: " + startsWithGramFromIndex2);

        // Handling null and empty strings
        String nullString = null;
        String emptyString = "";

        // Avoid NullPointerException by checking for null explicitly
        boolean startsWithNull = (nullString != null && nullString.startsWith("something"));  // Should be false
        System.out.println("Null string starts with \"something\": " + startsWithNull);

        boolean startsWithEmpty = emptyString.startsWith(""); // An empty string starts with an empty string (true)
        System.out.println("Empty string starts with empty string: " + startsWithEmpty);


    }
}
