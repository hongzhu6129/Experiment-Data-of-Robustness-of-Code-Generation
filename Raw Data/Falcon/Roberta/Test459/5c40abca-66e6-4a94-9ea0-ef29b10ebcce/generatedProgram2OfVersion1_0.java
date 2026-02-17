import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testCalculateArea() {
        assertEquals(50, Rectangle.calculateArea(5, 10)); // Normal case
        assertEquals(0, Rectangle.calculateArea(0, 10)); // Zero length
        assertEquals(24, Rectangle.calculateArea(7.5, 3.2)); // Floating point

       // ... add more tests ...

    }
   //Similar tests for perimeter and error handling
}
