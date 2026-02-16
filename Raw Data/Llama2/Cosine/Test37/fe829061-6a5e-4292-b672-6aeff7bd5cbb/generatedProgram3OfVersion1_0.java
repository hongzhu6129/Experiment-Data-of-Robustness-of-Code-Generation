import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testCalculateArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.calculateArea());
    }

    // ... Add more test methods for other test cases

    @Test
    void testNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10));
    }
    //..Add more test cases for negative width and very large numbers

}

