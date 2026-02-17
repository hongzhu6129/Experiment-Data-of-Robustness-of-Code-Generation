import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = input.nextLine();


        try {
            // Handle potential NumberFormatException for invalid input
            long octal = Long.parseLong(octalString, 8);


            // Convert to binary
            long binary = 0;
            long power = 1;

            while (octal > 0) {
                int lastDigit = (int) (octal % 10);
                
                //Convert each octal digit to its 3-bit binary equivalent
                int binaryDigit = 0;
                int binaryPower = 1;
                for(int i = 0; i < 3; i++){ //octal digits are base 8 so max value is 7 so it can be represeted with 3 bits
                    binaryDigit += (lastDigit%2) * binaryPower;
                    binaryPower*=2;
                    lastDigit/=2;

                }
                               
                binary +=  binaryDigit * power;
                power *= 1000; // Since each octal digit becomes 3 binary digits
                octal /= 10;
            }
                
            System.out.println("Binary equivalent: " + binary);

        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number entered.");
        }

        input.close();
    }
}
