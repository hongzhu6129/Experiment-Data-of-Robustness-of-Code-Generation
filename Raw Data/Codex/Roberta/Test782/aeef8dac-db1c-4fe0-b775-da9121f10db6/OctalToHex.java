import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            // Validate input (only digits 0-7 allowed)
            for (char c : octalString.toCharArray()) {
                if (c < '0' || c > '7') {
                    throw new IllegalArgumentException("Invalid octal number: Contains characters other than 0-7.");
                }
            }

            // Octal to Decimal
            int decimal = 0;
            int power = 0;
            for (int i = octalString.length() - 1; i >= 0; i--) {
                decimal += (octalString.charAt(i) - '0') * Math.pow(8, power);
                power++;
            }


            // Decimal to Hexadecimal
            String hexString = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
                hexString = hexDigit + hexString;
                decimal /= 16;
            }

            if (hexString.isEmpty()) { //Handle the case of input 0
                hexString = "0";
            }

            System.out.println("Hexadecimal equivalent: " + hexString);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Number too large."); // Handle potential overflow
        } catch (IllegalArgumentException e) {
             System.out.println(e.getMessage());  // Invalid character message
        }
    }
}
