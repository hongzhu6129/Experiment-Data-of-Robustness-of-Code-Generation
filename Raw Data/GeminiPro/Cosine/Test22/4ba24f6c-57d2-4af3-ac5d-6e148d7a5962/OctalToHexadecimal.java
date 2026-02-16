import java.util.Scanner;

public class OctalToHexadecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalNumber = scanner.nextLine();

        try {
            // Convert octal to decimal
            int decimalNumber = 0;
            int power = 0;
            for (int i = octalNumber.length() - 1; i >= 0; i--) {
                int digit = octalNumber.charAt(i) - '0';
                if (digit < 0 || digit > 7) {
                    throw new NumberFormatException("Invalid octal digit: " + octalNumber.charAt(i));
                }
                decimalNumber += digit * Math.pow(8, power);
                power++;
            }


            // Convert decimal to hexadecimal
            String hexadecimalNumber = "";
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 16;
                char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
                hexadecimalNumber = hexDigit + hexadecimalNumber;
                decimalNumber /= 16;
            }

            if (hexadecimalNumber.isEmpty()) { //Handle the case where input is 0.
                hexadecimalNumber = "0";
            }


            System.out.println("Hexadecimal equivalent: " + hexadecimalNumber);


        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number: " + e.getMessage());
        }
        scanner.close();
    }
}
