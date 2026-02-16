public class StringStartsWithNumber {

    public static void main(String[] args) {
        String testString1 = "123abc";
        String testString2 = "abc123";
        String testString3 = "123";
        String testString4 = "abc";
        String testString5 = "1.23abc"; // Handles decimals too
        String testString6 = "-123abc"; // Handles negative numbers


        System.out.println(testString1 + ": " + validate(testString1)); // true
        System.out.println(testString2 + ": " + validate(testString2)); // false
        System.out.println(testString3 + ": " + validate(testString3)); // true
        System.out.println(testString4 + ": " + validate(testString4)); // false
        System.out.println(testString5 + ": " + validate(testString5)); // true
        System.out.println(testString6 + ": " + validate(testString6)); // true
    }

    public static String validate(String str) {
        if (str == null || str.isEmpty()) {
            return "false"; // Or handle empty/null as needed
        }

        // Regular expression to check if the string starts with a number (including decimals and negative numbers)
        return String.valueOf(str.matches("^-?[0-9]+(\\.[0-9]+)?.*"));  
    }
}
