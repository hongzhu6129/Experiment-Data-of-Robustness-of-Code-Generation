public class Main {
    public static void main(String[] args) {
        String inputString = "### "; 

        try {
            int parsedInt = Integer.parseInt(inputString.trim()); // Trim whitespace
            System.out.println("Parsed integer: " + parsedInt);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input string. Cannot convert '" + inputString + "' to an integer.");
            // Handle the error appropriately, e.g., log it, exit the program, or prompt the user for valid input.
        }



        // Demonstrating more robust input handling using a regular expression:
        String anotherInput = " 1234 "; // Example with leading and trailing spaces and a valid integer
        String numericPart = anotherInput.trim().replaceAll("[^0-9]", ""); //Extract only numeric characters

        if (!numericPart.isEmpty()) {
            try {
                int parsedInt2 = Integer.parseInt(numericPart);
                System.out.println("Parsed integer (using regex): " + parsedInt2);
            } catch (NumberFormatException e) {
                System.err.println("Error: Even after cleaning, the string '" + anotherInput + "' is not a valid integer.");
            }

        } else {
            System.err.println("Error: Input string '" + anotherInput + "' does not contain any digits.");
        }


    }
}
