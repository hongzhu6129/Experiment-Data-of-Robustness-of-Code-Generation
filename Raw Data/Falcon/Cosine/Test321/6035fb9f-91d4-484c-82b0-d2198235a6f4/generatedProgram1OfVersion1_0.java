import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = input.nextLine();

        try {
            long octal = Long.parseLong(octalString, 8); // Parse octal string directly


            long binary = 0;
            long power = 1;


            while (octal > 0) {
                int lastDigit = (int)(octal % 10);
                if (lastDigit < 0 || lastDigit > 7) {
                    System.out.println("Invalid octal number. Digits must be between 0 and 7.");
                    return; // Exit if invalid octal digit
                }


                long binaryEquivalent = 0;
                long powerOfTwo = 1;
                while (lastDigit > 0) {
                    binaryEquivalent += (lastDigit % 2) * powerOfTwo;
                    lastDigit /= 2;
                    powerOfTwo *= 10;
                }

                binary += binaryEquivalent*power;

                octal /= 10;
                power*=1000;

            }

            System.out.println("Binary equivalent: " + binary);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid octal number.");
        }

        input.close();
    }
}
