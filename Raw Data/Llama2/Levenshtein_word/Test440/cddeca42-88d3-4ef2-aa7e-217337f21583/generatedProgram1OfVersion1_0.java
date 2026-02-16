import java.util.Scanner;

public class HexToOctal {

    public static int hex_to_oct(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        return Integer.parseInt(Integer.toOctalString(decimal));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hexNumber = input.nextLine();

        try {
            int octalNumber = hex_to_oct(hexNumber);
            System.out.println("Equivalent of octal number is: " + octalNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal input.");
        }
        input.close();
    }
}
