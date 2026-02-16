public class GetCharacterAtIndex {

    public static void main(String[] args) {

        String str = "Hello, world!";

        // Method 1: Using charAt() (for characters within the Basic Multilingual Plane - BMP)
        //  - Simpler for common characters (code points U+0000 to U+FFFF).
        //  - May return incorrect results for supplementary characters (outside the BMP).
        int index1 = 7; // Example index
        if (index1 >= 0 && index1 < str.length()) {
            char charAtIndex1 = str.charAt(index1);
            System.out.println("Character at index " + index1 + " (using charAt): " + charAtIndex1 + 
                               ", Unicode code point: " + (int) charAtIndex1); // Cast to int to get code point
        } else {
            System.out.println("Invalid index: " + index1);
        }



        // Method 2: Using codePointAt() (handles all Unicode characters, including supplementary ones)
        //  - More robust. Recommended for general use.
        int index2 = 0; // Example index
         if (index2 >= 0 && index2 < str.length()) {
            int codePointAtIndex2 = str.codePointAt(index2);
            System.out.println("Character at index " + index2 + " (using codePointAt): " + 
                               new String(Character.toChars(codePointAtIndex2)) + // Convert code point back to String
                               ", Unicode code point: " + codePointAtIndex2);
        } else {
            System.out.println("Invalid index: " + index2);
        }



        // Method 3: Using offsetByCodePoints() and codePointAt() for characters outside the BMP (Supplementary Characters)
        String strWithSupplementaryChar = "Hello, \uD83D\uDE00 world!"; // String with a smiley face emoji (U+1F600)
        int index3 = 7; // The index of the first part of the surrogate pair


        if (index3 >= 0 && index3 < strWithSupplementaryChar.length()) {
            int codePointAtIndex3 = strWithSupplementaryChar.codePointAt(index3);

            System.out.println("Character at index " + index3 + " (using offsetByCodePoints and codePointAt): " + 
                           new String(Character.toChars(codePointAtIndex3)) +     // Convert code point to String
                           ", Unicode code point: " + codePointAtIndex3);

            // Demonstrating how to get the next character's index if it's part of a supplementary character
            int nextIndex = strWithSupplementaryChar.offsetByCodePoints(index3, 1);  // Correctly skips the surrogate pair
            System.out.println("Index of the next character: " + nextIndex);
        } else {
            System.out.println("Invalid index: " + index3);
        }
    }
}
