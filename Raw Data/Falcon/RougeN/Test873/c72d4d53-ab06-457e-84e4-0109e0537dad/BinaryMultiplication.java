import java.util.Scanner;

public class BinaryMultiplication {

    public static String multiplyBinary(String binary1, String binary2) {
        try {
            int decimal1 = Integer.parseInt(binary1, 2);
            int decimal2 = Integer.parseInt(binary2, 2);
            int product = decimal1 * decimal2;
            return Integer.toBinaryString(product);
        } catch (NumberFormatException e) {
            return "Invalid binary input"; // Handle non-binary input
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        String binary1 = scanner.nextLine();
        System.out.print("Input the second binary number: ");
        String binary2 = scanner.nextLine();

        String product = multiplyBinary(binary1, binary2);
        System.out.println("Product of two binary numbers: " + product);
        scanner.close();
    }
}
