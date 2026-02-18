public class StringEndsWith {

    public static void main(String[] args) {
        String str1 = "This is a test string";
        String str2 = "string";
        String str3 = "test";

        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + str1.endsWith(str2));
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + str1.endsWith(str3));

        // Handling null and empty strings
        String str4 = null;
        String str5 = "";
        String str6 = "example";

        System.out.println("\"" + str4 + "\" ends with \"" + str6 + "\"? " + (str4 != null && str4.endsWith(str6)));  // Avoid NullPointerException
        System.out.println("\"" + str5 + "\" ends with \"" + str6 + "\"? " + str5.endsWith(str6)); // Empty string doesn't end with anything other than ""
        System.out.println("\"" + str6 + "\" ends with \"" + str5 + "\"? " + str6.endsWith(str5)); // Any string ends with an empty string

        if (args.length >= 2) { // Check if command-line arguments are provided
            String inputString = args[0];
            String suffix = args[1];

            System.out.println("\"" + inputString + "\" ends with \"" + suffix + "\"? " + inputString.endsWith(suffix));
        }
    }
}
