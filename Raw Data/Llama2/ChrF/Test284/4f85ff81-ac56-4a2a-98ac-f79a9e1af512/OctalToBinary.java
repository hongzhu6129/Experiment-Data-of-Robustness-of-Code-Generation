import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            // Validate input (only digits 0-7 allowed) and handle corner cases:
            if (octalString.isEmpty()) {
                System.out.println("Input cannot be empty.");
                return;
            }

            for (char c : octalString.toCharArray()) {
                if (c < '0' || c > '7') {
                    System.out.println("Invalid octal number.  Digits must be between 0 and 7.");
                    return;
                }
            }


            long octal = Long.parseLong(octalString); // Use long for larger octal numbers
            String binary = "";

            if (octal == 0) { // Corner case: Octal 0
                binary = "0";
            } else {
                while (octal != 0) {
                    int remainder = (int) (octal % 10);  // Get last digit

                    String binaryDigit = ""; // Binary equivalent of the octal digit
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

                    binary = binaryDigit + binary; // Prepend the binary equivalent
                    octal /= 10; // Remove the last digit
                }
            }


            System.out.println("Binary equivalent: " + binary);

        } catch (NumberFormatException e) {  // Catch potential overflow issues
            System.out.println("The octal number is too large to handle.");
        }

    }
}
