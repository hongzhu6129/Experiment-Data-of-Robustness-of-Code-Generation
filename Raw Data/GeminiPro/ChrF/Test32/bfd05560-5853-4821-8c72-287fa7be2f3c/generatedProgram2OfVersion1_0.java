import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CharacterCounterTest {

    private String runTest(String input) {  // Helper function to run the program with specific input
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));


        CharacterCounter.main(new String[0]); // Run main method

        System.setIn(System.in); // Restore System.in
        System.setOut(System.out); // Restore System.out

        return outContent.toString(); // Return program's output as String
    }


    @Test
    void testNormalCase() {
        String output = runTest("aa kiu, i swd skieo 236587.\n");
        assertTrue(output.contains("Letters: 16"));
        assertTrue(output.contains("Spaces: 5"));
        assertTrue(output.contains("Numbers: 6"));
        assertTrue(output.contains("Other characters: 2"));
    }


    // Add more @Test methods for the other test cases...
    // ... (See examples in the previous section how to structure the tests)
    
}
