import java.util.Scanner;

public class DecimalToHexadecimal {

    public static String function(int decimal) {
        String hex = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 16;
            hex = hexChars[remainder] + hex;  // Prepend the hex character
            decimal /= 16;
        }

        return hex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String hexadecimal = function(decimal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);
        scanner.close();


    }
}
