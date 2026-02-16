// Hypothetical example with a smiling face variation:
public static void printSmilingFace() {
    System.out.println("  +\"\"\"\"+ ");
    System.out.println("[| o o |]");
    System.out.println(" |  ^  | ");
    System.out.println(" |  _  | "); // Smile!
    System.out.println(" +-----+ ");
}

// In a JUnit test (conceptual example - requires JUnit and output capturing):
@Test
public void testSmilingFace() {
    // ... (Output capturing setup)
    printSmilingFace();
    // ... (Assert that the captured output contains the expected smiling face string)
}
