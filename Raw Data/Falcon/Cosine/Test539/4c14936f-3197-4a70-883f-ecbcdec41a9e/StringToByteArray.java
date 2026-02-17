public class StringToByteArray {

    public static void main(String[] args) {

        // Sample string
        String sampleString = "Hello, World!";

        // Method 1: Using getBytes() with default charset
        byte[] byteArray1 = sampleString.getBytes();
        System.out.println("Byte array (default charset): " + bytesToHex(byteArray1));

        // Method 2: Using getBytes() with specified charset (UTF-8)
        try {
            byte[] byteArray2 = sampleString.getBytes("UTF-8");
            System.out.println("Byte array (UTF-8): " + bytesToHex(byteArray2));

            // Method 3:  Using getBytes() with specified charset (UTF-16) - For demonstration
            byte[] byteArray3 = sampleString.getBytes("UTF-16");
            System.out.println("Byte array (UTF-16): " + bytesToHex(byteArray3));


        } catch (java.io.UnsupportedEncodingException e) {
            System.err.println("Unsupported character encoding: " + e.getMessage());
        }



        explainCharsets();


    }

    // Helper function to convert byte array to hex string for easy readability
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }

    private static void explainCharsets(){
        System.out.println("\nExplanation of Character Sets (Charsets):");
        System.out.println("----------------------------------------");
        System.out.println("A character set (charset) defines a mapping between characters (like letters, numbers, symbols) and their numerical representation (bytes).");
        System.out.println("Different charsets use different mappings.  This is why specifying the charset is crucial, especially when dealing with text that contains characters outside the basic ASCII range.");
        System.out.println("\nExamples:");
        System.out.println("- UTF-8: A variable-length encoding that can represent characters from most of the world's languages. Commonly used for web pages and data exchange.");
        System.out.println("- UTF-16:  A variable-length encoding that is well-suited for representing characters from various writing systems.  Java's internal string representation uses UTF-16.");
        System.out.println("- ISO-8859-1: A single-byte encoding that covers Western European languages. "); //Limited character support.

        System.out.println("\nImportant Note:");
        System.out.println("When converting a String to a byte array using getBytes() without specifying a charset, the JVM's default charset is used.  This default charset can vary depending on the system's locale and configuration, which can lead to unexpected results when transferring or processing data across different systems. Therefore, always specify the desired charset when converting between Strings and byte arrays for better portability and consistency.");
    }
}
