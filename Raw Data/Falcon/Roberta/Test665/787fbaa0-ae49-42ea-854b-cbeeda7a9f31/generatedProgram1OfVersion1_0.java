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
    void testCalculatePerimeter() {
        assertEquals(0.0, CircleCalculator.calculatePerimeter(0.0));          // Zero radius
        assertEquals(47.12388980384689, CircleCalculator.calculatePerimeter(7.5)); // Given example
        assertEquals(6.283185307179586, CircleCalculator.calculatePerimeter(1.0)); // Radius of 1
        assertEquals(31.41592653589793, CircleCalculator.calculatePerimeter(5.0));

    }

    @Test
    void testCalculateArea() {
        assertEquals(0.0, CircleCalculator.calculateArea(0.0));              // Zero radius
        assertEquals(176.71458676442586, CircleCalculator.calculateArea(7.5));  // Given example
        assertEquals(3.141592653589793, CircleCalculator.calculateArea(1.0));   // Radius of 1
        assertEquals(78.53981633974483, CircleCalculator.calculateArea(5.0));



    }


    @Test
    void testNegativeRadiusPerimeter(){

        assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculator.calculatePerimeter(-1); // Negative radius (should throw exception if handled)
        });

    }

      @Test
    void testNegativeRadiusArea(){

        assertThrows(IllegalArgumentException.class, () -> {
            CircleCalculator.calculateArea(-1); // Negative radius (should throw exception if handled)
        });
    }


     @Test
    void testLargeRadiusPerimeter(){
        assertEquals(6.283185307179586E16, CircleCalculator.calculatePerimeter(1E15));  // Very Large Radius

    }


      @Test
    void testLargeRadiusArea(){
        assertEquals(3.141592653589793E30, CircleCalculator.calculateArea(1E15));  // Very Large Radius
    }

}
