import java.util.Scanner;

public class DecimalToBinary {

    public static String toBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Insert at the beginning for correct order
            decimal /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = toBinary(decimalNumber);
        System.out.println("Binary number is: " + binaryNumber);
        scanner.close(); 
    }
}
