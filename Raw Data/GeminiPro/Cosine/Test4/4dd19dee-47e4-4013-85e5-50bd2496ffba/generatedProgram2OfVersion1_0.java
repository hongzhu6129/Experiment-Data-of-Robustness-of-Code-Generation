import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculationsTest {

    @Test
    void testStandardCase() {
        double radius = 7.5;
        double expectedPerimeter = 47.12388980384689;
        double expectedArea = 176.71458676442586;
        CircleCalculations cc = new CircleCalculations(); // Assuming you've adapted the class to have methods for area/perimeter
        assertEquals(expectedPerimeter, cc.calculatePerimeter(radius), 0.0001);  // Delta for tolerance
        assertEquals(expectedArea, cc.calculateArea(radius), 0.0001);
    }

    @Test
    void testZeroRadius() {
        // ... (similar structure as above)
    }

    @Test
    void testNegativeRadius(){
        assertThrows(IllegalArgumentException.class, () -> {
           new CircleCalculations().calculateArea(-5); // Example using lambda expression 
        });

    }


    // ... other test cases
}
