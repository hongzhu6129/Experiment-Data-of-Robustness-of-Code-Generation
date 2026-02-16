import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();

        try {
            long octalNum = Long.parseLong(octal, 8); // Parse octal string to long

            // Convert octal to decimal
            long decimal = 0;
            long power = 1;
            for (int i = octal.length() - 1; i >= 0; i--) {
                int digit = octal.charAt(i) - '0';
                if (digit < 0 || digit > 7) {  // Validate octal digits
                    throw new NumberFormatException("Invalid octal digit");
                }
                decimal += digit * power;
                power *= 8;
            }


            // Convert decimal to binary
            String binary = "";
            if (decimal == 0) {
                binary = "0"; // Handle the case where octal is 0
            } else {
                while (decimal > 0) {
                    binary = (decimal % 2) + binary;
                    decimal /= 2;
                }
            }
            System.out.println("Binary equivalent: " + binary);


        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}



