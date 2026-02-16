import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;
            for (int i = octal.length() - 1; i >= 0; i--) {
                int digit = octal.charAt(i) - '0';
                if (digit < 0 || digit > 7) {
                    throw new NumberFormatException("Invalid octal digit: " + octal.charAt(i));
                }
                decimal += digit * Math.pow(8, power);
                power++;
            }


            String hex = "";
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

            if (hex.isEmpty()) {
                System.out.println("Hexadecimal equivalent: 0");
            } else {
                System.out.println("Hexadecimal equivalent: " + hex);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number: " + e.getMessage());
        }
    }
}
