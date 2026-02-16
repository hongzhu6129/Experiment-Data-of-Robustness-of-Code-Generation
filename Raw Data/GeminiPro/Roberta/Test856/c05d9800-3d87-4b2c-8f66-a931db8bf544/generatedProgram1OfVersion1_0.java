public class DecimalToHexadecimal {

    public static void main(String[] args) {
        int decimal = 15; 

        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("hexadecimal number is: " + hexadecimal);


        // Example with user input (requires exception handling if input is not a valid integer)
        if (args.length > 0) {
            try {
                decimal = Integer.parseInt(args[0]);
                hexadecimal = Integer.toHexString(decimal);
                System.out.println("Input: " + decimal + ", Hexadecimal: " + hexadecimal);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}
