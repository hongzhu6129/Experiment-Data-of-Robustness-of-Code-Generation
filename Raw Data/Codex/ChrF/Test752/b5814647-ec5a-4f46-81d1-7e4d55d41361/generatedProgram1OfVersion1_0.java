import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            long octal = Long.parseLong(octalString, 8); // Parse octal string directly

            // Convert to binary using built-in Long.toBinaryString
            String binaryString = Long.toBinaryString(octal); 
            System.out.println("Binary equivalent: " + binaryString);

        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number.");
        }
        scanner.close();


    }
}
