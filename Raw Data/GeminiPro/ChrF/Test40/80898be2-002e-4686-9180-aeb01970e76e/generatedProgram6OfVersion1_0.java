@Test
public void testTwoDigitYear() {
    String format = "MM/dd/yy";  // Two-digit year
    String dateTimeString = CurrentDateTime.getCurrentDateTime(format);

    // Parse back to verify the format but consider the year part
    try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        formatter.parse(dateTimeString); // No exception means format is correct syntactically
    } catch (Exception e) {
        fail("Date time string doesn't match the two-digit year format: " + e.getMessage()); 
    }
}

