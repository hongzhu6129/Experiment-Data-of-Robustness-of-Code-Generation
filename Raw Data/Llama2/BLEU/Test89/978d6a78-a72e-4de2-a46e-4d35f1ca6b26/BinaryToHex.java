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
                    System.out.println("Invalid binary number."); // Handle invalid input
                    return; 
                }
                power++;
            }

            // Convert decimal to hexadecimal
            String hex = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
                hex = hexDigit + hex;
                decimal /= 16;
            }
            if (hex.equals("")) { // Handle case where input is 0
                System.out.println("Hexadecimal equivalent: 0");
            } else {
                System.out.println("Hexadecimal equivalent: " + hex);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input."); // Handle any potential exceptions
        }
    }
}


