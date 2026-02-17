import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenNumberCheckerTest {

    @Test
    void testIsEven() {
        assertTrue(EvenNumberChecker.isEven(10));
        assertFalse(EvenNumberChecker.isEven(7));
        assertTrue(EvenNumberChecker.isEven(0));
        assertTrue(EvenNumberChecker.isEven(-8));
        assertFalse(EvenNumberChecker.isEven(-15));
        assertTrue(EvenNumberChecker.isEven(Integer.MAX_VALUE - 1));
        assertFalse(EvenNumberChecker.isEven(Integer.MAX_VALUE));
        assertTrue(EvenNumberChecker.isEven(Integer.MIN_VALUE));
        assertFalse(EvenNumberChecker.isEven(Integer.MIN_VALUE + 1));


    }
}
