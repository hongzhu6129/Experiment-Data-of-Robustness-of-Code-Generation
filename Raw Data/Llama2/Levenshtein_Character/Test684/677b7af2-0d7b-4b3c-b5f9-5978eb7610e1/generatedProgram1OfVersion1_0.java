import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            // Corner case 1: Empty string
            if (octalString.isEmpty()) {
                System.out.println("Invalid octal number: Empty string");
                return;
            }


            // Corner case 2 & general octal validation: Check for invalid digits
            for (char c : octalString.toCharArray()) {
                if (c < '0' || c > '7') {
                    System.out.println("Invalid octal number: Contains non-octal digits");
                    return;
                }
            }

            // Corner case 3: Leading zeros (Handled automatically by parseInt)
            int decimal = Integer.parseInt(octalString, 8);


            // Corner case 4: Zero
            if (decimal == 0) {
                System.out.println("Hexadecimal equivalent: 0");
                return;
            }



            String hexString = Integer.toHexString(decimal).toUpperCase();

            System.out.println("Hexadecimal equivalent: " + hexString);


        } catch (NumberFormatException e) {
            // Corner case 5: Octal number too large for integer representation.
            System.out.println("Invalid octal number: Too large");


        }

    }
}
