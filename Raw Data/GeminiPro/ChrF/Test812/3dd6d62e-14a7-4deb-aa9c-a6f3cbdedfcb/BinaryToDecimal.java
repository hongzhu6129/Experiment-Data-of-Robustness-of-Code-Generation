public class BinaryToDecimal {

    public static void main(String[] args) {
        // Input binary number as a string from command-line arguments.
        if (args.length == 0) {
            System.out.println("Please provide a binary number as a command-line argument.");
            return;
        }

        String binaryString = args[0];

        try {
            // Convert binary string to decimal integer.
            int decimal = Integer.parseInt(binaryString, 2);

            // Output the decimal equivalent.
            System.out.println("decimal number: " + decimal);

        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number input. Please enter a valid binary string (e.g., 101101).");
        }
    }
}
