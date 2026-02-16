import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = input.nextLine();

        // Handle invalid input (non-binary characters)
        try {
            Long.parseLong(binary, 2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input.");
            return;
        }


        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        String hex = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hex = remainder + hex;
            } else {
                hex = (char) (remainder + 87) + hex; // a=97, b=98...
            }
            decimal /= 16;
        }

        if (hex.isEmpty()) { //handle the case of input "0"
            System.out.println("Hexadecimal value: '0'");
        } else {
            System.out.println("Hexadecimal value: '" + hex + "'");
        }
        input.close();
    }
}
