class Solution {
    /**
     * Displays the middle character(s) of a string.
     * If the string length is odd, displays the two middle characters.
     * If the string length is even, displays the single middle character.
     *
     * @param str The input string.
     * @return The middle character(s).
     */
    public static String middle(String str) {
        if (str == null || str.isEmpty()) {
            return ""; // Or handle empty/null strings as needed
        }

        int len = str.length();
        int middle = len / 2;

        if (len % 2 == 0) { // Even length
            return str.substring(middle - 1, middle + 1);
        } else { // Odd length
            return String.valueOf(str.charAt(middle));
        }
    }



    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "abcd";
        String str3 = "a";
        String str4 = ""; // Test with empty string
        String str5 = null; // Test with null string


        System.out.println("Middle of \"" + str1 + "\": " + middle(str1)); // Output: l
        System.out.println("Middle of \"" + str2 + "\": " + middle(str2)); // Output: bc
        System.out.println("Middle of \"" + str3 + "\": " + middle(str3)); // Output: a
        System.out.println("Middle of \"" + str4 + "\": " + middle(str4)); // Output:  (empty string)
        System.out.println("Middle of \"" + str5 + "\": " + middle(str5)); // Output: (empty string - handles null) 
    }
}
