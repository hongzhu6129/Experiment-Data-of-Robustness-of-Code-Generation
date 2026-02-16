public class StringStartsWithNumber {

    public static void main(String[] args) {
        String str1 = "123abc";
        String str2 = "abc123";
        String str3 = "123";

        System.out.println(str1 + " starts with a number: " + validate(str1));
        System.out.println(str2 + " starts with a number: " + validate(str2));
        System.out.println(str3 + " starts with a number: " + validate(str3));
    }

    public static String validate(String str) {
        if (str == null || str.isEmpty()) {
            return "false"; // Handle empty or null strings
        }

        char firstChar = str.charAt(0);
        return Character.isDigit(firstChar) ? "true" : "false"; 
    }
}
