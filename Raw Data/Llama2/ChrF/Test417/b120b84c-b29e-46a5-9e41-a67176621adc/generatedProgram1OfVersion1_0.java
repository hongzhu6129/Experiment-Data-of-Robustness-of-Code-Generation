import java.util.List;
import java.util.Arrays;

public class PolynomialEvaluator {

    public static void main(String[] args) {
        // Example usage:
        List<Double> coefficients = Arrays.asList(-19.0, 7.0, -4.0, 6.0);
        double x = 3.0;
        double result = polyEval(coefficients, x);
        System.out.println("Result: " + result); // Output: Result: 32.0


        coefficients = Arrays.asList(2.0, 1.0, -3.0, 4.0);
        x = 2;
        result = polyEval(coefficients,x);
        System.out.println("Result: " + result); // Output: 30.0



        coefficients = Arrays.asList(1.0, 2.0, 3.0);  // Represents x^2 + 2x + 3
        x = -1.0;
        result = polyEval(coefficients, x);
        System.out.println("Result: " + result); // Output: Result: 2.0
    }

    public static double polyEval(List<Double> coefficients, double x) {
        double result = 0.0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            result = result * x + coefficients.get(i);
        }
        return result;
    }
}
