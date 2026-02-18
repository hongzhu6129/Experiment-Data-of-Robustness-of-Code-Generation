import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();

        int decimal = 0;
        int power = 0;
        boolean isValid = true;


        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digit = binaryString.charAt(i);

            if (digit == '0') {
                // Do nothing, as 0 * 2^power is always 0
            } else if (digit == '1') {
                decimal += Math.pow(2, power);
            } else {
                isValid = false; // Invalid input (not 0 or 1)
                break;
            }
            power++;
        }

        if (isValid) {
            System.out.println("Decimal value: " + decimal);
            System.out.println("Hexadecimal value: '" + Integer.toHexString(decimal) + "'"); // Using Integer.toHexString for hex conversion
        } else {
            System.out.println("Invalid binary input. Please enter a string containing only 0s and 1s.");
        }

        input.close(); // Close the scanner to release resources
    }
}



