import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculations {

    public static class Circle {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        double radius = 7.5;
        Circle circle = new Circle(radius);

        System.out.println("Perimeter is = " + circle.calculatePerimeter());
        System.out.println("Area is = " + circle.calculateArea());
    }


    @Test
    void testZeroRadius() {
        Circle circle = new Circle(0);
        assertEquals(0, circle.calculatePerimeter());
        assertEquals(0, circle.calculateArea());
    }

    @Test
    void testPositiveRadius() {
        Circle circle = new Circle(7.5);
        assertEquals(47.12388980384689, circle.calculatePerimeter(), 1e-10); // Using delta for comparison due to floating-point precision
        assertEquals(176.71458676442586, circle.calculateArea(), 1e-10);
    }


    @Test
    void testLargeRadius() {
        Circle circle = new Circle(10000);
        assertEquals(62831.85307179586, circle.calculatePerimeter(), 1e-10);
        assertEquals(314159265.3589793, circle.calculateArea(), 1e-10);
    }


    @Test
    void testNegativeRadius() {      // Corner case: Handling invalid input
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(-1); // Expecting an exception for negative radius
        });

    }


    @Test  // Another way to handle invalid input - this one just returns 0, no exception
    void testNegativeRadiusAlternativeHandling() {
        Circle circle = new Circle(-5); // Using modified constructor 
        assertEquals(0, circle.calculatePerimeter());  // Perimeter should be 0 for negative input
        assertEquals(0, circle.calculateArea());       // Area should be 0 for negative input

    }




}
