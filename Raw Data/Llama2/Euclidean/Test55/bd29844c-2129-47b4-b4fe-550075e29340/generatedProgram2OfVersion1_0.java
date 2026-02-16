import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenNumberCheckerTest {

    @Test
    void testIsEvenPositiveEven() {
        assertTrue(EvenNumberChecker.isEven(10));
    }

    @Test
    void testIsEvenPositiveOdd() {
        assertFalse(EvenNumberChecker.isEven(7));
    }

    // ... add tests for all the other cases listed in the table above ...
    @Test
    void testIsEvenZero() {
        assertTrue(EvenNumberChecker.isEven(0));
    }

     @Test
    void testIsEvenNegativeEven() {
        assertTrue(EvenNumberChecker.isEven(-8));
    }


    @Test
    void testIsEvenLargePositiveEven() {
        assertTrue(EvenNumberChecker.isEven(Integer.MAX_VALUE - 1));
    }
    // ... more tests

}
