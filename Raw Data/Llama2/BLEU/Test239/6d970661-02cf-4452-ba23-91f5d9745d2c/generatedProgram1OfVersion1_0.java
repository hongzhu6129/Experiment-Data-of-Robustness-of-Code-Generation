public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
        String str3 = "coding";

        System.out.println("Middle character of \"" + str1 + "\": " + middle(str1));
        System.out.println("Middle character of \"" + str2 + "\": " + middle(str2));
        System.out.println("Middle character of \"" + str3 + "\": " + middle(str3));
    }

    public static String middle(String str) {
        int len = str.length();
        if (len == 0) {
            return ""; // Handle empty string case
        }

        if (len % 2 == 0) {
            // Even length, return two middle characters
            return str.substring(len / 2 - 1, len / 2 + 1);
        } else {
            // Odd length, return single middle character
            return str.substring(len / 2, len / 2 + 1);
        }
    }
}
