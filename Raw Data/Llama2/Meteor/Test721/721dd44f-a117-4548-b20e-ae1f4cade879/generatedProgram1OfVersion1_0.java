import java.util.Scanner;

public class OctalToHexadecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an octal number: ");
        String octalString = input.nextLine();

        try {
            int decimal = Integer.parseInt(octalString, 8); // Convert octal string to decimal integer
            String hexadecimal = Integer.toHexString(decimal).toUpperCase(); // Convert decimal to hexadecimal string

            System.out.println("Equivalent hexadecimal number: " + hexadecimal);

        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number input.");
        }

        input.close(); // Close the scanner
    }
}
