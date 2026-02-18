import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testValidInput() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(50, rect.getArea());
        assertEquals(30, rect.getPerimeter());
    }

    @Test
    void testZeroInput() {
        Rectangle rect = new Rectangle(0, 10);
        assertEquals(0, rect.getArea());
        assertEquals(20, rect.getPerimeter());
    }


    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10)); // Example of exception handling
    }


    // ... more tests for other corner cases
}
