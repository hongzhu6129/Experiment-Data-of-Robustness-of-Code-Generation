import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = input.nextLine();

        // Handle empty input
        if (binary.isEmpty()) {
            System.out.println("Hexadecimal value: '0'");
            return;
        }


        // Validate input (only 0s and 1s) and handle leading zeros efficiently.
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1') {
                System.out.println("Invalid binary input.");
                return;
            }
        }


        long decimal = 0;
        int power = 0;


        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        String hex = "";

        while (decimal > 0) {
            long remainder = decimal % 16;
            if (remainder < 10) {
                hex = remainder + hex; //prepend the remainder
            } else {
                char hexChar = (char) ('a' + (remainder - 10));
                hex = hexChar + hex; //prepend the hex char
            }
            decimal /= 16;
        }
        
        if(hex.isEmpty()){ //Handle the case where the input is 0.
            System.out.println("Hexadecimal value: '0'");
        } else {
             System.out.println("Hexadecimal value: '" + hex + "'");
        }
       
        input.close();
    }
}
