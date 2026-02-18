import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;

            // Convert binary to decimal
            for (int i = binary.length() - 1; i >= 0; i--) {
                if (binary.charAt(i) == '1') {
                    decimal += Math.pow(2, power);
                } else if (binary.charAt(i) != '0') {
                    System.out.println("Invalid binary input.");
                    return; // Exit if not a valid binary digit
                }
                power++;
            }

            // Convert decimal to hexadecimal
            String hex = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit;

                if (remainder < 10) {
                    hexDigit = (char) (remainder + 48); // Convert to ASCII for 0-9
                } else {
                    hexDigit = (char) (remainder + 87); // Convert to ASCII for a-f
                }

                hex = hexDigit + hex;  // Prepend the digit (reverse order)
                decimal /= 16;
            }


            if (hex.isEmpty()) { // Handle case where input is "0"
                System.out.println("Hexadecimal value: '0'");
            } else {
                System.out.println("Hexadecimal value: '" + hex + "'");
            }

        } catch (NumberFormatException e) {  // If the string isn't parseable as an integer
            System.out.println("Invalid binary input.");
        }



    }
}
