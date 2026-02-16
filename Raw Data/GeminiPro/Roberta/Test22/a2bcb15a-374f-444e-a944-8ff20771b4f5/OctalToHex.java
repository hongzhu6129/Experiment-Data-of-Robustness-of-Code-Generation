import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;

            // Octal to Decimal conversion
            for (int i = octal.length() - 1; i >= 0; i--) {
                int digit = Character.getNumericValue(octal.charAt(i));
                if (digit < 0 || digit > 7) {  // Check for invalid octal digits
                    System.out.println("Invalid octal number.");
                    return;
                }
                decimal += digit * Math.pow(8, power);
                power++;
            }


            String hex = "";

            // Decimal to Hexadecimal conversion
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit;
                if (remainder < 10) {
                    hexDigit = (char) (remainder + '0');
                } else {
                    hexDigit = (char) (remainder - 10 + 'A');
                }
                hex = hexDigit + hex;
                decimal /= 16;
            }

            if (hex.isEmpty()) { // Handle the case where input is 0
                System.out.println("Hexadecimal equivalent: 0");
            } else {
                System.out.println("Hexadecimal equivalent: " + hex);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid octal number.");
        }

        input.close();
    }
}
