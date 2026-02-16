import java.util.Scanner;

public class AddBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binary1 = input.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = input.nextLine();

        int integer1 = Integer.parseInt(binary1, 2); // Convert binary string to integer
        int integer2 = Integer.parseInt(binary2, 2);

        int sum = integer1 + integer2;

        String binarySum = Integer.toBinaryString(sum); // Convert integer sum back to binary string

        System.out.println("Sum of two binary numbers: " + binarySum);

        input.close(); 
    }
}
