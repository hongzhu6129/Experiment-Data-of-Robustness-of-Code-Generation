public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "a";
        String str4 = "";

        System.out.println("Middle of \"" + str1 + "\": " + middle(str1)); // Output: l
        System.out.println("Middle of \"" + str2 + "\": " + middle(str2 + "s")); // Output: rl
        System.out.println("Middle of \"" + str3 + "\": " + middle(str3)); // Output: a
        System.out.println("Middle of \"" + str4 + "\": " + middle(str4)); // Output: ""

    }

    public static String middle(String str) {
        int len = str.length();
        if (len == 0) {
            return "";
        }

        if (len % 2 == 0) { // Even length
            return String.valueOf(str.charAt(len / 2 - 1)) + str.charAt(len / 2);
        } else { // Odd length
            return String.valueOf(str.charAt(len / 2));
        }
    }
}
