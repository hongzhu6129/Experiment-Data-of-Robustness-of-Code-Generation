import java.util.Scanner;

public class BinaryMultiplication {

    public static String multiplyBinary(String binary1, String binary2) {
        // Handle null or empty inputs
        if (binary1 == null || binary2 == null || binary1.isEmpty() || binary2.isEmpty()) {
            return "0"; 
        }

        // Validate binary strings (only 0s and 1s)
        if (!binary1.matches("[01]+") || !binary2.matches("[01]+")) {
            return "Invalid Input: Not binary strings";
        }

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int product = num1 * num2;

        return Integer.toBinaryString(product);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        String result = multiplyBinary(binary1, binary2);
        System.out.println("Product: " + result);

        scanner.close();
    }
}
