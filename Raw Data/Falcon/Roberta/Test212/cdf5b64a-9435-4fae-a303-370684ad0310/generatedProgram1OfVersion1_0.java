public static String getSubstring(String str, int start, int end) {
    // Check if the start and end positions are valid
    if (start < 0 || end < 0 || start >= str.length() || end > str.length()) {
        throw new IllegalArgumentException("Invalid start or end positions");
    }
    // Check if the start position is before the end position
    if (start > end) {
        throw new IllegalArgumentException("Start position must be before end position");
    }
    // Return the substring
    return str.substring(start, end);
}
