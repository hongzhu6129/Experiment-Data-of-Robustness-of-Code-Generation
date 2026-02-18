import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            long octal = Long.parseLong(octalString);
            long decimal = 0;
            long power = 1;

            // Handle negative numbers (although strictly, octal is unsigned)
            boolean isNegative = false;
            if (octalString.startsWith("-")) {
                isNegative = true;
                octal = -octal; // Make it positive for processing
                octalString = octalString.substring(1); // Remove the minus sign for validation
            }


            // Validate octal input (digits 0-7 only)
            for (char c : octalString.toCharArray()) {
                if (c < '0' || c > '7') {
                    System.out.println("Invalid octal number.  Digits must be 0-7.");
                    return;
                }
            }


            // Convert
            long tempOctal = octal;  // Use a temp variable to preserve original input
            while (tempOctal != 0) {
                long lastDigit = tempOctal % 10;
                tempOctal /= 10;
                decimal += lastDigit * power;
                power *= 8;

                // Overflow check  (Important for larger octal numbers)
                if (decimal < 0 && !isNegative) { // Detect unintended sign change (overflow)
                  System.out.println("Octal number too large to represent as a long decimal.");
                  return;
                }

            }

            if (isNegative) {
                decimal = -decimal; // Restore the negative sign if necessary
            }
            System.out.println("Decimal equivalent: " + decimal);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input.  Please enter a valid octal number.");
        }
        scanner.close();

    }
}
