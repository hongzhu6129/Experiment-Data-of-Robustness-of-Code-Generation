import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryStr = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;
            for (int i = binaryStr.length() - 1; i >= 0; i--) {
                char digit = binaryStr.charAt(i);
                if (digit == '1') {
                    decimal += Math.pow(2, power);
                } else if (digit != '0') {
                    System.out.println("Invalid binary input.");
                    return; // Exit if not a valid binary digit
                }
                power++;
            }

            String hexStr = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit;
                if (remainder < 10) {
                    hexDigit = (char) (remainder + '0');
                } else {
                    hexDigit = (char) (remainder - 10 + 'a');
                }
                hexStr = hexDigit + hexStr;
                decimal /= 16;
            }

            if (hexStr.isEmpty()) { // Handle the case where input is 0
                System.out.println("Hexadecimal value: '0'");
            } else {
                System.out.println("Hexadecimal value: '" + hexStr + "'");
            }

        } catch (NumberFormatException e) { // Handle potential NumberFormatException
            System.out.println("Invalid binary input.");
        }
    }
}
