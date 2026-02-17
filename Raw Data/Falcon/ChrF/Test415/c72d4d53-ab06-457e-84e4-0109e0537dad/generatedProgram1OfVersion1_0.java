import java.util.Scanner;

public class BinaryMultiplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        String binary1 = input.next();

        System.out.print("Input the second binary number: ");
        String binary2 = input.next();

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        int product = binaryproduct(decimal1, decimal2);

        String binaryProduct = Integer.toBinaryString(product);

        System.out.println("Product of two binary numbers: " + binaryProduct);
        input.close();


    }

    static int binaryproduct(int a, int b) {
        return a * b;
    }
}
