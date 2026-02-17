public class DecimalToHexadecimal {

    public static void main(String[] args) {
        int decimal = 15;
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("hexadecimal number is: " + hexadecimal);

        // Additional examples demonstrating direct output and handling different inputs within main
        System.out.println("Hex of 255 is: " + Integer.toHexString(255)); 
        System.out.println("Hex of 10 is: " + Integer.toHexString(10));

        // Example with user input (requires exception handling for non-integer input)
        if (args.length > 0) {
            try {
                int inputDecimal = Integer.parseInt(args[0]);
                String inputHex = Integer.toHexString(inputDecimal);
                System.out.println("Hex of " + inputDecimal + " is: " + inputHex);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: Please provide an integer.");
            }

        }



    }
}
