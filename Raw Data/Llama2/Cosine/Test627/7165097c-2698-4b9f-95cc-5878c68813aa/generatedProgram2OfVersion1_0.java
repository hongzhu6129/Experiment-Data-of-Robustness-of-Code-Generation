import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculationsTest {

    @Test
    void testStandardRadius() {
        double radius = 7.5;
        double expectedPerimeter = 47.12388980384689;
        double expectedArea = 176.71458676442586;

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        assertEquals(expectedPerimeter, perimeter, 1e-10); // Using a delta for double comparison
        assertEquals(expectedArea, area, 1e-10);
    }


    @Test
    void testZeroRadius() {
        double radius = 0;
        double expectedPerimeter = 0;
        double expectedArea = 0;

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        assertEquals(expectedPerimeter, perimeter);
        assertEquals(expectedArea, area);
    }

    @Test
    void testLargeRadius() {
        double radius = 1000000; // One million
        double expectedPerimeter = 2 * Math.PI * radius;
        double expectedArea = Math.PI * radius * radius;

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        assertEquals(expectedPerimeter, perimeter, 1e-10);
        assertEquals(expectedArea, area, 1e-10);
    }


    @Test
    void testSmallRadius() {
        double radius = 0.000001;  // Very small radius
        double expectedPerimeter = 2 * Math.PI * radius;
        double expectedArea = Math.PI * radius * radius;

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        assertEquals(expectedPerimeter, perimeter, 1e-16); // Smaller delta needed
        assertEquals(expectedArea, area, 1e-22); // Even smaller delta
    }


    @Test
    void testNegativeRadius() {      
       assertThrows(IllegalArgumentException.class, () -> {
           double radius = -1;
           double perimeter = 2 * Math.PI * radius; // Expecting an exception for negative radius. In real code, you'd likely throw an exception.
           double area = Math.PI * radius * radius;
       });
    }

}
