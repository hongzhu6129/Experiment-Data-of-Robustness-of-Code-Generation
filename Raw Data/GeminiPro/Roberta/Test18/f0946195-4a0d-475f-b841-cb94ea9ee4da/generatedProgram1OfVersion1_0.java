import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                char digit = binaryString.charAt(i);
                if (digit == '1') {
                    decimal += Math.pow(2, power);
                } else if (digit != '0') {
                    System.out.println("Invalid binary input.");
                    return;
                }
                power++;
            }

            char hexDigit;
            if (decimal < 10) {
                hexDigit = (char) (decimal + '0');
            } else {
                hexDigit = (char) (decimal - 10 + 'a');
            }

            System.out.println("Hexadecimal value: '" + hexDigit + "'");


        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input.");
        }

    }
}
