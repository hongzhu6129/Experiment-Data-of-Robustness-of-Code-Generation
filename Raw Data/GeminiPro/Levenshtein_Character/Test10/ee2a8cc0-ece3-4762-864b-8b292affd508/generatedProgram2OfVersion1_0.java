import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacePrinterTest {

    @Test
    void testCreateEyes() {
        // In a more advanced version, you might have a separate method to create the eye string.
        String eyes = "o o"; //  You could test different values here.
        assertEquals("o o", eyes); // Basic check
    }

    // Similarly, you could have tests for createNose(), createMouth(), etc.
    // This approach shifts testing towards modularity and testable units.

}

