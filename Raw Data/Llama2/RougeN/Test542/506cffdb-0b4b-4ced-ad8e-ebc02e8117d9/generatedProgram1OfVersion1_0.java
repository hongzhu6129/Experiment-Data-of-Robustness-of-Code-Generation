import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();


        try {
            long binary = Long.parseLong(binaryString);
            if (!binaryString.matches("[01]+")) {  // Validate binary input
                throw new NumberFormatException("Invalid binary format.  Only 0s and 1s are allowed.");
            }

            long decimal = 0;
            long power = 1; // Represents 2^0, 2^1, 2^2, etc.

            // Binary to Decimal conversion
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                if (binaryString.charAt(i) == '1') {
                    decimal += power;
                }
                power *= 2;
            }


            String octalString = "";


            // Handle the corner case of input 0
            if(decimal == 0) {
                octalString = "0";
            } else {
                // Decimal to Octal conversion
                while(decimal > 0) {
                    long remainder = decimal % 8;
                    octalString = remainder + octalString;  // Prepend the remainder
                    decimal /= 8;
                }
            }


            System.out.println("Octal equivalent: " + octalString);


        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

        input.close();
    }
}



