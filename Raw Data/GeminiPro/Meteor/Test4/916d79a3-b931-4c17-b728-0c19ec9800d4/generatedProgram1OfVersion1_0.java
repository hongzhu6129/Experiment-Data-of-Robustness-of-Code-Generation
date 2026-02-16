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
    void calculatePerimeter_positiveRadius() {
        assertEquals(47.12388980384689, CircleCalculations.calculatePerimeter(7.5), 0.000001);
    }

    @Test
    void calculateArea_positiveRadius() {
        assertEquals(176.71458676442586, CircleCalculations.calculateArea(7.5), 0.000001);
    }


    @Test
    void calculatePerimeter_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculatePerimeter(0.0));
    }

    @Test
    void calculateArea_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculateArea(0.0));
    }



    @Test
    void calculatePerimeter_negativeRadius_throwsIllegalArgumentException() {
          assertThrows(IllegalArgumentException.class, () -> {
              CircleCalculations.calculatePerimeter(-1); 
          });
    }

    @Test
    void calculateArea_negativeRadius_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculations.calculateArea(-1);
        });

    }


    @Test
    void calculatePerimeter_veryLargeRadius() {
        assertEquals(Double.POSITIVE_INFINITY, CircleCalculations.calculatePerimeter(Double.MAX_VALUE));
    }


    @Test
    void calculateArea_veryLargeRadius() {
        assertEquals(Double.POSITIVE_INFINITY, CircleCalculations.calculateArea(Double.MAX_VALUE));
    }

    @Test
    void calculatePerimeter_verySmallRadius() {  // Close to zero
        assertEquals(6.283185307179586E-15, CircleCalculations.calculatePerimeter(1E-15), 1E-25); // Use a suitable delta
    }

    @Test
    void calculateArea_verySmallRadius() { // Close to zero
        assertEquals(3.141592653589793E-30,  CircleCalculations.calculateArea(1E-15), 1E-40); // Use a suitable delta
    }
}
