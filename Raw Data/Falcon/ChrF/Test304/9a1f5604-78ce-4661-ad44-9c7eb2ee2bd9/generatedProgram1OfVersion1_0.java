import java.util.List;
import java.util.ArrayList;

public class PolynomialEvaluation {

    public static void main(String[] args) {
        // Example usage: -19 + 7x - 4x^2 + 6x^3 at x = 3
        List<Double> coefficients = new ArrayList<>();
        coefficients.add(-19.0); // Constant term
        coefficients.add(7.0);   // Coefficient of x
        coefficients.add(-4.0);  // Coefficient of x^2
        coefficients.add(6.0);   // Coefficient of x^3

        double x = 3.0;
        double result = polyEval(coefficients, x);
        System.out.println("Result: " + result);  // Output: Result: 124.0

        //Another Example usage: 2 + 3x + x^2 at x = 2
        coefficients.clear(); // Clear the previous coefficients
        coefficients.add(2.0);
        coefficients.add(3.0);
        coefficients.add(1.0);
        x = 2;
        result = polyEval(coefficients,x);
        System.out.println("Result: " + result); // Output: Result: 12.0
    }

    public static double polyEval(List<Double> coefficients, double x) {
        double result = 0.0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            result = result * x + coefficients.get(i);
        }
        return result;
    }
}
