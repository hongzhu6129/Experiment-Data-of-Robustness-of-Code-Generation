import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();

        try {
            long decimal = 0;
            long power = 1;

            // Octal to Decimal conversion
            for (int i = octal.length() - 1; i >= 0; i--) {
                int digit = octal.charAt(i) - '0';
                if (digit < 0 || digit > 7) {
                    System.out.println("Invalid octal number.");
                    return;
                }
                decimal += digit * power;
                power *= 8;
            }

            // Decimal to Binary conversion
            String binary = "";
            if (decimal == 0) {
                binary = "0"; 
            } else {
                while (decimal > 0) {
                    binary = (decimal % 2) + binary;
                    decimal /= 2;
                }
            }


            System.out.println("Binary equivalent: " + binary);


        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid octal number.");
        }
    }
}
