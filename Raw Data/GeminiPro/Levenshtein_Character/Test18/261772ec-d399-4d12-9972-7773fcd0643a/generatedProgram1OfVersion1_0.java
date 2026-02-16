import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String binary = input.nextLine();

        try {
            long decimal = 0;
            int power = 0;
            for (int i = binary.length() - 1; i >= 0; i--) {
                if (binary.charAt(i) == '1') {
                    decimal += Math.pow(2, power);
                } else if (binary.charAt(i) != '0') {
                    System.out.println("Invalid binary number");
                    return;
                }
                power++;
            }

            String hex = "";
            long remainder;

            while (decimal > 0) {
                remainder = decimal % 16;
                if (remainder < 10) {
                    hex = remainder + hex;
                } else {
                    char hexChar = (char) ('A' + remainder - 10);
                    hex = hexChar + hex;
                }
                decimal /= 16;
            }
             if (hex.equals("")) {
                 hex= "0"; //handle the case of input 0
             }

            System.out.println("HexaDecimal value: '" + hex + "'");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
        input.close();
    }
}
