@Test
public void testNullFormatString() {
    // Null should be handled without a crash.
    try {
        String dateTimeString = CurrentDateTime.getCurrentDateTime(null);

        // Determine what the behavior should be for null.  Should it throw an exception or return a default format?
        assertNull(dateTimeString); // or assertNotNull(dateTimeString);  Depending on your intended behavior

    } catch (NullPointerException e) { // or another appropriate exception type
        // Expected exception - test passes.
    }
}
