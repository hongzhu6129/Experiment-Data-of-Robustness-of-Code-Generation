import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ProductOfTwoNumbersTest {

    @Test
    void testPositiveNumbers() {
        testProduct(5, 10, 50);
    }

    @Test
    void testNegativeAndPositive() {
        testProduct(-3, 7, -21);
    }
    // ... add tests for all your test cases

    @Test
    void testLargeNumbers() {
       testProduct(100000, 100000, 10000000000L); // The L makes it a long literal
    }

    @Test
    void testOverflow() {
       testProduct(9223372036854775807L, 2, -2);
    }

     private void testProduct(long num1, long num2, long expected) {
        String input = num1 + "\n" + num2 + "\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        ProductOfTwoNumbers.main(new String[0]);

        String actualOutput = out.toString().trim();
        assertTrue(actualOutput.contains("The product of " + num1 + " and " + num2 + " is: " + expected));  // Use assertTrue and contains to be flexible with output formatting
        System.setIn(System.in); // Restore System.in
        System.setOut(System.out);
    }
}
