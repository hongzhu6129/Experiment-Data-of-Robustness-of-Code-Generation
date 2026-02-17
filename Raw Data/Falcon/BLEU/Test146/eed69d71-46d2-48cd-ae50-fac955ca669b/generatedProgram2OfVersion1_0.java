import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testCalculateArea_normalCase() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.calculateArea());
    }

    @Test
    void testCalculatePerimeter_normalCase() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30, rectangle.calculatePerimeter());
    }

    // Add more test methods for other cases (zero length, zero width, negative values, etc.)
    @Test
    void testCalculateArea_zeroLength() {
        Rectangle rectangle = new Rectangle(0, 10);
        assertEquals(0, rectangle.calculateArea());
    }
      @Test
    void testInvalidInput(){

        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10)); // Negative length
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -10)); // Negative width
    } // Example using assertions

 // ... More test cases


}
