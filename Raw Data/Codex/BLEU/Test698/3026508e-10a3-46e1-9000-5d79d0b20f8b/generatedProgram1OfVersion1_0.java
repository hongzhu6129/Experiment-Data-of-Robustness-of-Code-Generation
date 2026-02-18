import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();

        try {
            int decimal = 0;
            int power = 0;

            // Octal to Decimal Conversion
            for (int i = octal.length() - 1; i >= 0; i--) {
                int digit = octal.charAt(i) - '0';
                if (digit < 0 || digit > 7) {
                    throw new NumberFormatException("Invalid octal digit: " + octal.charAt(i));
                }
                decimal += digit * Math.pow(8, power);
                power++;
            }


            // Decimal to Hexadecimal Conversion
            String hex = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
                hex = hexDigit + hex;
                decimal /= 16;

            }

            //Handle case where input is 0
            if(hex.isEmpty()){
                hex = "0";
            }

            System.out.println("Hexadecimal equivalent: " + hex);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
