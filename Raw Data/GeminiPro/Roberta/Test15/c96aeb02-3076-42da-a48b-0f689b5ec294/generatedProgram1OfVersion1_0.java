import java.util.Scanner;

public class DecimalToHexadecimal {

    public static String function(int decimal) {
        StringBuilder hexadecimal = new StringBuilder();

        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 16;

            if (remainder < 10) {
                hexadecimal.insert(0, remainder);
            } else {
                char hexChar = (char) ('A' + remainder - 10);
                hexadecimal.insert(0, hexChar);
            }

            decimal /= 16;
        }

        return hexadecimal.toString();
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
