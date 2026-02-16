class Solution {
    /**
     * Checks if two strings are rotations of each other.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return True if the strings are rotations of each other, false otherwise.
     */
    static boolean checkForRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        if (str1.length() == 0 && str2.length() == 0) {
            return true; // Empty strings are considered rotations of each other.
        }

        String concatenated = str1 + str1; 
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(checkForRotation(str1, str2)); // Output: true


        str1 = "hello";
        str2 = "llohe";
        System.out.println(checkForRotation(str1, str2)); // Output: true

        str1 = "hello";
        str2 = "elloh"; // One rotation
        System.out.println(checkForRotation(str1, str2)); // Output: true


        str1 = "abcd";
        str2 = "acbd";
        System.out.println(checkForRotation(str1, str2)); // Output: false

        str1 = "";
        str2 = "";
        System.out.println(checkForRotation(str1, str2)); // Output: true

        str1 = "abc";
        str2 = null;
        System.out.println(checkForRotation(str1, str2)); // Output: false

         str1 = "abc";
        str2 = "ab";
        System.out.println(checkForRotation(str1, str2)); // Output: false




    }
}
