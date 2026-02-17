import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();

        try {
            int decimal = 0;
            int power = 0;
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                if (binaryString.charAt(i) == '1') {
                    decimal += Math.pow(2, power);
                } else if (binaryString.charAt(i) != '0') {
                    System.out.println("Invalid binary input.");
                    return;
                }
                power++;
            }

            String hexString = Integer.toHexString(decimal);
            System.out.println("Hexadecimal value: '" + hexString + "'");


        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input.");
        }

        input.close();
    }
}
