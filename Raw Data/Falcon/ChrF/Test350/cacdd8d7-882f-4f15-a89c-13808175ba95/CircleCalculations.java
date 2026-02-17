import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculations {

    public static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        double radius = 7.5;
        Circle circle = new Circle(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());


    }

    @Test
    void testZeroRadius() {
        Circle circle = new Circle(0);
        assertEquals(0, circle.getPerimeter());
        assertEquals(0, circle.getArea());
    }



    @Test
    void testPositiveRadius() {
        Circle circle = new Circle(7.5);
        assertEquals(47.12388980384689, circle.getPerimeter(), 1e-10); // Using a delta for comparison due to floating-point precision
        assertEquals(176.71458676442586, circle.getArea(), 1e-10);  // Using a delta for comparison 
    }

    @Test
    void testLargeRadius() {
        Circle circle = new Circle(1000);
        assertEquals(6283.185307179586, circle.getPerimeter(), 1e-10);
        assertEquals(3141592.653589793, circle.getArea(), 1e-10);
    }



    @Test
    void testNegativeRadiusException() {

        assertThrows(IllegalArgumentException.class, () -> { new Circle(-5);});

    }
}
