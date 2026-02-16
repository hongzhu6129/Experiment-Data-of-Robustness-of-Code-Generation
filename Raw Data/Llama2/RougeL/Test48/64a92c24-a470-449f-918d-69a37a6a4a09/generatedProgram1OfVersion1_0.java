import java.util.Scanner;

public class ModulusWithoutOperator {

    public static int modulus(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        // Handle negative numbers
        if (dividend < 0) {
            return modulus(-dividend, divisor) * (divisor > 0 ? -1 : 1) ;
        }
        if (divisor < 0) {
            return modulus(dividend, -divisor);
        }


        int quotient = dividend / divisor; // Integer division
        int remainder = dividend - (quotient * divisor);
        return remainder;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        try {
            int result = modulus(dividend, divisor);
            System.out.println("The modulus is: " + result);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        scanner.close();
    }
}



