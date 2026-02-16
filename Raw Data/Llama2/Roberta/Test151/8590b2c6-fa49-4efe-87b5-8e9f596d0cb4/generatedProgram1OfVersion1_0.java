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

        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
    }


    @Test
    void testPositiveRadius() {
        Circle circle = new Circle(7.5);
        assertEquals(47.12388980384689, circle.calculatePerimeter(), 0.000001);  // Delta for double comparison
        assertEquals(176.71458676442586, circle.calculateArea(), 0.000001);
    }

    @Test
    void testZeroRadius() {
        Circle circle = new Circle(0);
        assertEquals(0, circle.calculatePerimeter());
        assertEquals(0, circle.calculateArea());
    }


    @Test
    void testLargeRadius() {
        Circle circle = new Circle(100000);
        assertEquals(628318.5307179587, circle.calculatePerimeter(), 0.000001);
        assertEquals(3.1415926535897932E10, circle.calculateArea(), 1E6); //Larger delta for very large numbers
    }


    @Test
    void testNegativeRadius_ExceptionExpected() {

         assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }



}
