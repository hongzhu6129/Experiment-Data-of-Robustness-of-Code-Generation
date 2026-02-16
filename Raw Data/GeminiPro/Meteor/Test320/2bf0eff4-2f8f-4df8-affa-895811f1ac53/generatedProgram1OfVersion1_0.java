public class GetCharacterAtIndex {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java GetCharacterAtIndex <string> <index>");
            return;
        }

        String inputString = args[0];
        try {
            int index = Integer.parseInt(args[1]);

            if (index < 0 || index >= inputString.length()) {
                System.out.println("Index out of bounds.");
            } else {
                int codePoint = inputString.codePointAt(index);
                System.out.println("Character at index " + index + ": " + (char) codePoint + " (Unicode code point: " + codePoint + ")");


                // Demonstrating supplementary character handling (if needed):
                 //  (Important for characters beyond the Basic Multilingual Plane)

                // Example string with a supplementary character (e.g., an emoji)
                String emojiString = "Hello \uD83D\uDE00"; // Smiling face emoji
                for (int i = 0; i < emojiString.length(); ) { // Note the unusual loop condition
                    int cp = emojiString.codePointAt(i);
                    System.out.println("Character (potentially supplementary) at index " + i + ": " + String.valueOf(Character.toChars(cp)));
                    i += Character.charCount(cp);  // Increment by the number of Java chars in this code point 
                }


            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid index. Please enter an integer.");
        }
    }
}
