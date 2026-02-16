import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculations {

    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 8.5;
        double perimeter = calculatePerimeter(radius);
        double area = calculateArea(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}


class CircleCalculationsTest {

    @Test
    void testCalculatePerimeter_positiveRadius() {
        assertEquals(53.40707511102649, CircleCalculations.calculatePerimeter(8.5), 0.00001);  // Delta for floating-point comparison
    }


    @Test
    void testCalculatePerimeter_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculatePerimeter(0.0));
    }


    @Test
    void testCalculatePerimeter_negativeRadius_throwsIllegalArgumentException() {

        assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculations.calculatePerimeter(-1);  // Expecting exception for negative radius

        });

    }

    @Test
    void testCalculateArea_positiveRadius() {
        assertEquals(226.98006922186297, CircleCalculations.calculateArea(8.5), 0.00001);
    }

    @Test
    void testCalculateArea_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculateArea(0.0));
    }


        @Test
    void testCalculateArea_negativeRadius_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculations.calculateArea(-1);  // Expecting exception for negative radius

        });

    }


    @Test
    void testCalculateArea_veryLargeRadius() {
        assertEquals(Double.POSITIVE_INFINITY, CircleCalculations.calculateArea(Double.MAX_VALUE)); // Check for overflow
    }



    @Test
    void testCalculatePerimeter_veryLargeRadius() {

        assertEquals(Double.POSITIVE_INFINITY, CircleCalculations.calculatePerimeter(Double.MAX_VALUE));
    }

    @Test
    void testCalculateArea_verySmallRadius() {
        assertEquals(0.0, CircleCalculations.calculateArea(Double.MIN_VALUE), 0.00001);  // Very small, but still positive

    }

        @Test
    void testCalculatePerimeter_verySmallRadius() {
        assertEquals(0.0, CircleCalculations.calculatePerimeter(Double.MIN_VALUE), 0.00001); // Very small, but still positive
    }



}
