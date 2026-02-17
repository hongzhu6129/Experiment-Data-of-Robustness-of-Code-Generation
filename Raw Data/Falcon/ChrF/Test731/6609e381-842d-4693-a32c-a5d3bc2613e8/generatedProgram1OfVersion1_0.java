class Solution {
    /**
     * Checks if two strings are rotations of each other.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return True if the strings are rotations of each other, false otherwise.
     */
    static boolean checkForRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }


    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(checkForRotation(str1, str2) ? "Strings are rotations of each other" : "Strings are not rotations of each other");


        str1 = "hello";
        str2 = "llohe";
        System.out.println(checkForRotation(str1, str2) ? "Strings are rotations of each other" : "Strings are not rotations of each other");


        str1 = "abc";
        str2 = "acb"; // Not a rotation
        System.out.println(checkForRotation(str1, str2) ? "Strings are rotations of each other" : "Strings are not rotations of each other");

        // Test cases for null and empty strings
        System.out.println(checkForRotation(null, "abc") ? "Strings are rotations of each other" : "Strings are not rotations of each other"); //false
        System.out.println(checkForRotation("abc", null) ? "Strings are rotations of each other" : "Strings are not rotations of each other"); //false
        System.out.println(checkForRotation("", "") ? "Strings are rotations of each other" : "Strings are not rotations of each other"); //true
        System.out.println(checkForRotation("abc", "") ? "Strings are rotations of each other" : "Strings are not rotations of each other"); //false


    }
}
