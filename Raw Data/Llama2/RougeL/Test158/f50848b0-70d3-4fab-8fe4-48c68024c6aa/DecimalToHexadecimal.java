import java.util.Scanner;

public class DecimalToHexadecimal {

    public static String function(int decimal) {
        StringBuilder hexadecimal = new StringBuilder();

        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexDigit;
            if (remainder < 10) {
                hexDigit = (char) (remainder + '0');
            } else {
                hexDigit = (char) (remainder - 10 + 'A');
            }
            hexadecimal.insert(0, hexDigit);
            decimal /= 16;
        }

        return hexadecimal.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();


        String hexadecimalNumber = function(decimalNumber);
        System.out.println("Hexadecimal equivalent: " + hexadecimalNumber);

        scanner.close();
    }
}
