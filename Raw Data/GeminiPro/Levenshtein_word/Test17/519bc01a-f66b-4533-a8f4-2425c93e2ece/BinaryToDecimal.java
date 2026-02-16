import java.util.Scanner;

public class BinaryToDecimal {

    public static int functionone(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            } else if (binary.charAt(i) != '0') { // Handle invalid input (non-binary digits)
                return -1; // Indicate an error
            }
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = scanner.nextLine();

        int decimal = functionone(binary);

        if (decimal != -1) {
            System.out.println("Decimal number: " + decimal);
        } else {
            System.out.println("Invalid binary number. Please enter a valid binary string (containing only 0s and 1s).");
        }
        scanner.close(); 
    }
}
