import java.util.Scanner;

public class BinaryToHexadecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input one binary number: ");
        String binary = input.nextLine();

        // Handle invalid input (non-binary characters)
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1') {
                System.out.println("Invalid binary input.");
                return;
            }
        }


        int decimal = 0;
        int power = 0;

        // Convert binary to decimal
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        // Convert decimal to hexadecimal
        String hex = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hex = remainder + hex;
            } else {
                char hexChar = (char) ('a' + remainder - 10);
                hex = hexChar + hex;
            }
            decimal /= 16;
        }


        // Handle the case of input "0"
        if (hex.isEmpty() && binary.equals("0")) {
            System.out.println("Hexadecimal value: '0'");
        } else if (hex.isEmpty()){  // Handle empty input
            System.out.println("Invalid binary input.");
        }
        else {
            System.out.println("Hexadecimal value: '" + hex + "'");
        }


        input.close();
    }
}
