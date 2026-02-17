import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest {

    @Test
    void testFunctionOne() {
        assertEquals(15, SumOfDigits.functionOne(12345));
        assertEquals(0, SumOfDigits.functionOne(0));
        assertEquals(9, SumOfDigits.functionOne(9));
        assertEquals(6, SumOfDigits.functionOne(-123)); 
        assertEquals(1, SumOfDigits.functionOne(1000));
        assertEquals(36, SumOfDigits.functionOne(9999));
    }
}
