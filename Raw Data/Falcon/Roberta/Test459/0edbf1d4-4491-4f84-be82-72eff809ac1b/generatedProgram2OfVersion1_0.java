import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testCalculateArea_positiveValues() {
        assertEquals(15.0, Rectangle.calculateArea(5.0, 3.0));
    }

    @Test
    void testCalculatePerimeter_positiveValues() {
        assertEquals(16.0, Rectangle.calculatePerimeter(5.0, 3.0));
    }

    // Add more test methods for other cases (zero, negative, large values, etc.)
}
