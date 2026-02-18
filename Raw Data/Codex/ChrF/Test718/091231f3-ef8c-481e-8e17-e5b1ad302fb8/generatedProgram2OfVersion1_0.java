import org.junit.Test;
import static org.junit.Assert.*;

public class AznableTest {

    @Test
    public void testAznable() {
        assertEquals(1, Aznable.aznable(0));
        assertEquals(1, Aznable.aznable(1));
        assertEquals(120, Aznable.aznable(5));
        assertEquals(3628800, Aznable.aznable(10));
        assertEquals(1, Aznable.aznable(-1));
        assertEquals(1, Aznable.aznable(-5));
        assertEquals(2147483647, Aznable.aznable(2147483647));
    }
}
