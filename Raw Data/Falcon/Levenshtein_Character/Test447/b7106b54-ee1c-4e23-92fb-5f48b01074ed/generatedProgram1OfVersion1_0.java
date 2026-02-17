import java.util.Scanner;

public class AddBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the integers
        int sum = num1 + num2;

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers: " + binarySum);

        scanner.close(); 
    }
}
