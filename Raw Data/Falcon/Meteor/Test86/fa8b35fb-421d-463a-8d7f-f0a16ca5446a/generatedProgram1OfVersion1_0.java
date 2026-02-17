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
    void testCalculatePerimeter_positiveRadius() {
        assertEquals(47.12388980384689, CircleCalculations.calculatePerimeter(7.5), 0.000001);  // Delta for double comparison
    }


    @Test
    void testCalculatePerimeter_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculatePerimeter(0.0));
    }

    @Test
    void testCalculatePerimeter_negativeRadius_throwsIllegalArgumentException() {

        assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculations.calculatePerimeter(-1); // Expecting exception for negative radius.
        });
    }

    @Test
    void testCalculateArea_positiveRadius() {
        assertEquals(176.71458676442586, CircleCalculations.calculateArea(7.5), 0.000001);
    }

    @Test
    void testCalculateArea_zeroRadius() {
        assertEquals(0.0, CircleCalculations.calculateArea(0.0));
    }

     @Test
    void testCalculateArea_negativeRadius_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculations.calculateArea(-1);  // Expecting exception for negative radius.
        });
    }



    @Test
    void testLargeRadius(){
        assertEquals(1.2566370614359173E18, CircleCalculations.calculateArea(20000000000.0), 1E15); // Large number, wider delta
        assertEquals(1.2566370614359172E11, CircleCalculations.calculatePerimeter(20000000000.0), 1E8);
    }





}
