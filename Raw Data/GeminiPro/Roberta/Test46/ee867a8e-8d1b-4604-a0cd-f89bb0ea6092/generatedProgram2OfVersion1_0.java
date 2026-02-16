import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SameRightmostDigitTest {

    @Test
    void testSameRightmostDigit() {
        assertTrue(SameRightmostDigit.hasSameRightmostDigit(23, 32, 43));
        assertTrue(SameRightmostDigit.hasSameRightmostDigit(10, 20, 30));
        assertFalse(SameRightmostDigit.hasSameRightmostDigit(1, 2, 3));
        assertTrue(SameRightmostDigit.hasSameRightmostDigit(17, 27, 37));
        assertFalse(SameRightmostDigit.hasSameRightmostDigit(100, 200, 301));
        assertTrue(SameRightmostDigit.hasSameRightmostDigit(0, 0, 0));
        assertTrue(SameRightmostDigit.hasSameRightmostDigit(1, 11, 21));
        assertTrue(SameRightmostDigit.hasSameRightmostDigit(99,9,19));
        assertThrows(IllegalArgumentException.class, () -> SameRightmostDigit.hasSameRightmostDigit(-5, 10, 15));


    }
}
