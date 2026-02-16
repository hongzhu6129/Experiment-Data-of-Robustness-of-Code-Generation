import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;

            // Convert binary to decimal
            for (int i = binary.length() - 1; i >= 0; i--) {
                if (binary.charAt(i) == '1') {
                    decimal += Math.pow(2, power);
                } else if (binary.charAt(i) != '0') {
                    System.out.println("Invalid binary input. Please enter a string of 0s and 1s.");
                    return; // Exit if input is invalid
                }
                power++;
            }


            String hex = "";

            // Convert decimal to hexadecimal
            while(decimal > 0) {
                int rem = decimal % 16;
                if (rem < 10) {
                    hex = rem + hex; //prepend the remainder as character
                } else {
                    hex = (char)('a' + rem - 10) + hex;  // a=10, b=11 etc.
                }
                decimal /= 16;
            }

            if (hex.isEmpty()) {  // Handle the case where the input is "0"
                hex = "0";
            }

            System.out.println("Hexadecimal value: '" + hex + "'");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid binary number.");
        }
        input.close();
    }
}
