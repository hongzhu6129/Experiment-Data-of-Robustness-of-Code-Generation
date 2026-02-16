public class Main {

    public static void main(String[] args) {
        String inputString = "buzz"; // Example invalid input

        try {
            int parsedInt = Integer.parseInt(inputString);
            System.out.println("Parsed integer: " + parsedInt); // This line will not be reached if parsing fails
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Cannot convert \"" + inputString + "\" to an integer.");
            // Handle the error appropriately.  For example, you might:
            // *  Ask the user for new input
            // *  Use a default value
            // *  Exit the program
        }


        // Demonstrating how to correctly parse integers from strings
        String validInput = "123";
        try {
            int validParsedInt = Integer.parseInt(validInput);
            System.out.println("Parsed integer (valid): " + validParsedInt); 
        } catch (NumberFormatException e) {
            System.out.println("Unexpected error parsing \"" + validInput + "\": " + e.getMessage());
        }


        // Demonstrating handling integers with leading/trailing whitespace:
        String whitespaceInput = "  456  ";
        try {
            int whitespaceParsedInt = Integer.parseInt(whitespaceInput.trim());  // trim() removes leading/trailing whitespace
            System.out.println("Parsed integer (with whitespace): " + whitespaceParsedInt);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing \"" + whitespaceInput + "\": " + e.getMessage());
        }



    }
}
