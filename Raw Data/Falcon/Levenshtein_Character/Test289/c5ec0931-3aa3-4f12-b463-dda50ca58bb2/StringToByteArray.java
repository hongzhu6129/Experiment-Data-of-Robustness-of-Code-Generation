public class StringToByteArray {

    public static void main(String[] args) {
        String str = "Hello, World!"; // Sample string

        // Method 1: Using getBytes() with default charset
        byte[] byteArray1 = str.getBytes();
        System.out.println("Byte array (default charset): " + byteArrayToString(byteArray1));

        // Method 2: Using getBytes() with specified charset (e.g., UTF-8)
        try {
            byte[] byteArray2 = str.getBytes("UTF-8");
            System.out.println("Byte array (UTF-8): " + byteArrayToString(byteArray2));
        } catch (java.io.UnsupportedEncodingException e) {
            System.err.println("Error: " + e.getMessage()); // Handle the exception
        }


        // Example using a different charset (e.g., ISO-8859-1)
        try {
            byte[] byteArray3 = str.getBytes("ISO-8859-1");
            System.out.println("Byte array (ISO-8859-1): " + byteArrayToString(byteArray3));

            // Converting back to String (important to use the same charset)
            String restoredString = new String(byteArray3, "ISO-8859-1");
            System.out.println("Restored string: " + restoredString);

        } catch (java.io.UnsupportedEncodingException e) {
            System.err.println("Error: " + e.getMessage()); // Handle the exception
        }

    }


    // Helper function to convert byte array to a readable string (for printing)
    public static String byteArrayToString(byte[] byteArray) {
        StringBuilder sb = new StringBuilder();
        for (byte b : byteArray) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }
}
