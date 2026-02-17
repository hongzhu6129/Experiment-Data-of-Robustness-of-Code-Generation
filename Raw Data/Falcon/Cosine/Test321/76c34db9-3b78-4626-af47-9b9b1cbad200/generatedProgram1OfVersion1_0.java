import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            // Corner Case 1: Empty String
            if (octalString.isEmpty()) {
                System.out.println("Invalid input: Empty string.");
                return;
            }

            // Corner Case 2: Non-octal characters
            for (char c : octalString.toCharArray()) {
                if (c < '0' || c > '7') {
                    System.out.println("Invalid input: Non-octal character detected.");
                    return;
                }
            }



            int octal = Integer.parseInt(octalString, 8);  // Parse octal string

            // Corner Case 3: Octal number too large for int
            if (octal < 0) { // Check for overflow (parseInt doesn't throw an exception)
                System.out.println("Invalid input: Octal number too large.");
                return;
            }


            String binary = "";
            int temp = octal;

            // Core logic: Conversion
            while (temp > 0) {
                int remainder = temp % 2;
                binary = remainder + binary; // Prepend to build binary string
                temp /= 2;
            }

            // Corner Case 4: Octal number is 0
            if (binary.isEmpty()) { // Handle the case where octal is 0
                binary = "0";
            }

            System.out.println("Binary equivalent: " + binary);

        } catch (NumberFormatException e) { // Catches issues if the number is truly too large for integer parsing
            System.out.println("Invalid input: " + e.getMessage()); //More informative error message.
        }

        scanner.close();

    }
}
