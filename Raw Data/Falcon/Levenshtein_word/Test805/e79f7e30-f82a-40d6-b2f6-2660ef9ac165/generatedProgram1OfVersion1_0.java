import java.nio.charset.Charset;
import java.util.SortedMap;

public class ListAvailableCharsets {

    public static void listCharsets() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("Available Character Sets:");
        for (String charsetName : charsets.keySet()) {
            Charset charset = charsets.get(charsetName);
            System.out.println(charsetName + " (aliases: " + charset.aliases() + ")");
        }
    }

    public static void main(String[] args) {
        listCharsets();
    }
}


// Test Cases

// Test case 1: Verify that common charsets are listed.  (Positive test)
// Expected output: Should include charsets like UTF-8, UTF-16, US-ASCII, ISO-8859-1, etc.

// Test case 2: Run on different platforms (Windows, Linux, macOS). (Compatibility Test)
// Expected output:  The list of available charsets might vary slightly across platforms due to OS differences.  The core charsets should remain consistent.

// Test case 3: Verify that charset aliases are displayed correctly (Positive Test)
// Expected output:  Charsets like "UTF8" (an alias for "UTF-8") should be listed alongside their canonical names.  The output format should clearly show the relationship (e.g. UTF-8 (aliases: [UTF8, ...]).

// Test case 4: Check for empty charset map (Highly unlikely, negative test, checks robustness).
// Create a mock/stub environment (if possible - this is advanced) where Charset.availableCharsets() returns an empty map. (This is to test the program's handling of an unexpected return). This might require using tools like PowerMock to mock static methods.
// Expected Output: "Available Character Sets:" followed by no output, or a user-friendly message indicating no charsets are available.



// Example of a (simplified) test using JUnit and Mockito (demonstrates the concept; doesn't actually mock the static method � see comments above about PowerMock for that).


import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.SortedMap;

import static org.junit.jupiter.api.Assertions.*;


// This example shows a very basic test.  A more comprehensive test would check the actual output to the console (using System.setOut() to capture output).
public class ListAvailableCharsetsTest {




    @Test // This test won't effectively mock the static method.  Demonstrative only.
    void testEmptyCharsetMap() {
        // In a real test using PowerMock, you would mock Charset.availableCharsets() here.
        SortedMap<String, Charset> emptyMap = Collections.emptySortedMap();  // Simulate empty map


        // ... (logic to redirect System.out, and call listCharsets() )...

        // Assertions would check that an appropriate message was printed or that no charsets were printed.
    }

    @Test
    public void testUTF8Present() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        assertTrue(charsets.containsKey("UTF-8"), "UTF-8 should be present."); // A basic assertion
    }



}



