import java.util.List;
import java.util.ArrayList;

public class PolynomialEvaluation {

    public static void main(String[] args) {
        // Example usage:
        List<Double> coefficients = new ArrayList<>();
        coefficients.add(-19.0); // Constant term
        coefficients.add(7.0);
        coefficients.add(-4.0);
        coefficients.add(6.0); 

        double x = 3.0;

        double result = polyEval(coefficients, x);
        System.out.println("Result of polynomial evaluation: " + result);
    }

    public static double polyEval(List<Double> coefficients, double x) {
        double result = 0.0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            result = result * x + coefficients.get(i);
        }
        return result;
    }
}
