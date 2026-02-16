public class DivisionUsingSubtraction {

    public static float divide_using_subtraction(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int quotient = 0;
        int sign = 1;

        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            sign = -1;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);


        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return (float) (sign * quotient);
    }

    public static void main(String[] args) {
        int dividend = 625;
        int divisor = 25;
        
        System.out.println("input the dividend: " + dividend);
        System.out.println("input the divider: " + divisor);

        float result = divide_using_subtraction(dividend, divisor);
        System.out.println("result: " + result);


    }
}
