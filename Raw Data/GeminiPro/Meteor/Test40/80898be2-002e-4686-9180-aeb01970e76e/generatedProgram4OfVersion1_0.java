@Test
public void testEmptyFormatString() {
    // Should ideally handle empty format strings gracefully and not crash.
    try {
        String dateTimeString = CurrentDateTime.getCurrentDateTime("");
        // Maybe assert that the returned string is empty or uses a default format?
        assertTrue(dateTimeString.isEmpty() || dateTimeString.matches(".*\\d.*")); // Check if it contains numbers

    } catch (Exception e) {
        fail("Empty format string should not cause a crash: " + e.getMessage());
    }

}

