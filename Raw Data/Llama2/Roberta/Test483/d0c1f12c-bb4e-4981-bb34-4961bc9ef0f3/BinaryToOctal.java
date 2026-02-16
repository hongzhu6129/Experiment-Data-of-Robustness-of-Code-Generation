import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            long decimal = 0;
            long power = 1;

            for (int i = binaryString.length() - 1; i >= 0; i--) {
                char digit = binaryString.charAt(i);

                if (digit != '0' && digit != '1') {
                    throw new IllegalArgumentException("Invalid binary number.  Contains characters other than 0 and 1.");
                }

                if (digit == '1') {
                    decimal += power;
                }
                power *= 2;
            }

            String octalString = "";

            if (decimal == 0) {
                octalString = "0";
            } else {
                while (decimal > 0) {
                    octalString = (decimal % 8) + octalString; // Prepend the remainder
                    decimal /= 8;
                }
            }


            System.out.println("Octal equivalent: " + octalString);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        scanner.close();

    }
}
