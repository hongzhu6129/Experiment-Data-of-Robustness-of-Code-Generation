import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAverageNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageNegativeNumbers() {
        assertEquals(0.0, AverageCalculator.calculateAverage(-5, 0, 5));
    }

    @Test
    void testCalculateAverageDecimalNumbers() {
        assertEquals(2.6666666666666665, AverageCalculator.calculateAverage(2.5, 3.7, 1.8));
    }

    // ... (Add more test methods for other test cases) ...

    @Test
    void testInvalidInput() {  // Demonstrating how to test for exceptions
        Scanner scanner = new Scanner("a b c"); // Simulate bad input
        assertThrows(java.util.InputMismatchException.class, () -> {
             double num1 = scanner.nextDouble();
             double num2 = scanner.nextDouble();
             double num3 = scanner.nextDouble();
        });
        scanner.close();
    }


}

