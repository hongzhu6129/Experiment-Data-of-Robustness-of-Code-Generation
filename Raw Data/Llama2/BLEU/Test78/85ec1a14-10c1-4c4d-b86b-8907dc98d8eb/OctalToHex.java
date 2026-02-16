import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalStr = scanner.nextLine();


        try {
            int decimal = 0;
            int power = 0;
            // Octal to Decimal conversion
            for (int i = octalStr.length() - 1; i >= 0; i--) {
                int digit = octalStr.charAt(i) - '0';  // Convert char to int
                if (digit < 0 || digit > 7) {
                    System.out.println("Invalid octal number.");
                    return; // Exit if invalid input
                }
                decimal += digit * Math.pow(8, power);
                power++;
            }

            // Decimal to Hexadecimal conversion
            String hexStr = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit;
                if (remainder < 10) {
                    hexDigit = (char) (remainder + '0');
                } else {
                    hexDigit = (char) (remainder - 10 + 'A');
                }
                hexStr = hexDigit + hexStr;  // Prepend the hex digit
                decimal /= 16;
            }
            if (hexStr.isEmpty()) { // Handle case where input is 0
                System.out.println("Hexadecimal equivalent: 0");
            } else {
                System.out.println("Hexadecimal equivalent: " + hexStr);
            }

        } catch (NumberFormatException e) {  //Catches if the input has characters other than digits
            System.out.println("Invalid Input");
        }



    }
}
