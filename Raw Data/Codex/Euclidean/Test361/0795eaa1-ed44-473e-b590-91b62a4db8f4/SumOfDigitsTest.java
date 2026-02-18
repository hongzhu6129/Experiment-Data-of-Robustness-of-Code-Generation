import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest {

    @Test
    void testSumDigits() {
        assertEquals(7, SumOfDigits.sumDigits(25));
        assertEquals(15, SumOfDigits.sumDigits(12345));
        assertEquals(0, SumOfDigits.sumDigits(0));
        assertEquals(7, SumOfDigits.sumDigits(-25));
        assertEquals(9, SumOfDigits.sumDigits(9));
        assertEquals(1, SumOfDigits.sumDigits(10));
        assertEquals(1, SumOfDigits.sumDigits(1000));
        assertEquals(29, SumOfDigits.sumDigits(Integer.MAX_VALUE));
        assertEquals(30, SumOfDigits.sumDigits(Integer.MIN_VALUE));


    }
}
