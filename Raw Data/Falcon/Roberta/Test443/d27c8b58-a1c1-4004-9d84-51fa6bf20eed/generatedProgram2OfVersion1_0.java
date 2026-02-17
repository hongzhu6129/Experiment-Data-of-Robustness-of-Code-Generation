import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SameRightmostDigitTest {

    @Test
    void testPositiveCase() {
        assertTrue(SameRightmostDigit.function(22, 32, 45));
    }

    @Test
    void testNegativeCase() {
        assertFalse(SameRightmostDigit.function(1, 2, 3));
    }

    // Add more test cases as needed...
}
