import java.util.Scanner;

public class BinaryToHexadecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                char digit = binaryString.charAt(i);
                if (digit != '0' && digit != '1') {
                    System.out.println("Invalid binary number. Please enter a string containing only 0s and 1s.");
                    return; // Exit if not a valid binary string
                }
                if (digit == '1') {
                    decimal += Math.pow(2, power);
                }
                power++;
            }


            String hexString = "";
            while(decimal > 0){
                int remainder = decimal % 16;
                char hexDigit;

                if(remainder < 10){
                    hexDigit = (char)('0' + remainder);
                }else{
                    hexDigit = (char)('a' + remainder - 10);
                }

                hexString = hexDigit + hexString;
                decimal /= 16;

            }

            if (hexString.isEmpty()) { // Handle the case where the input is "0"
                hexString = "0";
            }

            System.out.println("Hexadecimal value: '" + hexString + "'");



        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid binary number.");
        }



    }
}
