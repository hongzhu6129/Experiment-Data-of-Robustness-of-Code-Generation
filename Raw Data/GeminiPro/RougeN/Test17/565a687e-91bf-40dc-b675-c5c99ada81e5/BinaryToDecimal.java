import java.util.Scanner;

public class BinaryToDecimal {

    public static int functionone(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);

            if (digit != '0' && digit != '1') {
                throw new IllegalArgumentException("Invalid binary number: " + binary);
            }


            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryString = input.nextLine();

        try {
            int decimal = functionone(binaryString);
            System.out.println("Decimal number: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        input.close();
    }
}
