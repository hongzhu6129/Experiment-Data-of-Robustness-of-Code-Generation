import java.util.List;
import java.util.ArrayList;

public class PolynomialEvaluation {

    public static void main(String[] args) {
        // Example coefficients (from highest to lowest power of x)
        List<Double> coefficients = new ArrayList<>();
        coefficients.add(6.0); // x^3
        coefficients.add(-4.0); // x^2
        coefficients.add(7.0); // x^1
        coefficients.add(-19.0); // x^0 (constant)

        double x = 3.0;

        double result = polyEval(coefficients, x);
        System.out.println("Result: " + result);
    }

    public static double polyEval(List<Double> coefficients, double x) {
        double result = 0.0;
        for (int i = 0; i < coefficients.size(); i++) {
            result = result * x + coefficients.get(i); 
        }
        return result;
    }
}
