public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
        String str3 = "coding";

        System.out.println("Middle of " + str1 + ": " + middle(str1)); // Output: ll
        System.out.println("Middle of " + str2 + ": " + middle(str2)); // Output: v
        System.out.println("Middle of " + str3 + ": " + middle(str3)); // Output:di
    }

    public static String middle(String str) {
        int len = str.length();
        int middle = len / 2;

        if (len % 2 == 0) { // Even length
            return String.valueOf(str.charAt(middle -1 )) + String.valueOf(str.charAt(middle)); // Return the single middle character
        } else { // Odd length
            return str.substring(middle -1, middle + 1); // Return the two middle characters as a substring

        }
    }
}
