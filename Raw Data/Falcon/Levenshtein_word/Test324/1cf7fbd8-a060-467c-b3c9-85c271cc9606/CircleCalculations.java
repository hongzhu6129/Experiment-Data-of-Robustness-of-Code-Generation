import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculations {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
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


class CircleCalculationsTest {

    @Test
    void testCalculateArea_positiveRadius() {
        assertEquals(176.71458676442586, CircleCalculations.calculateArea(7.5), 0.0001);
    }

    @Test
    void testCalculateArea_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculateArea(0.0), 0.0001);
    }

    // Corner case: Extremely small radius
    @Test
    void testCalculateArea_smallRadius() {
        assertEquals(7.853981633974483E-8, CircleCalculations.calculateArea(0.0005), 0.00000000000001); // Using a higher delta for very small values.
    }



    @Test
    void testCalculatePerimeter_positiveRadius() {
        assertEquals(47.12388980384689, CircleCalculations.calculatePerimeter(7.5), 0.0001);
    }

    @Test
    void testCalculatePerimeter_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculatePerimeter(0.0), 0.0001);
    }
    
    // Corner case: Extremely small radius
    @Test
    void testCalculatePerimeter_smallRadius() {
        assertEquals(0.003141592653589793, CircleCalculations.calculatePerimeter(0.0005), 0.00000000000001); // Using a higher delta
    }


     // This test will fail because negative radius is not physically meaningful.
    //  Demonstrates how to test for exceptions using JUnit 5
    @Test
    void testCalculateArea_negativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculations.calculateArea(-1); // Expecting an exception
        });
    }

     //  Same as above, demonstrating exception testing with JUnit 5 for Perimeter
    @Test
    void testCalculatePerimeter_negativeRadius() {
         assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculations.calculatePerimeter(-1); // Expecting an exception
        });
    }


}
