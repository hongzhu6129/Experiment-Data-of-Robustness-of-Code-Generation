public class BinaryToOctal {

    public static void main(String[] args) {
        // Example usage:
        String binary = "111";
        convertBinaryToOctal(binary); 

        binary = "1010";
        convertBinaryToOctal(binary);

        binary = "111111"; // Longer example
        convertBinaryToOctal(binary);

        binary = "10000000"; // Another longer example
        convertBinaryToOctal(binary);

         binary = "110101"; // Example with mix of 1s and 0s
        convertBinaryToOctal(binary);


    }

    public static void convertBinaryToOctal(String binary) {
        try {
            // 1. Convert Binary to Decimal
            int decimal = Integer.parseInt(binary, 2);


            // 2. Convert Decimal to Octal
            String octal = Integer.toOctalString(decimal);


            System.out.println("Binary: " + binary + " -> Octal: " + octal);

        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input: " + binary);
        }

    }
}
