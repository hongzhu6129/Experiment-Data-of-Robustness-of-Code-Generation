import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String binaryString = input.nextLine();

        try {
            int decimal = Integer.parseInt(binaryString, 2);
            String octal = Integer.toOctalString(decimal);
            System.out.println("Octal number: " + octal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input.");
        }
    }
}
