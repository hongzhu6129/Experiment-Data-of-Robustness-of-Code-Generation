import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            // Validate octal input (contains only digits 0-7)
            for (char c : octalString.toCharArray()) {
                if (c < '0' || c > '7') {
                    System.out.println("Invalid octal number: Contains characters other than 0-7");
                    return; // Exit if invalid input
                }
            }


            int decimal = 0;
            int power = 0;

            // Octal to decimal conversion
            for (int i = octalString.length() - 1; i >= 0; i--) {
                int digit = octalString.charAt(i) - '0';
                decimal += digit * Math.pow(8, power);
                power++;
            }



            // Decimal to hexadecimal conversion
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

            // Handle case where input is 0
            if(hexString.isEmpty()) {
                hexString = "0";
            }

            System.out.println("Hexadecimal equivalent: " + hexString);


        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number format.");
        }

    }
}
