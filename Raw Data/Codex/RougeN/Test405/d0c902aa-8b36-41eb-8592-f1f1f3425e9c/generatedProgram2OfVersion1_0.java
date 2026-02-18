import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest {

    @Test
    public void testSumOfDigits() {
        assertEquals(15, SumOfDigits.function(12345));
        assertEquals(0, SumOfDigits.function(0));
        assertEquals(6, SumOfDigits.function(-123));
        // ... add more test cases
    }
}
