import java.util.Scanner;

public class BinaryMultiplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        String binary1 = input.nextLine();

        System.out.print("Input the second binary number: ");
        String binary2 = input.nextLine();

        int num1 = Integer.parseInt(binary1, 2); // Convert binary string to integer
        int num2 = Integer.parseInt(binary2, 2);

        int product = binaryproduct(num1, num2);

        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(product));
        input.close();
    }

    static int binaryproduct(int a, int b) {
        return a * b;
    }
}
