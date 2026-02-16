public class DecimalToOctal {

    public static void main(String[] args) {
        int decimal = 15; 

        // Method 1: Using Integer.toOctalString()
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal number is: " + octal);

        // Method 2: Using manual conversion (for demonstration)
        decimal = 15; // Reset for the second method
        int octalNum = 0;
        int i = 1;

        while (decimal != 0) {
            octalNum += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        System.out.println("Octal number (manual method) is: " + octalNum);


        // Example with user input (requires exception handling in a real application)
        if (args.length > 0) {
            try {
                decimal = Integer.parseInt(args[0]);
                octal = Integer.toOctalString(decimal);
                System.out.println("Octal equivalent of " + decimal + " is: " + octal);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer.");
            }
        }


    }
}
