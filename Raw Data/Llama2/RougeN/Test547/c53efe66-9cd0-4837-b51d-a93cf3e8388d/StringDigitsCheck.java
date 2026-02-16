public class StringDigitsCheck {

    public static void main(String[] args) {
        String testString1 = "12345";
        String testString2 = "123a45";
        String testString3 = "123 45";
        String testString4 = ""; // Empty string

        System.out.println(test_only_digits(testString1)); // Output: true
        System.out.println(test_only_digits(testString2)); // Output: false
        System.out.println(test_only_digits(testString3)); // Output: false
        System.out.println(test_only_digits(testString4)); // Output: true 
    }

    public static boolean test_only_digits(String str) {
        if (str == null || str.isEmpty()) {
            return true; // Or return false if you consider empty as not containing digits
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
