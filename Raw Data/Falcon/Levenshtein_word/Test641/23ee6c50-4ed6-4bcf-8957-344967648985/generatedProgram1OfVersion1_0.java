import java.util.Scanner;

public class BinaryToHexadecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;
            for (int i = binary.length() - 1; i >= 0; i--) {
                char digit = binary.charAt(i);
                if (digit == '1') {
                    decimal += Math.pow(2, power);
                } else if (digit != '0') {
                    System.out.println("Invalid binary number: " + binary);
                    return; // Exit if input is not a valid binary string
                }
                power++;
            }

            String hex = "";
            while (decimal > 0) {
                int rem = decimal % 16;
                if (rem < 10) {
                    hex = rem + hex;
                } else {
                    char hexChar = (char) ('a' + rem - 10);
                    hex = hexChar + hex;
                }
                decimal /= 16;
            }


            if(hex.isEmpty()){ //Handle case where input is 0
                System.out.println("Hexadecimal value: 0");
            } else {
                System.out.println("Hexadecimal value: " + hex);
            }


        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid binary number.");
        }

        input.close(); // Close the scanner
    }
}


