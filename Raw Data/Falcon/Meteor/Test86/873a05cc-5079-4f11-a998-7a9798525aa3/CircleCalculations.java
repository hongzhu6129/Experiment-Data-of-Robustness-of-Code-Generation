import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using a Scanner for potential user input in the future
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double perimeter = calculatePerimeter(radius);
        double area = calculateArea(radius);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        scanner.close();  // Close the scanner when done.
    }

    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
