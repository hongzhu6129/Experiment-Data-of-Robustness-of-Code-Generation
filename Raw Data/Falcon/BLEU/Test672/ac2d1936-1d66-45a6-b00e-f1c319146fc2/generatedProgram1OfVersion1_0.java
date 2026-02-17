public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "a";
        String str4 = "";

        System.out.println("Middle of \"" + str1 + "\": " + middle(str1)); // Output: l
        System.out.println("Middle of \"" + str2 + "\": " + middle(str2 + " ")); // Output: r (added space to make it odd length for demonstration)
        System.out.println("Middle of \"" + str3 + "\": " + middle(str3)); // Output: a
        System.out.println("Middle of \"" + str4 + "\": " + middle(str4)); // Output: "" (empty string)

    }

    public static String middle(String str) {
        if (str.length() == 0) {
            return ""; // Handle empty strings
        }

        int mid = str.length() / 2;
        if (str.length() % 2 == 0) {
            return String.valueOf(str.charAt(mid -1 )) + str.charAt(mid); // Even length: two middle characters
        } else {
            return String.valueOf(str.charAt(mid)); // Odd length: one middle character
        }
    }
}
