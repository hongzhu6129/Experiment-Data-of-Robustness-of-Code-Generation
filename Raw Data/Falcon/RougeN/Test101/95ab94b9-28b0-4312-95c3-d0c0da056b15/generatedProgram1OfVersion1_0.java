public class GetCharacterAtIndex {

    public static void main(String[] args) {
        String str = "This is a test string.";
        int index1 = 5;
        int index2 = 10;
        int index3 = 0;  // Demonstrating getting the first character
        int index4 = str.length() - 1; // Demonstrating getting the last character



        try {
            int codePoint1 = str.codePointAt(index1);
            int codePoint2 = str.codePointAt(index2);
            int codePoint3 = str.codePointAt(index3);
            int codePoint4 = str.codePointAt(index4);




            System.out.println("Character (Unicode code point) at index " + index1 + ": " + codePoint1 + " (Character: " + (char) codePoint1 + ")");
            System.out.println("Character (Unicode code point) at index " + index2 + ": " + codePoint2 + " (Character: " + (char) codePoint2 + ")");
            System.out.println("Character (Unicode code point) at index " + index3 + ": " + codePoint3 + " (Character: " + (char) codePoint3 + ")");
            System.out.println("Character (Unicode code point) at index " + index4 + ": " + codePoint4 + " (Character: " + (char) codePoint4 + ")");


        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index is out of bounds.");
        }



        // Example with a supplementary character (represented by surrogate pairs)
        String strWithSupplementary = "Hello \uD83D\uDE00"; // Smiley face emoji
        int supplementaryIndex = 6;

        try {
            int supplementaryCodePoint = strWithSupplementary.codePointAt(supplementaryIndex);
            System.out.println("Character (Unicode code point) at index " + supplementaryIndex + ": " + supplementaryCodePoint);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Error: Index is out of bounds.");
        }

    }
}



