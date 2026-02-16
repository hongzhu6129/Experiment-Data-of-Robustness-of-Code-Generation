import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Error Handling for invalid input (non-binary characters)
        try {
            Long.parseLong(binaryString, 2); 
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number. Please enter a valid binary string (0s and 1s).");
            return; // Exit if input is invalid.
        }


        long decimal = 0;
        long power = 1;

        // Convert binary to decimal
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += power;
            }
            power *= 2;
        }


        String octalString = "";

        // Corner case: If the input is 0
        if (decimal == 0) {
            octalString = "0";
        } else {
            // Convert decimal to octal
            while (decimal > 0) {
                octalString = (decimal % 8) + octalString;
                decimal /= 8;
            }
        }


        System.out.println("Octal equivalent: " + octalString);
        scanner.close();
    }
}

