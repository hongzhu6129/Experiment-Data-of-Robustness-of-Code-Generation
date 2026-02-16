public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";

        System.out.println("Middle character of " + str1 + ": " + middle(str1));
        System.out.println("Middle character of " + str2 + ": " + middle(str2));


        String str3 = "coding"; // Example with even length
        System.out.println("Middle character of " + str3 + ": " + middle(str3));

        String str4 = "code";  // Example with odd length
        System.out.println("Middle character of " + str4 + ": " + middle(str4));


    }

    public static String middle(String str) {
        int len = str.length();
        if (len % 2 == 0) { // Even length
            return String.valueOf(str.charAt(len / 2 - 1)); // Corrected for 0-based indexing
        } else { // Odd length
            return String.valueOf(str.charAt(len / 2));
        }
    }
}
