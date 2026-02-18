import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String octalString = input.nextLine();

        try {
            int decimal = Integer.parseInt(octalString, 8);
            System.out.println("Equivalent decimal number: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number input.");
        }

        input.close(); 
    }
}
