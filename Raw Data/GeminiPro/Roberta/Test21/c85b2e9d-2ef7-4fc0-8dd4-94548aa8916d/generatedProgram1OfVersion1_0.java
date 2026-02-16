import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            long octal = Long.parseLong(octalString, 8); // Parse octal string

            // Corner case: Handle negative octal numbers
            boolean isNegative = false;
            if (octalString.startsWith("-")) {
                isNegative = true;
                octal = -octal; // Make it positive for conversion
            }


            String binaryString = "";
            if (octal == 0) {
                binaryString = "0"; // Handle octal 0
            } else {
                while (octal > 0) {
                    int remainder = (int) (octal % 2);
                    binaryString = remainder + binaryString;
                    octal /= 2;
                }
            }


            if (isNegative) {
                // Two's complement for negative binary (not strictly required for this problem, 
                // but adds robustness for a more general octal-to-binary converter)
                String twosComplement = "";

                // 1. Invert bits
                for(char bit : binaryString.toCharArray()) {
                  twosComplement += (bit == '0') ? '1' : '0';
                }
                // 2. Add 1
                int carry = 1;
                String temp = "";

                for (int i = twosComplement.length() - 1; i >= 0; i--) {
                    int sum = (twosComplement.charAt(i) - '0') + carry;
                    temp = (sum % 2) + temp;
                    carry = sum / 2;
                }

                binaryString = (carry > 0 ? carry : "") + temp;
                System.out.println("Binary equivalent (two's complement): " + binaryString);

            } else {
                System.out.println("Binary equivalent: " + binaryString);
            }



        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number.");
        }
        scanner.close();
    }
}
