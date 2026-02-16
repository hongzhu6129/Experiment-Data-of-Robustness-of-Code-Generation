import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            long decimal = 0;
            long power = 1;

            // Iterate through the octal string from right to left
            for (int i = octalString.length() - 1; i >= 0; i--) {
                char digitChar = octalString.charAt(i);

                // Check if the character is a valid octal digit
                if (digitChar < '0' || digitChar > '7') {
                    throw new IllegalArgumentException("Invalid octal digit: " + digitChar);
                }

                int digit = digitChar - '0';  // Convert char to int
                decimal += digit * power;
                power *= 8;
            }

            System.out.println("Decimal equivalent: " + decimal);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) { // Catch any other potential exceptions (e.g., NumberFormatException)
            System.err.println("An unexpected error occurred.");
        }

        scanner.close(); // Close the scanner
    }
}
