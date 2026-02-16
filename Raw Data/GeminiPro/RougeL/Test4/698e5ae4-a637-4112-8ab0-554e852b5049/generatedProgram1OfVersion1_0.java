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
        assertEquals(47.12388980384689, CircleCalculations.calculatePerimeter(7.5));
    }

    @Test
    void calculateArea_positiveRadius() {
        assertEquals(176.71458676442586, CircleCalculations.calculateArea(7.5));
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
    void calculatePerimeter_veryLargeRadius() {
        assertEquals(Double.POSITIVE_INFINITY,  CircleCalculations.calculatePerimeter(Double.MAX_VALUE)); // Check for potential overflow
    }


    @Test
    void calculateArea_veryLargeRadius() {
        assertEquals(Double.POSITIVE_INFINITY, CircleCalculations.calculateArea(Double.MAX_VALUE)); // Check for potential overflow
    }





    @Test
    void calculatePerimeter_negativeRadius_throwsIllegalArgumentException() {
         assertThrows(IllegalArgumentException.class, () -> {
             CircleCalculations.calculatePerimeter(-1); // Expecting exception for negative radius
         });
    }



    @Test
    void calculateArea_negativeRadius_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculations.calculateArea(-1); // Expecting exception for negative radius
        });
    }




}

