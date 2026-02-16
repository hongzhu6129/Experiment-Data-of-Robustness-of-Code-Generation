public class BinaryToHexadecimal {

    public static void main(String[] args) {
        // Input binary number as a string (since it can be long)
        String binaryNumber = "1101"; 

        // Convert binary to integer, then integer to hex
        try {
            int decimalEquivalent = Integer.parseInt(binaryNumber, 2);
            String hexadecimalEquivalent = Integer.toHexString(decimalEquivalent);

            System.out.println("Hexadecimal value: " + hexadecimalEquivalent.toUpperCase());

        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number input.");
        }
    }
}
