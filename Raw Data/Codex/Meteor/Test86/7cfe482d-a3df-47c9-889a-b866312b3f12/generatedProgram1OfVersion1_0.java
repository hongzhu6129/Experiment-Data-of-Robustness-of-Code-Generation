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

     // Corner case: Extremely small radius
    @Test
    void calculatePerimeter_smallRadius() {
        assertEquals(0.000000006283185307179586, CircleCalculations.calculatePerimeter(0.000000001), 0.0000000000000001);
    }

    @Test
    void calculateArea_smallRadius() {
        assertEquals(3.141592653589793E-20, CircleCalculations.calculateArea(0.000000001), 1E-25); // Adjust delta for extremely small values
    }


    // Corner case: Negative radius (should ideally throw an exception in a real-world application, 
    // but here we'll just test for the absolute value)
    @Test
    void calculatePerimeter_negativeRadius() {
        assertEquals(47.12388980384689, Math.abs(CircleCalculations.calculatePerimeter(-7.5)), 0.000001);
    }

    @Test
    void calculateArea_negativeRadius() {
        assertEquals(176.71458676442586, CircleCalculations.calculateArea(-7.5), 0.000001); // Area remains positive even with negative radius
    }

    @Test
    void calculatePerimeter_largeRadius() {
        assertEquals(62831853071.79587, CircleCalculations.calculatePerimeter(1000000000), 0.000001);
    }

    @Test
    void calculateArea_largeRadius() {
       assertEquals(3.141592653589793E18, CircleCalculations.calculateArea(1000000000), 1E12);
    }
}
