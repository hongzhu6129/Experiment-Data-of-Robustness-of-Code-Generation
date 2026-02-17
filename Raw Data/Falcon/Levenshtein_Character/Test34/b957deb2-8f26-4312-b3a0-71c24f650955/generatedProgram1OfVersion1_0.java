public class DecimalToHexadecimal {

    public static void main(String[] args) {
        int decimalNumber = 15;
        String hexadecimalNumber = Integer.toHexString(decimalNumber);

        System.out.println("Hexadecimal number is: " + hexadecimalNumber);


        // Example with user input (requires exception handling in a real application)
        if (args.length > 0) {
            try {
                decimalNumber = Integer.parseInt(args[0]);
                hexadecimalNumber = Integer.toHexString(decimalNumber);
                System.out.println("Hexadecimal equivalent of " + decimalNumber + " is: " + hexadecimalNumber);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}
