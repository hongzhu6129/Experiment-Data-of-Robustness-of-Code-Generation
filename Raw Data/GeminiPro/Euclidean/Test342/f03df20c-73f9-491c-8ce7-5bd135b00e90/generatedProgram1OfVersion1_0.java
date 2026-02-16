public class Main {
    public static void main(String[] args) {
        // The error "invalid literal for int() with base 10: 'quick'" occurs
        // when you try to convert a string that is not a valid integer (like "quick") 
        // into an integer using Integer.parseInt() or similar methods.

        String nonNumericString = "quick";

        // This line would cause the error:
        // int number = Integer.parseInt(nonNumericString); 

        // How to fix it:

        // 1. Check if the string is numeric before converting:

        if (nonNumericString.matches("-?\\d+")) { // Matches optional negative sign and one or more digits
            int number = Integer.parseInt(nonNumericString);
            System.out.println("The number is: " + number);
        } else {
            System.out.println("The input string is not a valid integer.");
        }


        // 2. Use a try-catch block to handle the NumberFormatException:

        try {
            int number = Integer.parseInt(nonNumericString);
            System.out.println("The number is: " + number);  // This won't be reached if there's an exception
        } catch (NumberFormatException e) {
            System.out.println("Error: The input string is not a valid integer.");
            // Optionally, you can print the stack trace for debugging:
            // e.printStackTrace();
        }


        // 3. If you expect non-numeric input and want a default value:
        
        int number;
        try {
             number = Integer.parseInt(nonNumericString);
        } catch (NumberFormatException e) {
            number = 0; // Or any other default value you want
            System.out.println("Using default value: " + number);
        }


        // Example with command-line arguments:

        if (args.length > 0) {
            try {
                int argNumber = Integer.parseInt(args[0]);
                System.out.println("Integer from command line: " + argNumber);
            } catch (NumberFormatException e) {
                System.out.println("Error: Command-line argument is not a valid integer.");
            }

        }


    }
}
