import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();

        try {
            // Validate input (octal digits only)
            for (char c : octal.toCharArray()) {
                if (c < '0' || c > '7') {
                    throw new IllegalArgumentException("Invalid octal number: " + octal);
                }
            }

            // Convert octal to decimal
            int decimal = 0;
            int power = 1;
            for (int i = octal.length() - 1; i >= 0; i--) {
                decimal += (octal.charAt(i) - '0') * power;
                power *= 8;
            }


            // Convert decimal to hexadecimal
            String hex = "";

            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit;
                if (remainder < 10) {
                    hexDigit = (char) ('0' + remainder);
                } else {
                    hexDigit = (char) ('A' + remainder - 10);
                }
                hex = hexDigit + hex;
                decimal /= 16;
            }


            if (hex.isEmpty()) {
                System.out.println("Hexadecimal equivalent: 0"); // Handle the case where octal is 0
            } else {
                System.out.println("Hexadecimal equivalent: " + hex);
            }



        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
