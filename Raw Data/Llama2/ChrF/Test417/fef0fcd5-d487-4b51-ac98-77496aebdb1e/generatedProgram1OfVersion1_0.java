import java.util.List;
import java.util.ArrayList;

public class PolynomialEvaluation {

    public static void main(String[] args) {
        // Example usage: -19 + 7x - 4x^2 + 6x^3  at x = 3
        List<Double> coefficients = new ArrayList<>();
        coefficients.add(-19.0); // Constant term
        coefficients.add(7.0);   // Coefficient of x
        coefficients.add(-4.0);  // Coefficient of x^2
        coefficients.add(6.0);   // Coefficient of x^3

        double x = 3.0;
        double result = polyEval(coefficients, x);

        System.out.println("The result of the polynomial evaluation is: " + result);


        //Another example:  2 + 3x -5x^2  at x = 2.5
         List<Double> coefficients2 = new ArrayList<>();
        coefficients2.add(2.0);
        coefficients2.add(3.0);
        coefficients2.add(-5.0);
        
        double x2 = 2.5;
        double result2 = polyEval(coefficients2, x2);
         System.out.println("The result of the polynomial evaluation is: " + result2);
    }

    public static double polyEval(List<Double> coefficients, double x) {
        double result = 0.0;  // Initialize the result

        for (int i = coefficients.size() - 1; i >= 0; i--) {
            result = result * x + coefficients.get(i);
        }

        return result;
    }
}
