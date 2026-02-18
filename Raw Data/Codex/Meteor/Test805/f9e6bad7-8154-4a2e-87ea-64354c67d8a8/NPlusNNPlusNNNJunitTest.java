import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NPlusNNPlusNNNJunitTest {

    @Test
    void testPositiveSingleDigit() {
        assertEquals(615, NPlusNNPlusNNN.calculateSum(5));
    }

    @Test
    void testZero() {
        assertEquals(0, NPlusNNPlusNNN.calculateSum(0));
    }

    @Test
    void testOne() {
        assertEquals(121, NPlusNNPlusNNN.calculateSum(1));
    }

    @Test
    void testNine() {
        assertEquals(1107, NPlusNNPlusNNN.calculateSum(9));
    }


    @Test
    void testNegativeSingleDigit() {
        assertEquals(-615, NPlusNNPlusNNN.calculateSum(-5));
    }


}
