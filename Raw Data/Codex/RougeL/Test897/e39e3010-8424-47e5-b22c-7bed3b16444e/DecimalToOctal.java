public class DecimalToOctal {

    public static void main(String[] args) {
        int decimal = 15;

        // Method 1: Using Integer.toOctalString()
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal number is: " + octal);


        // Method 2: Manual Conversion (for demonstration)
        decimal = 15; // Reset for second method
        int octalNum = 0;
        int i = 1;

        while (decimal != 0) {
            octalNum += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        System.out.println("Octal number (manual conversion) is: " + octalNum);



        // Example with user input (requires error handling in real application)
         if (args.length > 0) {
            try {
                decimal = Integer.parseInt(args[0]);
                octal = Integer.toOctalString(decimal);
                System.out.println("Octal equivalent of " + decimal + " is: " + octal);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: " + args[0] + " is not a valid integer.");
            }
        } else {
             System.out.println("No command line argument provided. Using default value 15.");
             // and then you can use 15 or some other default here...

         }
    }
}
