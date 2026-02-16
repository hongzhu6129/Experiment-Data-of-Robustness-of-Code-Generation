import java.util.Scanner;

public class ModulusWithoutOperator {

    public static int modulus(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Handle negative numbers
        if (dividend < 0) {
            return modulus(-dividend, divisor) * (divisor > 0 ? -1 : 1);
        }
        if (divisor < 0) {
             return modulus(dividend, -divisor);
        }


        // Repeated subtraction method
        while (dividend >= divisor) {
            dividend -= divisor;
        }

        return dividend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        try {
            int result = modulus(dividend, divisor);
            System.out.println("Modulus: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
         scanner.close();
    }
}
