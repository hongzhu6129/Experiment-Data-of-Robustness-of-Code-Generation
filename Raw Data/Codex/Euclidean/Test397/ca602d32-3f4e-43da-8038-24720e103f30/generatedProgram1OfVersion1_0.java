import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();

        // Handle invalid input (non-binary characters)
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                System.out.println("Invalid binary input.");
                return;
            }
        }


        long decimal = 0;
        int power = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }


        String hexString = "";

        while (decimal > 0) {
            long remainder = decimal % 16;
            char hexDigit;
            if (remainder < 10) {
                hexDigit = (char) (remainder + '0'); // Convert to ASCII
            } else {
                hexDigit = (char) (remainder - 10 + 'a'); // Convert to a-f
            }
            hexString = hexDigit + hexString; // Prepend to build the string
            decimal /= 16;
        }
         //Handle empty string which represents 0
        if (hexString.isEmpty()) {
            hexString = "0";
        }


        System.out.println("Hexadecimal value: '" + hexString + "'");


    }
}

