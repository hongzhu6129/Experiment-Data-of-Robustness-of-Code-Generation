import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryStr = input.nextLine();

        // Handle invalid input (non-binary characters)
        try {
            Long.parseLong(binaryStr, 2); 
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input.");
            return;
        }

        int decimal = 0;
        int power = 0;
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            if (binaryStr.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        String hex = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexDigit;
            if (remainder < 10) {
                hexDigit = (char) (remainder + '0'); // Convert 0-9 to char
            } else {
                hexDigit = (char) (remainder - 10 + 'a'); // Convert 10-15 to a-f
            }
            hex = hexDigit + hex; // Prepend the digit for correct order
            decimal /= 16;
        }

        if (hex.isEmpty()) { // Handle the case where the input is 0
            hex = "0";
        }

        System.out.println("Hexadecimal value: '" + hex + "'");
        input.close();
    }
}

