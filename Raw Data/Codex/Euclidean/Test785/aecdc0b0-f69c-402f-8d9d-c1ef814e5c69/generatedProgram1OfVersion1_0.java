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

        System.out.printf("Radius: %.1f\n", radius);
        System.out.printf("Perimeter: %.12f\n", perimeter);
        System.out.printf("Area: %.12f\n", area);
    }
}


class CircleCalculationsTest {

    @Test
    void testCalculatePerimeter_positiveRadius() {
        assertEquals(47.1238898038469, CircleCalculations.calculatePerimeter(7.5), 1e-10);
    }

    @Test
    void testCalculatePerimeter_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculatePerimeter(0.0));
    }

    // Corner case: Extremely small radius
    @Test
    void testCalculatePerimeter_smallRadius() {
         assertEquals(6.283185307179586E-10, CircleCalculations.calculatePerimeter(1E-10), 1e-20); // Using a tolerance for very small values.
    }




    @Test
    void testCalculateArea_positiveRadius() {
        assertEquals(176.71458676442586, CircleCalculations.calculateArea(7.5), 1e-10);

    }

    @Test
    void testCalculateArea_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculateArea(0.0));
    }

    // Corner case: Extremely small radius
    @Test
    void testCalculateArea_smallRadius() {
        assertEquals(3.141592653589793E-20, CircleCalculations.calculateArea(1E-10), 1e-30);  // Using a tolerance for very small values.
    }


    // Corner case: Large radius (potential overflow issues if not using double)
    @Test
    void testCalculateArea_largeRadius() {
        assertEquals(7.0685834705770345E14, CircleCalculations.calculateArea(1.5E7), 1e5); // Tolerance adjusted for large values
    }

    // Additional negative test case (though a negative radius doesn't make physical sense for a circle)
    @Test
    void testCalculatePerimeterNegativeRadius(){
        assertEquals(-47.1238898038469, CircleCalculations.calculatePerimeter(-7.5), 1e-10); // Perimeter can technically be negative mathematically
    }


}

