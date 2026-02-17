import java.util.Scanner;

public class HexToDecimal {

    public static int hex_to_decimal(String hex) {
        int decimal = 0;
        int power = 0;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char digit = hex.charAt(i);

            if (digit >= '0' && digit <= '9') {
                decimal += (digit - '0') * Math.pow(16, power);
            } else if (digit >= 'A' && digit <= 'F') {
                decimal += (digit - 'A' + 10) * Math.pow(16, power);
            } else if (digit >= 'a' && digit <= 'f') {
                decimal += (digit - 'a' + 10) * Math.pow(16, power);
            } else {
                // Handle invalid input (optional)  e.g., throw an exception
                System.err.println("Invalid hexadecimal digit: " + digit);
                return -1; // Or another error indicator
            }

            power++;
        }
        return decimal;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hex = input.nextLine();

        int decimal = hex_to_decimal(hex);
        if (decimal != -1) { // Check for errors from hex_to_decimal
            System.out.println("Equivalent decimal number is: " + decimal);
        } 
        input.close();
    }
}
