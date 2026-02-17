import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculations {

    public static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {
        double radius = 7.4;
        Circle circle = new Circle(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Perimeter is = " + circle.calculatePerimeter());
        System.out.println("Area is = " + circle.calculateArea());
    }



    @Test
    void testCalculateArea() {
        Circle circle = new Circle(7.4);
        assertEquals(172.0336153137209, circle.calculateArea(), 0.0001); // Delta for floating-point comparison

        circle = new Circle(0); // Corner case: zero radius
        assertEquals(0, circle.calculateArea(), 0.0001);

        circle = new Circle(1);
        assertEquals(Math.PI, circle.calculateArea(), 0.0001);


        circle = new Circle(100); // Large radius
        assertEquals(31415.926535897932, circle.calculateArea(), 0.0001);

    }


    @Test
    void testCalculatePerimeter() {
        Circle circle = new Circle(7.4);
        assertEquals(46.49557171407931, circle.calculatePerimeter(), 0.0001); // Delta for comparison

        circle = new Circle(0); // Corner case: zero radius
        assertEquals(0, circle.calculatePerimeter(), 0.0001);


        circle = new Circle(1);
        assertEquals(2 * Math.PI, circle.calculatePerimeter(), 0.0001);

        circle = new Circle(100); // Large radius
        assertEquals(628.3185307179587, circle.calculatePerimeter(), 0.0001);
    }


    @Test
    void testInvalidRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1)); // Negative radius
    }


}
