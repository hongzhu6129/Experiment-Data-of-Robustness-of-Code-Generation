public class ReplaceCharacter {

    public static void main(String[] args) {
        String originalString = "This is a sample string.";
        char charToReplace = 's';
        char replacementChar = 'x';

        String replacedString = originalString.replace(charToReplace, replacementChar);

        System.out.println("Original string: " + originalString);
        System.out.println("Replaced string: " + replacedString);


        // Example with a specific instance (if arguments aren't provided)
        if (args.length == 0) {  // Demonstrate usage if no command-line arguments 
            String exampleString = "abracadabra";
            char exampleCharToReplace = 'a';
            char exampleReplacementChar = 'z';
            String exampleReplacedString = exampleString.replace(exampleCharToReplace, exampleReplacementChar);
            System.out.println("\nExample (hardcoded):");
            System.out.println("Original string: " + exampleString);
            System.out.println("Replaced string: " + exampleReplacedString);
        } else if (args.length == 3) { // Handle command-line arguments
            try {
                String inputString = args[0];
                char inputCharToReplace = args[1].charAt(0);
                char inputReplacementChar = args[2].charAt(0);

                String resultString = inputString.replace(inputCharToReplace, inputReplacementChar);

                System.out.println("\nResult from command-line arguments:");
                System.out.println("Original string: " + inputString);
                System.out.println("Replaced string: " + resultString);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Error:  Please provide characters for replacement.");
            }

        } else {
            System.out.println("Usage: java ReplaceCharacter \"string\" \"char_to_replace\" \"replacement_char\"");
        }


    }
}
