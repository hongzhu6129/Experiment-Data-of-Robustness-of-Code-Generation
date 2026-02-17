import java.util.Scanner;

public class BinaryToHexadecimal {

    public static String binaryToHex(String binary) {
        // Handle empty input
        if (binary == null || binary.isEmpty()) {
            return ""; 
        }

        // Handle invalid binary strings (containing characters other than 0 and 1)
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1') {
                return "Invalid Binary Input";
            }
        }


        int decimal = 0;
        int power = 0;

        // Convert binary to decimal
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        // Convert decimal to hexadecimal
        return Integer.toHexString(decimal).toUpperCase(); // Use toUpperCase for consistency

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = input.nextLine();
        String hex = binaryToHex(binary);
        System.out.println("Hexadecimal value: '" + hex + "'");
        input.close();

    }
}
