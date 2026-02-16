import java.util.Scanner;

public class BinaryToDecimal {

    public static int functionone(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            } else if (binary.charAt(i) != '0') {  // Handle invalid input (non-binary characters)
                return -1; // Indicate an error
            }
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();


        int decimal = functionone(binaryString);

        if (decimal != -1) {
            System.out.println("Decimal number: " + decimal);
        } else {
            System.out.println("Invalid Input: Not a binary number.");
        }
        input.close();
    }
}
