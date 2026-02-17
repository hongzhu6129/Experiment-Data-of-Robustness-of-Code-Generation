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
        double radius = 7.5;
        Circle circle = new Circle(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }


    @Test
    void testCalculateArea_positiveRadius() {
        Circle circle = new Circle(7.5);
        assertEquals(176.71458676442586, circle.calculateArea(), 0.000001); // Delta for double comparison
    }

    @Test
    void testCalculatePerimeter_positiveRadius() {
        Circle circle = new Circle(7.5);
        assertEquals(47.12388980384689, circle.calculatePerimeter(), 0.000001);
    }



    @Test
    void testCalculateArea_zeroRadius() {
        Circle circle = new Circle(0);
        assertEquals(0, circle.calculateArea());
    }

    @Test
    void testCalculatePerimeter_zeroRadius() {
        Circle circle = new Circle(0);
        assertEquals(0, circle.calculatePerimeter());
    }


    @Test
    void testCalculateArea_largeRadius() {
        Circle circle = new Circle(100000);
        assertEquals(3.141592653589793E10, circle.calculateArea(), 1E7); // Larger delta for very large numbers
    }


    @Test
    void testCalculatePerimeter_largeRadius() {
          Circle circle = new Circle(100000);
          assertEquals(628318.5307179586, circle.calculatePerimeter(), 1); // Adjusted delta
    }


     @Test
    void testNegativeRadius_throwsIllegalArgumentException() {
          assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }


}
