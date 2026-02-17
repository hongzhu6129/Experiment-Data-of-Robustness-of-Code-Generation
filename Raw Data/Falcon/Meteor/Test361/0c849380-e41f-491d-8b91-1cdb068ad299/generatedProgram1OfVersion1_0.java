class Solution {

    /**
     * Checks if two strings are rotations of each other.
     *
     * @param s1 The first string.
     * @param s2 The second string.
     * @return True if s2 is a rotation of s1, false otherwise.
     */
    static boolean checkForRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        String[] strings = {"waterbottle", "erbottlewat", "lewaterbott", "bottlewater", "terbottlewa", "ottlewaterb"}; // Example strings
        // String[] strings = {"abc", "cab", "bca"}; // Example strings
        //String[] strings = {"abc", "cab", "bca", "abcd"};


        boolean allRotations = true;
        for (int i = 1; i < strings.length; i++) {
            if (!checkForRotation(strings[0], strings[i])) {
                allRotations = false;
                break;
            }
        }

        if (allRotations) {
            System.out.println("All strings are rotations of each other.");
        } else {
            System.out.println("Not all strings are rotations of each other.");
        }
    }
}
