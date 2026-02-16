public class GetCharacterAtIndex {

    public static void main(String[] args) {

        // Example strings
        String str1 = "Hello, World!";
        String str2 = "Java Programming";
        String str3 = "Unicode Example: \u03A9"; // Omega symbol

        // Example indices
        int index1 = 7;
        int index2 = 0;
        int index3 = 18; // Index of the Omega symbol


        // Method 1: Using charAt() (for code units in the Basic Multilingual Plane BMP)
        try {
            char charAtIndex1 = str1.charAt(index1);
            System.out.println("Character at index " + index1 + " in \"" + str1 + "\": " + charAtIndex1);

            char charAtIndex2 = str2.charAt(index2);
            System.out.println("Character at index " + index2 + " in \"" + str2 + "\": " + charAtIndex2);


            // Demonstrating potential issue with charAt() and supplementary characters
            //  charAt() returns a char which represents a UTF-16 code unit. If the character at the specified
            // index is a supplementary character (represented by a surrogate pair),  charAt() will only 
            // return one half of the pair, leading to incorrect results.
            char charAtIndex3_incorrect = str3.charAt(index3); 
            System.out.println("Incorrectly using charAt() for supplementary character:  " + charAtIndex3_incorrect + " (This is only one surrogate pair)");

           


        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds: " + e.getMessage());
        }

        // Method 2: Using codePointAt() (Correct approach for all Unicode characters including Supplementary Characters)

        try{
            int codePointAtIndex3 = str3.codePointAt(index3);
            System.out.println("Character (code point) at index " + index3 + " in \"" + str3 + "\": " + codePointAtIndex3 + "  (" + String.valueOf(Character.toChars(codePointAtIndex3))+")");

            // Example with surrogate pairs. Note the index adjustment in the second call.
            String str4 = "A\uD83D\uDE00B"; // A, grinning face emoji, B
            System.out.println("Code point at index 1: " + str4.codePointAt(1) + " (" + String.valueOf(Character.toChars(str4.codePointAt(1))) + ")");
            System.out.println("Code point at index 2 (adjusted): " + str4.codePointAt(2)); // Notice that it's index 2, not 3! The emoji is a single character (code point).

            System.out.println("String length (code units, not code points): " + str4.length()); // 4, because the emoji is 2 code units
            System.out.println("String length (code points): " + str4.codePointCount(0, str4.length())); // 3, correctly counting the emoji as one character

        }  catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds: " + e.getMessage());
        }



    }
}
