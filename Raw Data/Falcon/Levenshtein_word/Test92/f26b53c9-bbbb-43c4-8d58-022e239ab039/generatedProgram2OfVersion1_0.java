import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageCalculator {
    // ... (rest of the code as before)

    public static double calculateAverage(double num1, double num2, double num3) {
        if (Double.isNaN(num1) || Double.isNaN(num2) || Double.isNaN(num3)) {
            return Double.NaN; // Propagate NaN
        }
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3;

        try {
             // ... (input code as before, inside try block)
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
            return; // or handle the error differently
        }

        // ... (rest of the main method)
    }
}

