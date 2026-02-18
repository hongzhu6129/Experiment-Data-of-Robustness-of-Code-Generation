public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
        String str3 = "coding";

        System.out.println("Middle character(s) of '" + str1 + "': " + middle(str1)); // Output: l
        System.out.println("Middle character(s) of '" + str2 + "': " + middle(str2)); // Output: av
        System.out.println("Middle character(s) of '" + str3 + "': " + middle(str3)); // Output: di
    }

    public static String middle(String str) {
        int len = str.length();
        int middle = len / 2;

        if (len % 2 == 0) {
            // Even length, return two middle characters
            return str.substring(middle - 1, middle + 1);
        } else {
            // Odd length, return the single middle character
            return str.substring(middle, middle + 1);
        }
    }
}
