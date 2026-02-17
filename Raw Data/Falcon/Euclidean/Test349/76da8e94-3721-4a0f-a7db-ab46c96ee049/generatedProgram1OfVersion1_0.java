import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Validate input (only 0s and 1s) and handle corner cases
        if (binaryString.isEmpty()) {
            System.out.println("Invalid input: Empty string.");
            return;
        }


        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                System.out.println("Invalid input: Not a binary number.");
                return;
            }
        }



        long decimal = 0;
        long power = 1;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += power;
            }
            power *= 2;
        }


        String octalString = "";
        if (decimal == 0) {
            octalString = "0";
        } else {
            while (decimal > 0) {
                octalString = (decimal % 8) + octalString; // Prepend remainder
                decimal /= 8;
            }
        }

        System.out.println("Octal equivalent: " + octalString);
        scanner.close();


    }
}
