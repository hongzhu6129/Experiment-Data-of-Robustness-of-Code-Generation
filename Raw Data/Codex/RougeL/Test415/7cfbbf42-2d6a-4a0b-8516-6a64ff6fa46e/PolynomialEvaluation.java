import java.util.List;

public class PolynomialEvaluation {

    public static void main(String[] args) {
        // Example usage:
        List<Double> coefficients = List.of(-19.0, 7.0, -4.0, 6.0); // Coefficients in ascending order of power
        double x = 3.0;
        double result = polyEval(coefficients, x);
        System.out.println("Result: " + result); // Output: 32.0

        // Another Example
        coefficients = List.of(1.0, 2.0, 3.0); // Represents 1 + 2x + 3x^2
        x = 2.0;
        result = polyEval(coefficients, x);
        System.out.println("Result: " + result); // Output: 17.0
    }

    public static double polyEval(List<Double> coefficients, double x) {
        double result = 0.0;  // Initialize the result

        for (int i = coefficients.size() - 1; i >= 0; i--) {
            result = result * x + coefficients.get(i); // Horner's method
        }

        return result;
    }
}
