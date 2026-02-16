import java.math.BigInteger;

public class BinaryToHexadecimal {

    public static void main(String[] args) {
        String binaryNumber = "110110101010101010101011111111111111"; // Example of a very long binary number

        try {
            BigInteger decimalEquivalent = new BigInteger(binaryNumber, 2);
            String hexadecimalEquivalent = decimalEquivalent.toString(16);

            System.out.println("Hexadecimal value: " + hexadecimalEquivalent.toUpperCase());

        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number input.");
        }
    }
}
