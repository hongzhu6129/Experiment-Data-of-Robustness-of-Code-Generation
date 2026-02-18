class Solution {

    /**
     * Checks if two given strings are rotations of each other.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return True if s2 is a rotation of s1, false otherwise.
     */
    static boolean checkForRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        if (s1.isEmpty() && s2.isEmpty()) { // Handle empty strings
            return true;
        }


        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }


    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(checkForRotation(str1, str2)); // Output: true


        str1 = "hello";
        str2 = "llohe";
        System.out.println(checkForRotation(str1, str2)); // Output: true


        str1 = "java";
        str2 = "avaj"; // Not a rotation
        System.out.println(checkForRotation(str1, str2)); // Output: false

        str1 = "java";
        str2 = "avja"; // Not a rotation
        System.out.println(checkForRotation(str1, str2)); // Output: false


        str1 = "";
        str2 = "";
        System.out.println(checkForRotation(str1, str2)); // Output: true

        str1 = "abc";
        str2 = null;
        System.out.println(checkForRotation(str1, str2)); // Output: false


        str1 = null;
        str2 = "abc";
        System.out.println(checkForRotation(str1, str2)); // Output: false

        str1 = "abcd";
        str2 = "abc"; // Different lengths
        System.out.println(checkForRotation(str1, str2)); // Output: false
    }
}
