public class StringRotationChecker {

    static boolean checkForRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        if (s1.isEmpty() && s2.isEmpty()) { // Handle empty strings
            return true;
        }
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        String[] strings = {"waterbottle", "erbottlewat", "lewaterbott", "bottlewater", "terbottlewa", "ottlewaterb"}; // Example strings
        // String[] strings = {"AACD", "ACDA", "DAAC", "CDAB", "CDAA"}; // Example where not all are rotations
        // String[] strings =  {"abc", "bca", "cab"}; // Example where all are rotations
        // String[] strings = {"waterbottle", "", "lewaterbott", "bottlewater", "terbottlewa", "ottlewaterb"}; // Example with empty string
        // String[] strings = {"", "", "", "", "", ""};  // Example all empty strings

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
