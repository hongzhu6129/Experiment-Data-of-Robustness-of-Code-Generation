import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            // Validate input (octal digits only)
            for (char c : octalString.toCharArray()) {
                if (c < '0' || c > '7') {
                    throw new IllegalArgumentException("Invalid octal number: " + octalString);
                }
            }

            // Convert octal to decimal
            int decimal = 0;
            int power = 0;
            for (int i = octalString.length() - 1; i >= 0; i--) {
                int digit = octalString.charAt(i) - '0';
                decimal += digit * Math.pow(8, power);
                power++;
            }

            // Convert decimal to hexadecimal
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
            if(hexString.equals("")){
                hexString = "0"; // handle the case of input 0
            }

            System.out.println("Hexadecimal equivalent: " + hexString);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }


    }
}

