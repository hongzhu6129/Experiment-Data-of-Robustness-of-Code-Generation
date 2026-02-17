import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HexagonAreaTest {

    @Test
    void testPositiveSide() {
        assertEquals(64.9519052838329, HexagonArea.computeHexagonArea(5), 0.0001);
    }

    @Test
    void testZeroSide() {
        assertThrows(IllegalArgumentException.class, () -> HexagonArea.computeHexagonArea(0));
    }

    @Test
    void testNegativeSide() {
         assertThrows(IllegalArgumentException.class, () -> HexagonArea.computeHexagonArea(-2));
    }

    // ... more tests for other corner cases
}
