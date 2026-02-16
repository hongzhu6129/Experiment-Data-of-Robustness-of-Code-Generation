public class DecimalToHexadecimal {

    public static void main(String[] args) {
        int decimal = 15;
        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("hexadecimal number is: " + hexadecimal);


        // Example with user input (requires exception handling for robust code, but keeping it simple for this exercise)
        if (args.length > 0) {  // Check if a command-line argument was provided
            try {
                decimal = Integer.parseInt(args[0]);
                hexadecimal = Integer.toHexString(decimal);
                System.out.println("Input: " + decimal);
                System.out.println("Hexadecimal equivalent: " + hexadecimal);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer.");
            }

        }

    }
}
