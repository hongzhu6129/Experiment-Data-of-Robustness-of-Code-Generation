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
    void calculatePerimeter_verySmallRadius() {  // Corner case: very small value
       double radius = 0.000001;
       double expectedPerimeter = 2 * Math.PI * radius;
       assertEquals(expectedPerimeter, CircleCalculations.calculatePerimeter(radius), 0.000000001);
    }

    @Test
    void calculateArea_verySmallRadius() { // Corner case: very small value
       double radius = 0.000001;
       double expectedArea = Math.PI * radius * radius;
       assertEquals(expectedArea, CircleCalculations.calculateArea(radius), 0.000000000000001); // Adjust delta as needed
    }

    @Test
    void calculatePerimeter_largeRadius() { // Corner case: large radius
        double radius = 1000000;
        double expectedPerimeter = 2 * Math.PI * radius;
        assertEquals(expectedPerimeter, CircleCalculations.calculatePerimeter(radius), 0.0001 * expectedPerimeter); // Use relative delta for large values
    }




}
