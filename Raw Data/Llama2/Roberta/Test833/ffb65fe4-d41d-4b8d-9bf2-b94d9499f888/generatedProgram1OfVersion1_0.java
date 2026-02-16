import java.util.Scanner;

public class BinaryToHexadecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();

        // Handle invalid input (non-binary characters)
        try {
            int decimal = 0;
            int power = 0;
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                char digit = binaryString.charAt(i);
                if (digit != '0' && digit != '1') {
                    System.out.println("Invalid binary input.");
                    return; 
                }
                if (digit == '1') {
                    decimal += Math.pow(2, power);
                }
                power++;
            }

            String hexString = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit;
                if (remainder < 10) {
                    hexDigit = (char) (remainder + '0');
                } else {
                    hexDigit = (char) (remainder - 10 + 'a');
                }
                hexString = hexDigit + hexString;  // Prepend the digit
                decimal /= 16;
            }

            // Handle the case where input is "0"
            if (hexString.isEmpty()) {
                hexString = "0";
            }

            System.out.println("Hexadecimal value: '" + hexString + "'");


        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input.");
        }
    }
}
