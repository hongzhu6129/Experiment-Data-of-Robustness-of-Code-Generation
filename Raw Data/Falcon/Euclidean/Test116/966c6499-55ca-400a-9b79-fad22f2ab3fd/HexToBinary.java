import java.util.Scanner;

public class HexToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexString = scanner.nextLine().toUpperCase();

        // Handle corner cases: empty string and non-hex characters
        if (hexString.isEmpty()) {
            System.out.println("Invalid input: Empty string.");
            return;
        }


        String binaryString = "";
        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);

            // Validate hex characters
            if (!((hexChar >= '0' && hexChar <= '9') || (hexChar >= 'A' && hexChar <= 'F'))) {
                System.out.println("Invalid input: Non-hexadecimal character detected.");
                return;
            }


            int decimalValue;
            if (hexChar >= '0' && hexChar <= '9') {
                decimalValue = hexChar - '0';
            } else {
                decimalValue = hexChar - 'A' + 10;
            }

            String binaryEquivalent = "";
            for (int j = 0; j < 4; j++) {  // Convert each hex digit to 4 binary bits
                binaryEquivalent = (decimalValue % 2) + binaryEquivalent;
                decimalValue /= 2;
            }

            binaryString += binaryEquivalent;

        }
        System.out.println("Binary equivalent: " + binaryString);
        scanner.close();

    }
}

