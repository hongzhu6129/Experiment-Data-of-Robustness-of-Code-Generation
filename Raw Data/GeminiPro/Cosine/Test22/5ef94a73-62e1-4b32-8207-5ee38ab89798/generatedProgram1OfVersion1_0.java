import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            int decimal = 0;
            int power = 0;
            for (int i = octalString.length() - 1; i >= 0; i--) {
                char digitChar = octalString.charAt(i);
                if (!Character.isDigit(digitChar) || digitChar - '0' >= 8) {
                    throw new NumberFormatException("Invalid octal digit");
                }
                int digit = digitChar - '0';
                decimal += digit * Math.pow(8, power);
                power++;
            }

            String hexString = Integer.toHexString(decimal).toUpperCase();

            System.out.println("Hexadecimal equivalent: " + hexString);


        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }


    }
}
