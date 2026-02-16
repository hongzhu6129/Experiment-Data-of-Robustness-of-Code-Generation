import java.util.Scanner;

public class HexToOctal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexString = scanner.nextLine().toUpperCase();

        try {
            // Corner case: Empty string
            if (hexString.isEmpty()) {
                System.out.println("Octal equivalent: 0");
                return;
            }

            // Convert hex to decimal
            long decimalValue = 0;
            long power = 1;
            for (int i = hexString.length() - 1; i >= 0; i--) {
                char hexChar = hexString.charAt(i);
                int digit;
                if (hexChar >= '0' && hexChar <= '9') {
                    digit = hexChar - '0';
                } else if (hexChar >= 'A' && hexChar <= 'F') {
                    digit = hexChar - 'A' + 10;
                } else {
                    // Corner case: Invalid hex character
                    System.out.println("Invalid hexadecimal input.");
                    return;
                }
                decimalValue += digit * power;
                power *= 16;

                 //Corner case: overflow
                if (decimalValue < 0) { // Check for overflow during conversion
                     System.out.println("Hexadecimal value too large for conversion.");
                     return;
                }
            }


            // Convert decimal to octal
            String octalString = "";
            if (decimalValue == 0) { //Corner Case: Hex input is 0
                octalString = "0";
            } else {
                while (decimalValue > 0) {
                    octalString = (decimalValue % 8) + octalString;
                    decimalValue /= 8;
                }
            }

            System.out.println("Octal equivalent: " + octalString);

        } catch (NumberFormatException e) {
            // Corner Case:  non-hex characters or overflow in parsing.
            System.out.println("Invalid hexadecimal input.");
        }


    }
}
