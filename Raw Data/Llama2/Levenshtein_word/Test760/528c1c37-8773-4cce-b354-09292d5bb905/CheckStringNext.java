public class CheckStringNext {

    public static void main(String[] args) {
        String str1 = "abcdef"; // Example strings
        String str2 = "abcdefg";
        String str3 = "bcdefg";

        System.out.println("\"" + str1 + "\" next with \"" + str2 + "\": " + checkNext(str1, str2)); // Output: true
        System.out.println("\"" + str1 + "\" next with \"" + str3 + "\": " + checkNext(str1, str3)); // Output: false
        System.out.println("\"" + str2 + "\" next with \"" + str1 + "\": " + checkNext(str2, str1)); // Output: false

        // Handling null and empty strings
        System.out.println("\"" + null + "\" next with \"" + str1 + "\": " + checkNext(null, str1)); // Output: false
        System.out.println("\"" + str1 + "\" next with \"" + null + "\": " + checkNext(str1, null)); // Output: false
        System.out.println("\"" + "" + "\" next with \"" + str1 + "\": " + checkNext("", str1)); // Output: false
        System.out.println("\"" + str1 + "\" next with \"" + "" + "\": " + checkNext(str1, "")); // Output: false
        System.out.println("\"" + "" + "\" next with \"" + "" + "\": " + checkNext("", "")); // Output: false
        

    }

    public static boolean checkNext(String str1, String str2) {
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            return false; // Handle null or empty inputs
        }

        if (str2.length() != str1.length() + 1) {
            return false; // Lengths must differ by 1
        }

        return str2.startsWith(str1); // Efficient check if str2 starts with str1
    }
}
