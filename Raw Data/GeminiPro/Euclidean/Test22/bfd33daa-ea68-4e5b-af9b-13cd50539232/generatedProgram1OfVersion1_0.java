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
                if (!Character.isDigit(digitChar) || (digitChar - '0' >= 8) ) {
                    throw new NumberFormatException("Invalid octal digit: " + digitChar);
                }
                int digit = digitChar - '0'; 
                decimal += digit * Math.pow(8, power);
                power++;

            }

            String hexString = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit;

                if (remainder < 10) {
                    hexDigit = (char) (remainder + '0');
                } else {
                    hexDigit = (char) (remainder - 10 + 'A');
                }


                hexString = hexDigit + hexString; //prepend as we are converting from right to left
                decimal /= 16;
            }


            if(hexString.equals("")) {  //Handle the case where the input is 0.
                System.out.println("Hexadecimal equivalent: 0");
            } else {
                System.out.println("Hexadecimal equivalent: " + hexString);

            }
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid octal number. " + e.getMessage());

        }
        scanner.close();

    }
}
