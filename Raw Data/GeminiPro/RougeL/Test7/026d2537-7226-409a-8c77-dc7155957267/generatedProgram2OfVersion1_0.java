import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30)); // Example using a helper method
    }

    @Test
    void testNegativeAndZero() {
        assertEquals(0.0, AverageCalculator.calculateAverage(-5, 0, 5));
    }

    // Add more test cases following the same pattern

    // Helper method to make testing easier (not part of the original class)
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
