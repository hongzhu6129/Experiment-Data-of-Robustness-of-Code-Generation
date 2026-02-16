import java.util.List;
import java.util.ArrayList;

public class PolynomialEvaluation {

    public static void main(String[] args) {
        // Example coefficients: -19 + 7x - 4x^2 + 6x^3  (Note: coefficients are in reverse order of powers of x)
        List<Double> coefficients = new ArrayList<>();
        coefficients.add(-19.0);
        coefficients.add(7.0);
        coefficients.add(-4.0);
        coefficients.add(6.0);

        double x = 3.0;

        double result = polyEval(coefficients, x);
        System.out.println("Result of polynomial evaluation: " + result);
    }

    public static double polyEval(List<Double> coefficients, double x) {
        double result = 0.0;
        for (double coefficient : coefficients) {
            result = result * x + coefficient;  // Horner's method
        }
        return result;
    }
}
