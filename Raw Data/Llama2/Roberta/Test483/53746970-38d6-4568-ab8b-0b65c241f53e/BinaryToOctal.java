import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            // Validate input (only 0s and 1s)
            for (char c : binaryString.toCharArray()) {
                if (c != '0' && c != '1') {
                    throw new IllegalArgumentException("Invalid binary input: Contains characters other than 0 and 1.");
                }
            }
            
            int decimal = 0;
            int power = 0;
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                if (binaryString.charAt(i) == '1') {
                    decimal += Math.pow(2, power);
                }
                power++;
            }


            String octalString = Integer.toOctalString(decimal);

            System.out.println("Octal equivalent: " + octalString);

        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input.  Input must be a valid binary number.");

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
       scanner.close();
    }
}
