import java.util.Arrays;

class Solution {
    /**
     * Determines if two strings are anagrams of each other.
     *
     * @param s The first string.
     * @param t The second string.
     * @return True if the strings are anagrams, false otherwise.
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }


    /**
     * Converts a string to an integer.
     *
     * @param s The string to convert.
     * @return The integer representation of the string.
     * @throws NumberFormatException If the string cannot be converted to an integer.
     */
    public int stringToInt(String s) throws NumberFormatException {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            // Handle the exception appropriately, e.g., re-throw, log, or return a default value.
            System.err.println("Error: Invalid string for conversion to integer: " + s); // Log the error
            throw e; // Re-throw the exception to be handled by the calling method
        }
    }




    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test isAnagram
        System.out.println(solution.isAnagram("listen", "silent")); // Output: true
        System.out.println(solution.isAnagram("hello", "world"));  // Output: false

        // Test stringToInt (demonstrates handling the exception)
        try {
            int num = solution.stringToInt("12345");
            System.out.println("Converted integer: " + num);  // Output: Converted integer: 12345

            num = solution.stringToInt("anagram"); // This will throw NumberFormatException
            System.out.println("This line won't be reached.");

        } catch (NumberFormatException e) {
            // This block will catch the exception thrown by stringToInt
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        
    }
}
