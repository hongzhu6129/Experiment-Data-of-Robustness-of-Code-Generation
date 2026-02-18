public class Main {
    public static void main(String[] args) {
        String inputString = "buzz"; // Or get this from user input, a file, etc.

        try {
            int intValue = Integer.parseInt(inputString); 
            System.out.println("The integer value is: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Cannot convert \"" + inputString + "\" to an integer.");
            // Handle the error appropriately.  You might log it, exit the program,
            // ask the user for another input, or skip processing this input.
        }


        // Demonstrating how to use parseInt with valid input.
        String validInput = "12345";
        try {
            int validInt = Integer.parseInt(validInput);
            System.out.println("Valid integer: " + validInt);
        } catch (NumberFormatException e) {
            System.out.println("Unexpected error parsing valid input: " + e.getMessage());
        }



        // Example:  Parsing an integer from a command-line argument
        if (args.length > 0) {
            try {
                int argInt = Integer.parseInt(args[0]);
                System.out.println("Integer from command line: " + argInt);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid command-line argument. Please provide an integer.");
            }
        }



    }
}
