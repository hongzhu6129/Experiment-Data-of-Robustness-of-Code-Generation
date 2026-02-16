import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;
            for (int i = binary.length() - 1; i >= 0; i--) {
                if (binary.charAt(i) == '1') {
                    decimal += Math.pow(2, power);
                } else if (binary.charAt(i) != '0') {
                    System.out.println("Invalid binary number.");
                    return;
                }
                power++;
            }

            String hex = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                if (remainder < 10) {
                    hex = remainder + hex;
                } else {
                    char hexChar = (char) ('a' + remainder - 10); // Convert to hex characters
                    hex = hexChar + hex;
                }
                decimal /= 16;
            }


            if(hex.equals("")) {  // Handle the case where input is 0
                 System.out.println("Hexadecimal value: '0'");
            } else {
                 System.out.println("Hexadecimal value: '" + hex + "'");
            }


        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }

        input.close(); // Close scanner
    }
}
