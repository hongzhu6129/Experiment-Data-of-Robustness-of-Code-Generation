import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NNNTest {

    @Test
    void testCalculateNNN_validInput() {
        assertEquals(123, NNN.calculateNNN(1));
        assertEquals(615, NNN.calculateNNN(5));
        assertEquals(1107, NNN.calculateNNN(9));  // largest single digit
        assertEquals(0, NNN.calculateNNN(0));   // smallest single digit

    }

    @Test
    void testCalculateNNN_invalidInput() {
        assertThrows(IllegalArgumentException.class, () -> NNN.calculateNNN(-1));
        assertThrows(IllegalArgumentException.class, () -> NNN.calculateNNN(10));
    }
}
