public class StringChecker {

    public static void main(String[] args) {
        System.out.println(test("programming", "program")); // true
        System.out.println(test("programming", "Program")); // false due to case sensitivity
        System.out.println(test("hello", "world")); // false
        System.out.println(test("abcdefg", "gfedcba")); // true
        System.out.println(test("aabbcc", "aabbc")); // true
        System.out.println(test("aabbcc", "aabcC"));  //false
    }

    public static boolean test(String first, String second) {
        // Create char arrays for efficient checking
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        // Iterate through each character in the second string
        for (char c : secondChars) {
            boolean found = false;
            // Look for the current character in the first string
            for (char d : firstChars) {
                if (c == d) {
                    found = true;
                    break; // Move to the next character in second string once found
                }
            }
            // If character not found, return false
            if (!found) {
                return false;
            }
        }

        // All characters found, return true
        return true;
    }
}
