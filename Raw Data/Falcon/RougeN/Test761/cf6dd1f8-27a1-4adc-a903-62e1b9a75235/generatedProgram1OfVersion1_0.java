class Solution {
    /**
     * Checks if two strings are rotations of each other.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return True if the strings are rotations of each other, false otherwise.
     */
    static boolean checkForRotation(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }


    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        if (checkForRotation(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are rotations of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not rotations of each other.");
        }

        str1 = "abcde";
        str2 = "eabcd";
        if (checkForRotation(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are rotations of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not rotations of each other.");
        }


        // Test cases with null and empty strings
        System.out.println(checkForRotation(null, "abc")); // Output: false
        System.out.println(checkForRotation("abc", null)); // Output: false
        System.out.println(checkForRotation("", "abc"));  // Output: false
        System.out.println(checkForRotation("abc", ""));  // Output: false
        System.out.println(checkForRotation("", ""));     // Output: true 


    }
}
