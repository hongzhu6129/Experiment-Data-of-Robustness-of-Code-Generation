import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            int decimal = Integer.parseInt(binaryString, 2);
            System.out.println("Decimal number: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number input.");
        }

        scanner.close();
    }
}
