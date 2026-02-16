@Test
public void testInvalidFormat() {
    // Example of an invalid format string
    String invalidFormat = "yyyy/MM/dd HH:mm:ss.SSSSSS"; // Too many milliseconds

    try {
        CurrentDateTime.getCurrentDateTime(invalidFormat);
        fail("Expected an exception for invalid format, but none was thrown");
    } catch (java.time.format.DateTimeParseException e) {
        // Expected exception - test passes. You can add more specific checks if necessary
        // e.g., assertEquals("...", e.getMessage());
    }
}

