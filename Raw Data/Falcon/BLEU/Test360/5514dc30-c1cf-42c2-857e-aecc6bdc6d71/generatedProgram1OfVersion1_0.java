class Solution {
    /**
     * Checks if a string contains only digits.
     *
     * @param str The string to check.
     * @return True if the string contains only digits, false otherwise.
     */
    public static boolean test_only_digits(String str) {
        if (str == null || str.isEmpty()) {
            return false; // Or true, depending on how you want to handle empty/null strings
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String test1 = "12345";
        String test2 = "123a45";
        String test3 = "";
        String test4 = null;
        String test5 = "12.34"; //Contains a non-digit character

        System.out.println("\"" + test1 + "\" contains only digits: " + test_only_digits(test1)); // Output: true
        System.out.println("\"" + test2 + "\" contains only digits: " + test_only_digits(test2)); // Output: false
        System.out.println("\"" + test3 + "\" contains only digits: " + test_only_digits(test3)); // Output: false (or true, based on your implementation choice for empty strings)
        System.out.println("\"" + test4 + "\" contains only digits: " + test_only_digits(test4)); // Output: false (or true, based on your implementation choice for null strings)
        System.out.println("\"" + test5 + "\" contains only digits: " + test_only_digits(test5)); // Output: false


    }
}
