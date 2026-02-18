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
        double area = calculateArea(radius);
        double perimeter = calculatePerimeter(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Perimeter is = " + perimeter); // Output will be approximately 47.1238898
        System.out.println("Area is = " + area); // Output will be approximately 176.7145867

    }
}


class CircleCalculationsTest {

    @Test
    void calculateArea_positiveRadius() {
        assertEquals(176.71458676442586, CircleCalculations.calculateArea(7.5), 0.000001);
    }

    @Test
    void calculateArea_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculateArea(0.0));
    }


    // This test demonstrates how to handle potential exceptions for invalid input
    @Test
    void calculateArea_negativeRadius_throwsException() {
       assertThrows(IllegalArgumentException.class, () -> CircleCalculations.calculateArea(-1.0));

    }


    @Test
    void calculatePerimeter_positiveRadius() {
        assertEquals(47.12388980384689, CircleCalculations.calculatePerimeter(7.5), 0.000001);

    }

    @Test
    void calculatePerimeter_zeroRadius() {
        assertEquals(0, CircleCalculations.calculatePerimeter(0.0));
    }

        // Demonstrates exception handling for invalid input in perimeter calculation.  Although mathematically
    // a negative radius could have a perimeter,  it doesn't make sense in a real-world context, so
    // I'm choosing to throw an exception here for consistency and input validation.

    @Test
    void calculatePerimeter_negativeRadius_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> CircleCalculations.calculatePerimeter(-1.0));
    }


    @Test
    void calculateArea_veryLargeRadius() {
        assertEquals(Double.POSITIVE_INFINITY,  CircleCalculations.calculateArea(Double.MAX_VALUE));
    }


    @Test
    void calculatePerimeter_veryLargeRadius() {
        assertEquals(Double.POSITIVE_INFINITY, CircleCalculations.calculatePerimeter(Double.MAX_VALUE));
    }



    @Test
    void calculateArea_verySmallRadius() {
        assertEquals(7.853981633974483E-31, CircleCalculations.calculateArea(Double.MIN_VALUE), 1E-33); // Using a tolerance
    }

    @Test
    void calculatePerimeter_verySmallRadius() {
        assertEquals(3.141592653589793E-30, CircleCalculations.calculatePerimeter(Double.MIN_VALUE), 1E-32); // Using a tolerance
    }

}
