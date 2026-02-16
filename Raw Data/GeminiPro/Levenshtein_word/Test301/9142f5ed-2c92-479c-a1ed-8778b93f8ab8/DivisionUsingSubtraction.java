import java.util.Scanner;

public class DivisionUsingSubtraction {

    public static float divide_using_subtraction(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int quotient = 0;
        int sign = 1;

        if (dividend < 0) {
            sign *= -1;
            dividend = -dividend;
        }
        if (divisor < 0) {
            sign *= -1;
            divisor = -divisor;
        }

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return (float) quotient * sign;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the dividend: ");
        int dividend = input.nextInt();
        System.out.print("Input the divider: ");
        int divisor = input.nextInt();

        try {
            float result = divide_using_subtraction(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
