import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartAverageTest {

    @Test
    void testNormalCase1() {
        assertEquals(20.0, PartAverage.calculatePartAverage(10, 20, 30));
    }

    @Test
    void testEdgeCaseZeros() {
        assertEquals(0.0, PartAverage.calculatePartAverage(0, 0, 0));
    }

    @Test
    void testCornerCaseNaN(){
        assertEquals(Double.NaN, PartAverage.calculatePartAverage(Double.NaN, 10, 20));
    }


    // Add more test cases here following the same pattern...
}
