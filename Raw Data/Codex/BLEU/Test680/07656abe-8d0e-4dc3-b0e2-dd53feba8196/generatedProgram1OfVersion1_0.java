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
            return true;  // Empty strings are considered rotations of each other
        }

        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }


    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(checkForRotation(s1, s2));  // Output: true


        s1 = "hello";
        s2 = "llohe";
        System.out.println(checkForRotation(s1, s2));  // Output: true

        s1 = "hello";
        s2 = "helol";
        System.out.println(checkForRotation(s1, s2));  // Output: false


        s1 = "";
        s2 = "";
        System.out.println(checkForRotation(s1, s2));  // Output: true


        s1 = "abc";
        s2 = null;
        System.out.println(checkForRotation(s1, s2)); // Output: false

        s1 = null;
        s2 = "abc";
        System.out.println(checkForRotation(s1, s2)); // Output: false


    }
}
