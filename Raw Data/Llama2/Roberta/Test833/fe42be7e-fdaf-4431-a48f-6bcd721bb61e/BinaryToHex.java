import java.util.Scanner;

public class BinaryToHex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            int decimal = 0;
            int power = 0;
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                char bit = binaryString.charAt(i);
                if (bit != '0' && bit != '1') {
                    throw new IllegalArgumentException("Invalid binary input: " + binaryString); 
                }
                if (bit == '1') {
                    decimal += Math.pow(2, power);
                }
                power++;
            }

            String hexString = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit;
                if (remainder < 10) {
                    hexDigit = (char) (remainder + '0');
                } else {
                    hexDigit = (char) (remainder - 10 + 'a');
                }
                hexString = hexDigit + hexString;
                decimal /= 16;
            }

            if (hexString.isEmpty()) { // Handle the case of input "0"
                System.out.println("Hexadecimal value: '0'");
            } else {
                System.out.println("Hexadecimal value: '" + hexString + "'");
            }

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}


