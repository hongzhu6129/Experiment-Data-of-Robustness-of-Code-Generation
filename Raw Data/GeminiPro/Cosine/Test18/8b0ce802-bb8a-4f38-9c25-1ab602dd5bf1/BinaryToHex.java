import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();

        // Handle invalid input (empty string)
        if (binaryString.isEmpty()) {
            System.out.println("Invalid input: Empty string.");
            return;
        }

        // Handle invalid input (non-binary characters)
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                System.out.println("Invalid input: Non-binary characters.");
                return;
            }
        }

        int decimal = 0;
        int power = 0;


        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        String hexString = "";

        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexString = remainder + hexString;
            } else {
                char hexChar = (char) ('a' + remainder - 10);
                hexString = hexChar + hexString;
            }
            decimal /= 16;
        }

        // Handle the case where the input is "0"
        if (hexString.isEmpty()) {
            hexString = "0";
        }

        System.out.println("Hexadecimal value: '" + hexString + "'");
        input.close();
    }
}
