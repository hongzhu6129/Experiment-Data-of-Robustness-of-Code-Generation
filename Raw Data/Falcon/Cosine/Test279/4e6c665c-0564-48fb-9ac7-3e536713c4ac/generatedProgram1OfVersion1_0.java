import java.util.Scanner;

public class HexToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexString = scanner.nextLine().toUpperCase();

        String binaryString = "";

        // Handle potential empty input
        if (hexString.isEmpty()) {
            System.out.println("Invalid input (empty string).");
            return; 
        }


        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);

            // Validate input characters
            if (!((hexChar >= '0' && hexChar <= '9') || (hexChar >= 'A' && hexChar <= 'F'))) {
                System.out.println("Invalid input (non-hexadecimal character).");
                return;
            }

            int decimalValue;

            if (hexChar >= '0' && hexChar <= '9') {
                decimalValue = hexChar - '0';
            } else {
                decimalValue = hexChar - 'A' + 10;
            }


            String binaryDigit = "";
            // Convert decimal to binary (4 bits)
            for (int j = 0; j < 4; j++) { // Ensure 4-bit representation
                binaryDigit = (decimalValue % 2) + binaryDigit;  // Prepend for correct order
                decimalValue /= 2;
            }

            binaryString += binaryDigit;
        }

        System.out.println("Binary equivalent: " + binaryString);
        scanner.close();
    }
}
