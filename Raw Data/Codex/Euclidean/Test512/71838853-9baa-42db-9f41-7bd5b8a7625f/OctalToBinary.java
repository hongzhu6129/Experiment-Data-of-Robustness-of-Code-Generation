import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();

        try {
            int decimal = 0;
            int power = 0;
            for (int i = octal.length() - 1; i >= 0; i--) {
                int digit = octal.charAt(i) - '0';
                if (digit < 0 || digit > 7) {
                    System.out.println("Invalid octal number.");
                    return;
                }
                decimal += digit * Math.pow(8, power++);
            }

            String binary = "";
            if (decimal == 0) {
                binary = "0"; // Handle the case of octal 0
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
