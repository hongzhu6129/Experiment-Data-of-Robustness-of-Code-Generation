import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = input.nextLine();

        try {
            long decimal = 0;
            long power = 1;

            for (int i = octalString.length() - 1; i >= 0; i--) {
                char digitChar = octalString.charAt(i);
                int digit = digitChar - '0'; // Convert char to int

                if (digit < 0 || digit > 7) {
                    System.out.println("Invalid octal number: Contains digits outside 0-7");
                    return;
                }

                decimal += digit * power;
                power *= 8;

                if (decimal < 0) { // Check for overflow since it's a long
                  System.out.println("Overflow detected: The octal number is too large.");
                  return;
                }
            }

            System.out.println("Decimal equivalent: " + decimal);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Not a valid octal number.");
        }
    }
}
