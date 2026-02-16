public class StringStartsWith {

    public static void main(String[] args) {
        // Example usages:
        String str1 = "Hello World";
        String prefix1 = "Hello";
        boolean startsWith1 = str1.startsWith(prefix1);
        System.out.println("\"" + str1 + "\" starts with \"" + prefix1 + "\": " + startsWith1); // Output: true

        String str2 = "Java Programming";
        String prefix2 = "Java";
        boolean startsWith2 = str2.startsWith(prefix2);
        System.out.println("\"" + str2 + "\" starts with \"" + prefix2 + "\": " + startsWith2); // Output: true


        String str3 = "Coding is fun";
        String prefix3 = "coding"; // Case-sensitive
        boolean startsWith3 = str3.startsWith(prefix3);
        System.out.println("\"" + str3 + "\" starts with \"" + prefix3 + "\": " + startsWith3); // Output: false

        String str4 = "OpenAI";
        String prefix4 = "AI"; 
        boolean startsWith4 = str4.startsWith(prefix4);
        System.out.println("\"" + str4 + "\" starts with \"" + prefix4 + "\": " + startsWith4); // Output: false


        // startsWith() with offset (starting position)
        String str5 = "This is a test string";
        String prefix5 = "is";
        boolean startsWith5 = str5.startsWith(prefix5, 2); // Check from index 2 (the space)
        boolean startsWith6 = str5.startsWith(prefix5, 5); // Check from index 5 ("is")

        System.out.println("\"" + str5 + "\" starts with \"" + prefix5 + "\" from index 2: " + startsWith5); // Output: false
        System.out.println("\"" + str5 + "\" starts with \"" + prefix5 + "\" from index 5: " + startsWith6); // Output: true


        // Handling null and empty strings:

        String str6 = null;
        String prefix6 = "Test";
        // boolean startsWith6 = str6.startsWith(prefix6); // This will throw a NullPointerException!

        // Safe way to handle null:
        boolean startsWith7 = (str6 != null) && str6.startsWith(prefix6); 
        System.out.println("Null string starts with \"" + prefix6 + "\": " + startsWith7); // Output: false


        String str7 = ""; // Empty string
        String prefix7 = "Anything";
        boolean startsWith8 = str7.startsWith(prefix7); 
        System.out.println("Empty string starts with \"" + prefix7 + "\": " + startsWith8); // Output: false


    }
}
