// In a separate test class (e.g., using JUnit)
public class TwinkleTwinkleTest {
    @Test
    public void testModifiedRhyme() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TwinkleTwinkle.printTwinkleTwinkleModified(); // Call a modified version of the function

        String expectedOutput = "Twinkle, twinkle, little star, how bright you are!\n" + // Note: Different rhyme and no tabs
                "\tUp so high, like a diamond,\n" + 
                "\tShining in the night sky.\n"; 

        assertEquals(expectedOutput, outContent.toString());
        System.setOut(System.out); // Restore standard output
    }
}

