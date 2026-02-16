import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = input.nextLine();

        try {
            long decimal = 0;
            long power = 1;

            // Iterate through the octal string from right to left
            for (int i = octalString.length() - 1; i >= 0; i--) {
                char digitChar = octalString.charAt(i);

                // Validate the input character (0-7)
                if (digitChar < '0' || digitChar > '7') {
                    System.out.println("Invalid octal number: Contains characters other than 0-7.");
                    return; // Exit if invalid input
                }


                int digit = digitChar - '0'; // Convert char to int
                decimal += digit * power;
                power *= 8;



            }
            
            System.out.println("Decimal equivalent: " + decimal);

        } catch (NumberFormatException e) { //Handles cases like excessively large input causing overflow
            System.out.println("Invalid input. The number might be too large.");
        }


    }
}
