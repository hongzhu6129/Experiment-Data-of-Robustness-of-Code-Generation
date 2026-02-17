import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            int decimal = Integer.parseInt(binaryString, 2);
            String octalString = Integer.toOctalString(decimal);

            System.out.println("Octal number: " + octalString);

        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number input.");
        }
    }
}
