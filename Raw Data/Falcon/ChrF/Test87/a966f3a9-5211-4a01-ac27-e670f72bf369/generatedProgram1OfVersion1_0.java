public class StringStartsWith {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello";
        String str3 = "World";

        // Using startsWith() method
        boolean startsWithStr2 = str1.startsWith(str2);
        boolean startsWithStr3 = str1.startsWith(str3);

        System.out.println("\"" + str1 + "\" starts with \"" + str2 + "\": " + startsWithStr2); // Output: true
        System.out.println("\"" + str1 + "\" starts with \"" + str3 + "\": " + startsWithStr3); // Output: false


        // Demonstrating startsWith(String prefix, int offset)  (Optional)
        String str4 = "This is a test string";
        String str5 = "is";

        boolean startsWithIsAtOffset2 = str4.startsWith(str5, 2); //Check from index 2
        boolean startsWithIsAtOffset5 = str4.startsWith(str5, 5); // Check from index 5

        System.out.println("\"" + str4 + "\" starts with \"" + str5 + "\" at offset 2: " + startsWithIsAtOffset2); //false
        System.out.println("\"" + str4 + "\" starts with \"" + str5 + "\" at offset 5: " + startsWithIsAtOffset5); //true


        // Manual implementation (For learning, startsWith() is preferred)
        String str6 = "apple";
        String str7 = "app";
        boolean manualCheck = startsWithManual(str6, str7);
        System.out.println("\"" + str6 + "\" starts with \"" + str7 + "\" (manual check): " + manualCheck); // true


    }

    // Manual implementation of startsWith (for understanding)
    public static boolean startsWithManual(String mainString, String prefix) {
        if (prefix.length() > mainString.length()) {
            return false;
        }

        for (int i = 0; i < prefix.length(); i++) {
            if (mainString.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
