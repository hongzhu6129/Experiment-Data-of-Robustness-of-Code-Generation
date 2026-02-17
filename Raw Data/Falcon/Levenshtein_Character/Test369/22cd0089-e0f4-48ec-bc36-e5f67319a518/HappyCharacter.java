public class HappyCharacter {

    /**
     * Checks if a specified character is happy in a given string.
     *
     * @param str The input string.
     * @return True if the character is happy, false otherwise.
     */
    public boolean aCharacterIsHappy(String str) {
        if (str == null || str.length() < 2) {
            return false; // A single character or empty string cannot be happy
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check left neighbor (if exists)
            if (i > 0 && str.charAt(i - 1) == currentChar) {
                return true;
            }

            // Check right neighbor (if exists)
            if (i < str.length() - 1 && str.charAt(i + 1) == currentChar) {
                return true;
            }
        }

        return false; // No happy character found
    }

    public static void main(String[] args) {
        HappyCharacter checker = new HappyCharacter();

        String str1 = "aabcda";
        System.out.println("Is a character happy in '" + str1 + "': " + checker.aCharacterIsHappy(str1)); // True (a)

        String str2 = "aabbcda";
        System.out.println("Is a character happy in '" + str2 + "': " + checker.aCharacterIsHappy(str2)); // True (a and b)

        String str3 = "abcd";
        System.out.println("Is a character happy in '" + str3 + "': " + checker.aCharacterIsHappy(str3)); // False

        String str4 = "a";
        System.out.println("Is a character happy in '" + str4 + "': " + checker.aCharacterIsHappy(str4)); // False

        String str5 = ""; // Empty string
        System.out.println("Is a character happy in '" + str5 + "': " + checker.aCharacterIsHappy(str5)); // False


         String str6 = null; // null string
        System.out.println("Is a character happy in '" + str6 + "': " + checker.aCharacterIsHappy(str6)); // False

    }
}
