import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DivisibleBy3And5Test {

    @Test
    void testStandardCase() {
        // Capture system output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        DivisibleBy3And5.printDivisibleNumbers(1, 100);

        String expectedOutput = // Add your expected output here...
        assertTrue(outContent.toString().contains("15")); //Example assertion
        // ...More assertions...

        // Restore system output
        System.setOut(System.out);
    }

    // ... More test methods for other cases ...

}

