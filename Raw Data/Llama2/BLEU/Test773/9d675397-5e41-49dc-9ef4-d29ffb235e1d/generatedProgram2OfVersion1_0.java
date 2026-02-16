import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NNNTest {

    @Test
    void testCalculateNNN_positiveSingleDigit() {
        assertEquals(615, NNN.calculateNNN(5));
    }

    @Test
    void testCalculateNNN_closeToOverflow() {
      assertEquals(236223198646214764L, NNN.calculateNNN(214748364));
    }

   // Add more tests here....
}
