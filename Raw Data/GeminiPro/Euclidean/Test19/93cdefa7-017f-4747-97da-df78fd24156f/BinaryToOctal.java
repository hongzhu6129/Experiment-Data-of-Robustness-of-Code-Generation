import java.util.Scanner;

public class BinaryToOctal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();


        // Handling invalid input (non-binary characters)
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                System.out.println("Invalid binary input.");
                return; 
            }
        }

        // Handling the empty string case
        if (binaryString.isEmpty()) {
            System.out.println("Octal equivalent: 0");
            return;
        }


        int decimal = 0;
        int power = 0;

        // Convert binary to decimal
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }


        String octalString = "";

        // Convert decimal to octal
        if (decimal == 0) {
            octalString = "0";
        } else {
            while (decimal > 0) {
                octalString = (decimal % 8) + octalString;
                decimal /= 8;
            }
        }


        System.out.println("Octal equivalent: " + octalString);

        scanner.close();
    }
}
