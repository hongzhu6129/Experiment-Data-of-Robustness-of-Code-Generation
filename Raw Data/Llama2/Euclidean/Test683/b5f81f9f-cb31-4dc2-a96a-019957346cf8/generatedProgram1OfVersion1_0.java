import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = input.nextLine();

        try {
            // Octal to Decimal
            int decimal = 0;
            int power = 0;
            for (int i = octalString.length() - 1; i >= 0; i--) {
                int digit = octalString.charAt(i) - '0';
                if (digit < 0 || digit > 7) {
                    System.out.println("Invalid octal number.");
                    return;
                }
                decimal += digit * Math.pow(8, power++);
            }


            // Decimal to Hexadecimal
            String hexString = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit;
                if (remainder < 10) {
                    hexDigit = (char) (remainder + '0');
                } else {
                    hexDigit = (char) (remainder - 10 + 'A');
                }
                hexString = hexDigit + hexString;
                decimal /= 16;

            }
          if(hexString.equals("")) { // Handle the case where input is 0
              System.out.println("Hexadecimal equivalent: 0");
          } else {
              System.out.println("Hexadecimal equivalent: " + hexString);
          }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid octal number.");
        }
        input.close();

    }
}

