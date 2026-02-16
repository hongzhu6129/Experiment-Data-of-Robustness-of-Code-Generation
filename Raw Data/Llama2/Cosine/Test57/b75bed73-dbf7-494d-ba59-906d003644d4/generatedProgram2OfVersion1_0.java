import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenNumberCheckerTest {

    @Test
    void testIsEven() {
        assertTrue(EvenNumberChecker.isEven(0));
        assertFalse(EvenNumberChecker.isEven(1));
        assertTrue(EvenNumberChecker.isEven(2));
        assertTrue(EvenNumberChecker.isEven(-2));
        assertFalse(EvenNumberChecker.isEven(-1));
        assertTrue(EvenNumberChecker.isEven(1000));
        assertTrue(EvenNumberChecker.isEven(-1000));
        assertFalse(EvenNumberChecker.isEven(Integer.MAX_VALUE));
        assertTrue(EvenNumberChecker.isEven(Integer.MIN_VALUE));

    }
}
