import java.util.List;
import java.util.Arrays;

public class PolynomialEvaluation {

    public static void main(String[] args) {
        // Example usage:
        List<Double> coefficients = Arrays.asList(-19.0, 7.0, -4.0, 6.0); // Coefficients in increasing order of power
        double x = 3.0;
        double result = polyEval(coefficients, x);
        System.out.println("Result: " + result); 
    }

    public static double polyEval(List<Double> coefficients, double x) {
        double result = 0.0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            result = result * x + coefficients.get(i);
        }
        return result;
    }
}
