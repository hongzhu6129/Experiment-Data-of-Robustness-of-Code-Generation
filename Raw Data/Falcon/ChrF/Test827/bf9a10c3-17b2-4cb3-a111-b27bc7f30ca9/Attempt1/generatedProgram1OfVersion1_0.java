public class DecimalToHexadecimal {

    public static void main(String[] args) {
        int decimalNumber = 15; // You can change this to take input from the user if needed

        String hexadecimalNumber = Integer.toHexString(decimalNumber).toUpperCase();

        System.out.println("Hexadecimal number is : " + hexadecimalNumber);


        // Example taking input from command-line arguments:
        if (args.length > 0) {
            try {
                decimalNumber = Integer.parseInt(args[0]);
                hexadecimalNumber = Integer.toHexString(decimalNumber).toUpperCase();
                System.out.println("Hexadecimal number is : " + hexadecimalNumber);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid decimal number.");
            }
        }


    }
}
