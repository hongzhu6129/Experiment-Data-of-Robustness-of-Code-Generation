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
                int rem = decimal % 16;
                if (rem < 10) {
                    hex = rem + hex;
                } else {
                    char hexChar = (char) ('a' + rem - 10); // Convert to a-f
                    hex = hexChar + hex;
                }
                decimal /= 16;
            }

            if(hex.isEmpty()){
                System.out.println("Hexadecimal value: '0'");
            } else{
                System.out.println("Hexadecimal value: '" + hex + "'");
            }
           

        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }

        input.close();
    }
}
