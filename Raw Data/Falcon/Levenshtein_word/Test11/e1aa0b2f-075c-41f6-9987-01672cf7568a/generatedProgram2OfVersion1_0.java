import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageOfThreeTest {

    @Test
    public void testNormalCase() {
        assertEquals(20.0, AverageOfThree.calculateAverage(10, 20, 30));
    }

    @Test
    public void testZeroInput() {
        assertEquals(0.0, AverageOfThree.calculateAverage(0, 0, 0));
    }

    // Add more tests here...

}
