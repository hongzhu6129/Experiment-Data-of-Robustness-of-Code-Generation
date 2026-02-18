import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            // Handle leading zeros gracefully
            while (binaryString.startsWith("0") && binaryString.length() > 1) {
                binaryString = binaryString.substring(1);
            }


            long decimal = 0;
            long power = 1;

            // Binary to Decimal Conversion
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                char digit = binaryString.charAt(i);
                if (digit == '1') {
                    decimal += power;
                } else if (digit != '0') {
                    System.out.println("Invalid binary input."); // Handle invalid characters
                    return; 
                }
                power *= 2;
            }

            String octalString = "";

            if (decimal == 0) {
                octalString = "0"; // Handle the case of input 0.
            } else {
                // Decimal to Octal Conversion
                while (decimal > 0) {
                    int remainder = (int) (decimal % 8);
                    octalString = remainder + octalString;
                    decimal /= 8;
                }

            }


            System.out.println("Octal equivalent: " + octalString);


        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid binary number.");
        }


    }
}
