import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            int decimal = 0;
            int power = 0;

            // Octal to Decimal conversion
            for (int i = octalString.length() - 1; i >= 0; i--) {
                char digit = octalString.charAt(i);
                if (digit < '0' || digit > '7') {
                    throw new NumberFormatException("Invalid octal digit: " + digit);
                }

                decimal += (digit - '0') * Math.pow(8, power);
                power++;
            }



            // Decimal to Hexadecimal conversion
            String hexString = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit;

                if (remainder < 10) {
                    hexDigit = (char) (remainder + '0');
                } else {
                    hexDigit = (char) (remainder - 10 + 'A');
                }

                hexString = hexDigit + hexString;  // Prepend the hex digit
                decimal /= 16;
            }
          
            if(hexString.equals("")) hexString = "0"; //handle case for input 0.


            System.out.println("Hexadecimal equivalent: " + hexString);

        } catch (NumberFormatException e) {
            System.err.println("Invalid input: " + e.getMessage());
        }
    }
}




