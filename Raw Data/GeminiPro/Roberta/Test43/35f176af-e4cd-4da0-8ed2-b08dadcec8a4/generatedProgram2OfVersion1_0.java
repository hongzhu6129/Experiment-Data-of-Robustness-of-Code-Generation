import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DivisibleBy3And5Test {

    @Test
    public void testStandardCase() {
         // ... (Similar tests for other cases)
    }



    private String getOutput(int start, int end) { // Helper function
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        DivisibleBy3And5.printDivisibleBy(3, start, end);   // Test printDivisibleBy
       // ... Call other functions you want to test...

        System.setOut(System.out); // Restore System.out
        return outputStream.toString().trim(); // Remove trailing whitespace
    }
}


