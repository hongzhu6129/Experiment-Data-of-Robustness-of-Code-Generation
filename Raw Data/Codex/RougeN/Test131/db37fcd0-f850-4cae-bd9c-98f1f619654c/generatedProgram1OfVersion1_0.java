import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Validate input (only 0s and 1s)
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                System.out.println("Invalid binary input.");
                return;
            }
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

        //Convert decimal to octal
        if (decimal == 0) {
            octalString = "0"; // Handle the case where the input is 0
        } else {
            while (decimal > 0) {
                octalString = (decimal % 8) + octalString;
                decimal /= 8;
            }
        }

        System.out.println("Octal equivalent: " + octalString);

    }
}
