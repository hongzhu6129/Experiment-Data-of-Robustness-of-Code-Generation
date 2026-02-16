import java.util.Scanner;

public class BinaryMultiplication {

    public static String multiplyBinary(String binary1, String binary2) {
        int num1 = binaryToDecimal(binary1);
        int num2 = binaryToDecimal(binary2);
        int product = num1 * num2;
        return decimalToBinary(product);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();
        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        try {
            String product = multiplyBinary(binary1, binary2);
            System.out.println("Product: " + product);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter valid binary numbers (0s and 1s).");
        }
       scanner.close();

    }
}
