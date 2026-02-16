import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Option 1: Hardcoded radius
        double radius = 7.5; 
        calculateAndPrint(radius);


        // Option 2: User input for radius (uncomment for interactive use)
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.close();
        calculateAndPrint(radius);
        */

    }

    public static void calculateAndPrint(double radius) {
        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            return;
        }

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Perimeter is = %.15f\n", perimeter); // Increased precision for testing
        System.out.printf("Area is = %.15f\n", area);      // Increased precision for testing
    }
}
