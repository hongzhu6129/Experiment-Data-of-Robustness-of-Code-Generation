class Solution {

    /**
     * Checks if two given strings are rotations of each other.
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

        if (str1.isEmpty() && str2.isEmpty()) {
            return true; // Empty strings are considered rotations of each other
        }

        String concatenatedStr1 = str1 + str1;
        return concatenatedStr1.contains(str2);
    }


    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(checkForRotation(str1, str2)); // Output: true

        str1 = "hello";
        str2 = "llohe";
        System.out.println(checkForRotation(str1, str2)); // Output: true

        str1 = "hello";
        str2 = "llohae";
        System.out.println(checkForRotation(str1, str2)); // Output: false


        str1 = "";
        str2 = "";
        System.out.println(checkForRotation(str1, str2)); // Output: true (Empty strings are rotations)


        str1 = "abc";
        str2 = null;
        System.out.println(checkForRotation(str1, str2)); // Output: false (Handles nulls)
    }
}
