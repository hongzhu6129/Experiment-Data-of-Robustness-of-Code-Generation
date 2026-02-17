import java.util.List;
import java.util.ArrayList;

public class PolynomialEvaluation {

    public static void main(String[] args) {
        // Example usage: -19 + 7x - 4x^2 + 6x^3 at x = 3
        List<Double> coefficients = new ArrayList<>();
        coefficients.add(-19.0);
        coefficients.add(7.0);
        coefficients.add(-4.0);
        coefficients.add(6.0);
        double x = 3.0;

        double result = polyEval(coefficients, x);
        System.out.println("Result: " + result); // Output: Result: 124.0
    }

    public static double polyEval(List<Double> coefficients, double x) {
        double result = 0.0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            result = result * x + coefficients.get(i);
        }
        return result;
    }
}
