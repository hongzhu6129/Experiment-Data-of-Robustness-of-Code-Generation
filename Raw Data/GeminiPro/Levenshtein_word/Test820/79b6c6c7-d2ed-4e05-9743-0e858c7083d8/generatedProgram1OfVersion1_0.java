import java.util.Scanner;

public class HexToOctal {

    public static int hex_to_oct(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        return Integer.parseInt(Integer.toOctalString(decimal));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hex = input.nextLine();
        int octal = hex_to_oct(hex);
        System.out.println("Equivalent of octal number is: " + octal);
        input.close(); 
    }
}
