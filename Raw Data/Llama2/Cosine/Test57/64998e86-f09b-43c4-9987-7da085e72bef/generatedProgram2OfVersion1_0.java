import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenNumberCheckerTest {

    @Test
    public void testIsEven() {
        assertTrue(EvenNumberChecker.isEven(10));
        assertFalse(EvenNumberChecker.isEven(7));
        assertTrue(EvenNumberChecker.isEven(0));
        assertTrue(EvenNumberChecker.isEven(-12));
        // Add more tests here...
    }
}
