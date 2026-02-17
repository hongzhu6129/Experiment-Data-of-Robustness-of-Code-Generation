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
    void testRadius7_5() {
        Circle circle = new Circle(7.5);
        assertEquals(47.12388980384689, circle.getPerimeter(), 0.0000001); // Delta for double comparison
        assertEquals(176.71458676442586, circle.getArea(), 0.0000001);
    }



    @Test
    void testRadiusZero() {
        Circle circle = new Circle(0);
        assertEquals(0, circle.getPerimeter());
        assertEquals(0, circle.getArea());
    }

    @Test
    void testRadiusOne() {
        Circle circle = new Circle(1);
        assertEquals(2 * Math.PI, circle.getPerimeter());
        assertEquals(Math.PI, circle.getArea());
    }

    @Test
    void testNegativeRadius() { //  Handle invalid input
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1), "Expected IllegalArgumentException for negative radius");

    }


    @Test
    void testLargeRadius() {  // Test with a large radius to check for potential overflow issues.
        Circle circle = new Circle(1e6); // 1 million
        assertEquals(6283185.307179587, circle.getPerimeter(), 1e-10); // Adjust delta appropriately
        assertEquals(3.141592653589793E12, circle.getArea(), 1e6);  // Wider tolerance for larger numbers
    }


}
