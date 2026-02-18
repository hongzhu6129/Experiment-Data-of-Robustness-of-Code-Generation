public class StringStartsWithNumber {

    public static void main(String[] args) {
        String testString1 = "123abc";
        String testString2 = "abc123";
        String testString3 = "123";
        String testString4 = "abc";
        String testString5 = ""; // Empty string
        String testString6 = null; // Null string

        System.out.println("\"" + testString1 + "\" starts with \"123\": " + validate(testString1, "123")); // true
        System.out.println("\"" + testString2 + "\" starts with \"123\": " + validate(testString2, "123")); // false
        System.out.println("\"" + testString3 + "\" starts with \"123\": " + validate(testString3, "123")); // true
        System.out.println("\"" + testString4 + "\" starts with \"123\": " + validate(testString4, "123")); // false
        System.out.println("\"" + testString5 + "\" starts with \"123\": " + validate(testString5, "123")); // false
        System.out.println("\"" + testString6 + "\" starts with \"123\": " + validate(testString6, "123")); // false


        System.out.println("\"" + testString1 + "\" starts with \"12\": " + validate(testString1, "12")); // true
        System.out.println("\"" + testString3 + "\" starts with \"1\": " + validate(testString3, "1")); // true


    }

    public static boolean validate(String input, String prefix) {
        if (input == null || prefix == null ) {  // Handle null inputs
            return false;
        }
        
        if (prefix.length() > input.length()){ //Handle cases where the prefix is longer than the input
            return false;
        }

        return input.startsWith(prefix);
    }
}
