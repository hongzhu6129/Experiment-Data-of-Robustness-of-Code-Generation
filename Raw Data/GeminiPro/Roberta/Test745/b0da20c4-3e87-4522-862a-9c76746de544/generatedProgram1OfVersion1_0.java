public class StringEndsWithNumber {

    public static void main(String[] args) {
        String str1 = "Hello123";
        String str2 = "HelloWorld";
        String str3 = "12345";
        String str4 = "";
        String str5 = "Hello 123"; // Space before number

        System.out.println(str1 + ": " + validate(str1)); // true
        System.out.println(str2 + ": " + validate(str2)); // false
        System.out.println(str3 + ": " + validate(str3)); // true
        System.out.println(str4 + ": " + validate(str4)); // false
        System.out.println(str5 + ": " + validate(str5)); // true


    }

    public static String validate(String str) {
        if (str == null || str.isEmpty()) {
            return "false";
        }

        char lastChar = str.charAt(str.length() - 1);
        return Character.isDigit(lastChar) ? "true" : "false";


    }
}
