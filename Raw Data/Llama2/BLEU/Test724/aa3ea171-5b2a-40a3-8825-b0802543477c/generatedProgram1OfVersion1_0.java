class Solution {
    /**
     * Checks if two given strings are rotations of each other.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return True if the strings are rotations of each other, false otherwise.
     */
    static boolean checkForRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        if (s1.length() == 0) { // Handle empty strings
            return true;
        }

        String concatenated = s1 + s1; 
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other? " + checkForRotation(str1, str2)); // Output: true


        str1 = "hello";
        str2 = "llohe";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other? " + checkForRotation(str1, str2)); // Output: true


        str1 = "abcde";
        str2 = "abced";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other? " + checkForRotation(str1, str2)); // Output: false

        str1 = "";
        str2 = "";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other? " + checkForRotation(str1, str2)); // Output: true

        str1 = "abc";
        str2 = null;
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other? " + checkForRotation(str1, str2)); // Output: false

        str1 = null;
        str2 = "abc";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other? " + checkForRotation(str1, str2)); // Output: false

        str1 = "abc";
        str2 = "abcd";  // Different lengths
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" rotations of each other? " + checkForRotation(str1, str2)); // Output: false


    }
}
