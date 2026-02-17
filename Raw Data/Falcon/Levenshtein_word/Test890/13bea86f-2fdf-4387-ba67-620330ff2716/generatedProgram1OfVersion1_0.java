class Solution {
    /**
     * Displays the middle character(s) of a string.
     *
     * @param str The input string.
     * @return The middle character(s) of the string.
     */
    public static String middle(String str) {
        int len = str.length();
        if (len == 0) {
            return ""; // Handle empty strings
        }

        int middleIndex = len / 2;

        if (len % 2 == 0) {
            // Even length, return the single middle character
            return String.valueOf(str.charAt(middleIndex -1 )) + String.valueOf(str.charAt(middleIndex)); // Corrected index for even length strings
        } else {
            // Odd length, return the two middle characters

            return String.valueOf(str.charAt(middleIndex));

        }
    }


    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "a";
        String str4 = "";


        System.out.println("Middle of \"" + str1 + "\": " + middle(str1)); // Output: l
        System.out.println("Middle of \"" + str2 + "\": " + middle(str2)); // Output: or
        System.out.println("Middle of \"" + str3 + "\": " + middle(str3)); // Output: a
        System.out.println("Middle of \"" + str4 + "\": " + middle(str4)); // Output: (empty string)
    }
}
