import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculationsTest {

    @Test
    void testPositiveRadius() {
        // ... your test code using assertions ...
        assertEquals(47.12388980384689, CircleCalculations.calculatePerimeter(7.5), 1e-10); // Example assertion
    }

    // ... other test methods for zero radius, negative radius, etc. ...
}
