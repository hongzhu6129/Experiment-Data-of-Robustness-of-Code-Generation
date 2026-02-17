import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.err.println("Input a decimal number as a command-line argument.");
            return; 
        }

        try {
            int decimal = Integer.parseInt(args[0]);
            String hexadecimal = Integer.toHexString(decimal);
            System.out.println("Hexadecimal number is : " + hexadecimal.toUpperCase());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid decimal number.");
        }
    }
}
