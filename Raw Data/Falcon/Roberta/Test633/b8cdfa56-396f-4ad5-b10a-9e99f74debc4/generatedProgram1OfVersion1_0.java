import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryStr = input.nextLine();

        try {
            long binary = Long.parseLong(binaryStr);
            if (!binaryStr.matches("[01]+")) {  // Validate input: only 0s and 1s
                System.out.println("Invalid binary input.  Only 0 and 1 are allowed.");
                return;
            }



            long decimal = 0;
            int power = 0;
            while (binary != 0) {
                long lastDigit = binary % 10;
                decimal += lastDigit * Math.pow(2, power);
                power++;
                binary /= 10;
            }


            String hex = "";
            while (decimal != 0) {
                long remainder = decimal % 16;
                char hexDigit;
                if (remainder < 10) {
                    hexDigit = (char) (remainder + '0');
                } else {
                    hexDigit = (char) (remainder - 10 + 'a');
                }
                hex = hexDigit + hex;
                decimal /= 16;
            }

            if(hex.isEmpty()){ //Handle the case where the input is 0
                System.out.println("Hexadecimal value: '0'");
            } else {
                System.out.println("Hexadecimal value: '" + hex + "'");
            }



        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid binary number.");
        }


    }
}
