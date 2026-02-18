import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Corner Case 1: Empty Input
        if (binaryString.isEmpty()) {
            System.out.println("Octal equivalent: 0");
            return;
        }


        // Corner Case 2: Invalid Input (Non-binary characters)
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                System.out.println("Invalid binary input.");
                return;
            }
        }

        // Corner Case 3 & General Case: Handling leading zeros and conversion
        long decimal = 0;
        long power = 1;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += power;
            }
            power *= 2;
        }

        // Corner Case 4: Binary representing 0
        if (decimal == 0) {
            System.out.println("Octal equivalent: 0");
            return;
        }

        String octalString = "";
        while (decimal > 0) {
            octalString = (decimal % 8) + octalString; // Prepend remainder
            decimal /= 8;
        }


        System.out.println("Octal equivalent: " + octalString);

        scanner.close(); 
    }
}
