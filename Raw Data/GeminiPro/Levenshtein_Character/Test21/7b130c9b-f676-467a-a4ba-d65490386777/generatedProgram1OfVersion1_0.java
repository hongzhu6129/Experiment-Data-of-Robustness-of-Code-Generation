import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            // Validate input (only digits 0-7 allowed)
            for (char c : octalString.toCharArray()) {
                if (c < '0' || c > '7') {
                    throw new IllegalArgumentException("Invalid octal number.  Only digits 0-7 are allowed.");
                }
            }

            long octal = Long.parseLong(octalString); // Could throw NumberFormatException if input is too large


            String binary = "";

            if (octal == 0) { // Handle the case where octal is 0
                binary = "0";
            } else {
                while (octal > 0) {
                    int remainder = (int) (octal % 10);  // Get last digit
                    String binaryDigit = "";

                    // Convert octal digit to binary (3 bits)
                    switch (remainder) {
                        case 0: binaryDigit = "000"; break;
                        case 1: binaryDigit = "001"; break;
                        case 2: binaryDigit = "010"; break;
                        case 3: binaryDigit = "011"; break;
                        case 4: binaryDigit = "100"; break;
                        case 5: binaryDigit = "101"; break;
                        case 6: binaryDigit = "110"; break;
                        case 7: binaryDigit = "111"; break;

                    }

                    binary = binaryDigit + binary; // Prepend binary digits
                    octal /= 10;                  // Remove last digit
                }

                // Handle the case where octal is 0
            }
                


            System.out.println("Binary equivalent: " + binary);


        } catch (NumberFormatException e) {
            System.out.println("Error: Input is too large to be parsed as a long.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
