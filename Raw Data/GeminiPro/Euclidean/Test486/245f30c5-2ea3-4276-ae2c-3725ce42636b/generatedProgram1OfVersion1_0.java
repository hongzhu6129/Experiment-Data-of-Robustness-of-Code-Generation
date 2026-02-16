public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
        String str3 = "coding";

        System.out.println("Middle character of \"" + str1 + "\" is: " + middle(str1)); // Output: l
        System.out.println("Middle character of \"" + str2 + "\" is: " + middle(str2)); // Output: av
        System.out.println("Middle character of \"" + str3 + "\" is: " + middle(str3)); // Output: d
    }


    public static String middle(String str) {
        int len = str.length();
        if (len % 2 == 1) { // Odd length
            return String.valueOf(str.charAt(len / 2));
        } else { // Even length
            return str.substring(len / 2 - 1, len / 2 + 1);
        }
    }
}
