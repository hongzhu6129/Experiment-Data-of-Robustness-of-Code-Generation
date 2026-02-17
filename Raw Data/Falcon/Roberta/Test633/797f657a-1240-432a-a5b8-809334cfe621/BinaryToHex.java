import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;

            // Convert binary to decimal
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                char digit = binaryString.charAt(i);
                if (digit == '1') {
                    decimal += Math.pow(2, power);
                } else if (digit != '0') {
                    System.out.println("Invalid binary number.");
                    return;
                }
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
                    hexDigit = (char) (remainder - 10 + 'a');
                }
                hexString = hexDigit + hexString;
                decimal /= 16;

            }



            if(hexString.isEmpty()){ // Handle the case of input "0"
                System.out.println("Hexadecimal value: '0'");
            } else {
                System.out.println("Hexadecimal value: '" + hexString + "'");
            }


        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a binary number.");
        }


    }
}




