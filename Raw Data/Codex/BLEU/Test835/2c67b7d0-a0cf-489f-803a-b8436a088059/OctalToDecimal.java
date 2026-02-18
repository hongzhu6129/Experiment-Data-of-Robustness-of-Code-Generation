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
                int digit = digitChar - '0'; // Convert char to int

                if (digit < 0 || digit > 7) {  // Check for invalid octal digits
                    System.out.println("Invalid octal number.");
                    return;
                }

                decimal += digit * power;
                power *= 8;
            }

            System.out.println("Decimal equivalent: " + decimal);

        } catch (NumberFormatException e) { // Handle cases like empty input or non-numeric characters
            System.out.println("Invalid input.");
        }

        scanner.close(); 
    }
}
