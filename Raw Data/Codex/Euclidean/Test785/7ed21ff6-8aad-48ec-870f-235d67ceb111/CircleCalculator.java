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

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}


class CircleCalculatorTest {

    @Test
    void testCalculatePerimeter_positiveRadius() {
        assertEquals(47.12388980384689, CircleCalculator.calculatePerimeter(7.5), 0.000001);
    }

    @Test
    void testCalculatePerimeter_zeroRadius() {
        assertEquals(0, CircleCalculator.calculatePerimeter(0), 0.000001);
    }

     @Test
    void testCalculatePerimeter_negativeRadius_throwsException() {

        assertThrows(IllegalArgumentException.class, () -> {
             CircleCalculator.calculatePerimeter(-1); // Expecting exception for negative radius.
        });


    }

    @Test
    void testCalculateArea_positiveRadius() {
        assertEquals(176.71458676442586, CircleCalculator.calculateArea(7.5), 0.000001);
    }

    @Test
    void testCalculateArea_zeroRadius() {
        assertEquals(0, CircleCalculator.calculateArea(0), 0.000001);
    }


    @Test
    void testCalculateArea_negativeRadius_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculator.calculateArea(-1); // Expecting exception for negative radius.
       });

    }



    @Test
    void testCalculateArea_largeRadius() {
        assertEquals(7.0685834705770345E7, CircleCalculator.calculateArea(4750), 0.000001E7);  // Test with a large number
    }



    @Test
    void testCalculatePerimeter_verySmallRadius() {
        assertEquals(0.00006283185307179587, CircleCalculator.calculatePerimeter(0.00001), 0.0000000000000001); // Very small radius
    }
}
