public class DecimalToOctal {

    public static void main(String[] args) {
        int decimal = 15;

        // Use Integer.toOctalString() for direct conversion
        String octal = Integer.toOctalString(decimal);

        System.out.println("Decimal number: " + decimal);
        System.out.println("Octal number is: " + octal);



        // Alternatively, manually convert using a loop and modulo operator
        decimal = 15; // Reset for demonstration
        octal = "";  // Reset for demonstration

        int remainder;
        while (decimal > 0) {
            remainder = decimal % 8;
            octal = remainder + octal; // Prepend the remainder (building from right to left)
            decimal = decimal / 8;
        }


        System.out.println("Decimal number: " + 15); // Using 15 directly for clarity in this example.
        System.out.println("Octal number is (manual method): " + octal);

        // Example with user input (requires exception handling in a real application)
        if (args.length > 0) {
            try {
                decimal = Integer.parseInt(args[0]);
                octal = Integer.toOctalString(decimal);
                System.out.println("Decimal number (from input): " + decimal);
                System.out.println("Octal number is (from input): " + octal);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer.");
            }
        }


    }
}
