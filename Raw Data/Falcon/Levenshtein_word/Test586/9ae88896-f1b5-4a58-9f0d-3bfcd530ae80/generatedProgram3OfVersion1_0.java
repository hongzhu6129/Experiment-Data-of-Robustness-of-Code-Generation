import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestableFacePrinterTest {

    @Test
    void testGetFaceString() {
        String expectedFace = "  +\"\"\"\"\"+\n [| o o |] \n  |  ^  | \n  | '-' | \n  +-----+";
        String actualFace = TestableFacePrinter.getFaceString();
        assertEquals(expectedFace, actualFace);
    }
}
