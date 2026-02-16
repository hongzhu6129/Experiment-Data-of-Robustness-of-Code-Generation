@Test
public void testStandardFormat() {
    String expectedFormat = "yyyy/MM/dd HH:mm:ss.SSS";
    String dateTimeString = CurrentDateTime.getCurrentDateTime(expectedFormat);

    // Assert that the returned string matches the expected format.  A simple way is to check if it can be parsed back:
    try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(expectedFormat);
        LocalDateTime.parse(dateTimeString, formatter); // No exception = success
    } catch (Exception e) {
        fail("Date time string doesn't match the expected format: " + e.getMessage());  // Use JUnit's fail() or similar
    }
}
