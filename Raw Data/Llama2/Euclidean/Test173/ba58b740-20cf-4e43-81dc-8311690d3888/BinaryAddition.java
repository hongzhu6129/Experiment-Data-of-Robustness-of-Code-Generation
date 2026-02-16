import java.util.Scanner;

public class BinaryAddition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();


        int integer1 = Integer.parseInt(binary1, 2);
        int integer2 = Integer.parseInt(binary2, 2);

        int sum = integer1 + integer2;

        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers: " + binarySum);
        scanner.close();


    }
}
