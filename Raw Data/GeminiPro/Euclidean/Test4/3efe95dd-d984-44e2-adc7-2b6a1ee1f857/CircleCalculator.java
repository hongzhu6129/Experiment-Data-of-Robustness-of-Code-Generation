import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculator {

    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 7.5;
        double perimeter = calculatePerimeter(radius);
        double area = calculateArea(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}


class CircleCalculatorTest {

    @Test
    void calculatePerimeter_positiveRadius() {
        assertEquals(47.12388980384689, CircleCalculator.calculatePerimeter(7.5), 0.000001); 
    }

    @Test
    void calculateArea_positiveRadius() {
        assertEquals(176.71458676442586, CircleCalculator.calculateArea(7.5), 0.000001);
    }

    @Test
    void calculatePerimeter_zeroRadius() {
        assertEquals(0.0, CircleCalculator.calculatePerimeter(0.0));
    }

    @Test
    void calculateArea_zeroRadius() {
        assertEquals(0.0, CircleCalculator.calculateArea(0.0));
    }


    @Test
    void calculatePerimeter_negativeRadius_throwsIllegalArgumentException() {
       assertThrows(IllegalArgumentException.class, () -> CircleCalculator.calculatePerimeter(-1.0));
    }

    @Test
    void calculateArea_negativeRadius_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> CircleCalculator.calculateArea(-1.0));
    }


    @Test
    void calculatePerimeter_veryLargeRadius() {
        assertEquals(Double.POSITIVE_INFINITY, CircleCalculator.calculatePerimeter(Double.MAX_VALUE)); // Check for overflow handling
    }

    @Test
    void calculateArea_veryLargeRadius() {
         assertEquals(Double.POSITIVE_INFINITY, CircleCalculator.calculateArea(Double.MAX_VALUE)); // Check for overflow handling
    }

    @Test
    void calculatePerimeter_verySmallRadius() {  // Close to zero
        assertEquals(1.8849555921538759E-15, CircleCalculator.calculatePerimeter(Double.MIN_VALUE), 1e-20);
    }

    @Test
    void calculateArea_verySmallRadius() {  // Close to zero
        assertEquals(3.552713678800501E-30, CircleCalculator.calculateArea(Double.MIN_VALUE), 1e-35);  // Precision adjusted for small values
    }
}
