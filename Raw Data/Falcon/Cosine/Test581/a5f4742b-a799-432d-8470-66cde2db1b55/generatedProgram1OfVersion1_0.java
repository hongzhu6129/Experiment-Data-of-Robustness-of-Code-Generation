public class DecimalToOctal {

    public static void main(String[] args) {
        int decimal = 15; 

        // Method 1: Using Integer.toOctalString()
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal number is (Method 1): " + octal);

        // Method 2: Manual conversion (for understanding)
        int octal2 = 0, i = 1;
        while (decimal != 0) {
            octal2 += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;  // Efficient for small numbers, otherwise, use StringBuilder
        }
        System.out.println("Octal number is (Method 2): " + octal2);


        // Example with user input (requires error handling in a real application)
         if (args.length > 0) {
            try {
                decimal = Integer.parseInt(args[0]);
                octal = Integer.toOctalString(decimal);
                System.out.println("Octal equivalent of " + decimal + " is: " + octal);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid integer.");
            }
        } else {
            System.out.println("No input provided. Using default value of 15.");
        }
    }
}
