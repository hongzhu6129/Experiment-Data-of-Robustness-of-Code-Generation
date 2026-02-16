class Solution {
    /**
     * Displays the middle character(s) of a string.
     *
     * @param str The input string.
     * @return The middle character(s).
     */
    public static String middle(String str) {
        int len = str.length();
        if (len == 0) {
            return ""; // Handle empty strings
        }

        if (len % 2 == 0) {
            // Even length: return the single middle character
            return String.valueOf(str.charAt(len / 2 - 1));
        } else {
            // Odd length: return the two middle characters
            return str.substring(len / 2 - 1, len / 2 + 1); 
        }
    }


    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
        String str3 = "coding";
        String str4 = ""; // Test empty string


        System.out.println("Middle of " + str1 + ": " + middle(str1)); // l
        System.out.println("Middle of " + str2 + ": " + middle(str2)); // av
        System.out.println("Middle of " + str3 + ": " + middle(str3)); // di
        System.out.println("Middle of " + str4 + ": " + middle(str4)); // (empty string)
    }
}
