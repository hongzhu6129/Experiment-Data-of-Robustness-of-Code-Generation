import java.lang.Math;

public class CircleCalculations {

    public static void main(String[] args) {

        // Test cases (including corner cases)
        testCircle(7.5); // Given example
        testCircle(0);    // Zero radius
        testCircle(-5);   // Negative radius (should handle gracefully)
        testCircle(100);  // Large radius
        testCircle(Double.MAX_VALUE); // Extremely large radius (potential overflow)



    }

    public static void testCircle(double radius) {
        try {
            double perimeter = calculatePerimeter(radius);
            double area = calculateArea(radius);

            System.out.println("Radius: " + radius);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);
            System.out.println("--------------------");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("--------------------");
        }

    }

    public static double calculatePerimeter(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        return Math.PI * radius * radius;
    }
}

