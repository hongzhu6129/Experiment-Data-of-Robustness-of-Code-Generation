import java.util.Scanner;

public class BinaryToHexadecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            int decimal = Integer.parseInt(binaryString, 2); // Convert binary to decimal
            String hexadecimal = Integer.toHexString(decimal).toUpperCase(); // Convert decimal to hex

            System.out.println("Hexadecimal value: " + hexadecimal);


        } catch (NumberFormatException e) {
            System.err.println("Invalid binary input. Please enter a valid binary number (e.g., 101101).");
        }

        scanner.close(); // Close the scanner to release resources


        // Educational Explanation:  How Binary to Hexadecimal conversion works

        System.out.println("\nExplanation:");
        System.out.println("1. Binary is base-2 (uses 0 and 1). Hexadecimal is base-16 (0-9 and A-F).");
        System.out.println("2. Each hexadecimal digit represents 4 binary digits (bits).");
        System.out.println("3. Group the binary number into sets of 4 bits from right to left.");
        System.out.println("4. If a group has less than 4 bits, pad it with leading zeros.");
        System.out.println("5. Convert each 4-bit group to its decimal equivalent.");
        System.out.println("6. If the decimal equivalent is 10-15, represent it with A-F respectively.");
        System.out.println("7. Combine the hexadecimal digits to get the final result.");

        //Example:
        System.out.println("\nExample: Converting 1101 to Hexadecimal");
        System.out.println("1. Group into 4 bits: 1101");
        System.out.println("2. Convert to decimal: 1*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 8 + 4 + 0 + 1 = 13");
        System.out.println("3. 13 in decimal is D in hexadecimal.");
        System.out.println("Therefore, 1101 (binary) = D (hexadecimal)");

    }
}
