class Solution {
    /**
     * Checks if two given strings are rotations of each other.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return True if the strings are rotations of each other, false otherwise.
     */
    static boolean checkForRotation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false; 
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.isEmpty() && s2.isEmpty()) {
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

        str1 = "abcde";
        str2 = "abced";
        System.out.println(checkForRotation(str1, str2)); // Output: false


        // Test cases for null and empty strings
        System.out.println(checkForRotation(null, "abc"));  // Output: false
        System.out.println(checkForRotation("abc", null));  // Output: false
        System.out.println(checkForRotation("", ""));      // Output: true
        System.out.println(checkForRotation("a", ""));     // Output: false
        System.out.println(checkForRotation("", "a"));     // Output: false



    }
}
