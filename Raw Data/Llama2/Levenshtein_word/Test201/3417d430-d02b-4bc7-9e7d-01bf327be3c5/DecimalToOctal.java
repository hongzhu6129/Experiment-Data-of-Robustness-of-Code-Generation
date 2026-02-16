import java.util.Scanner;

public class DecimalToOctal {

    public static String functionone(int decimal) {
        if (decimal < 0) {
            return "-" + functionone(-decimal); // Handle negative numbers
        }
        if (decimal == 0) {
            return "0"; // Handle zero
        }

        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder); // Prepend the remainder
            decimal /= 8;
        }
        return octal.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String octal = functionone(decimal);
        System.out.println("Octal number is: " + octal);
        scanner.close(); 
    }
}
