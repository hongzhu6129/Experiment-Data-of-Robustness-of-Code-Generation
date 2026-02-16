import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root1 = -b / (2 * a);
            System.out.println("The equation has one root " + root1);
        } else {
            System.out.println("The equation has no real roots");
        }

        input.close(); // Close the scanner to prevent resource leaks
    }
}
