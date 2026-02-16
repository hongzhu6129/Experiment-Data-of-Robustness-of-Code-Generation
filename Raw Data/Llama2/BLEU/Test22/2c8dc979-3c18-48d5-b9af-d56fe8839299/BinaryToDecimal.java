public class BinaryToDecimal {

    public static void main(String[] args) {
        // Input binary number as a string (since it might be long).
        String binaryString = "100"; // You can change this to any binary string.

        try {
            // Use Integer.parseInt with radix 2 to convert binary to decimal.
            int decimal = Integer.parseInt(binaryString, 2);

            // Output the result.
            System.out.println("Input a binary number: " + binaryString);
            System.out.println("Decimal number: " + decimal); 

        } catch (NumberFormatException e) {
            System.out.println("Invalid binary string: " + binaryString);
        }
    }
}
