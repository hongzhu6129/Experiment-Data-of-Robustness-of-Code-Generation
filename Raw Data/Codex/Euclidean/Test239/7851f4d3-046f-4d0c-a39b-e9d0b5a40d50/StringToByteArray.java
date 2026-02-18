public class StringToByteArray {

    public static void main(String[] args) {

        String str = "Hello, World!";

        // Method 1: Using getBytes() with default charset
        byte[] byteArray1 = str.getBytes();
        System.out.println("Byte array (default charset): " + byteArrayToString(byteArray1));


        // Method 2: Using getBytes() with specified charset (e.g., UTF-8)
        try {
            byte[] byteArray2 = str.getBytes("UTF-8");
            System.out.println("Byte array (UTF-8): " + byteArrayToString(byteArray2));

        } catch (java.io.UnsupportedEncodingException e) {
            System.err.println("Unsupported encoding: " + e.getMessage());
        }

         // Method 3: Using getBytes() with a Charset object (more flexible, recommended for character set handling)
        try {
            byte[] byteArray3 = str.getBytes(java.nio.charset.StandardCharsets.UTF_16); // Example: UTF-16
            System.out.println("Byte array (UTF-16): " + byteArrayToString(byteArray3));
        } catch (Exception e) { // Catching a broader exception for any potential issues
            System.err.println("Error getting bytes: " + e.getMessage());
        }




    }

    // Helper function to convert byte array to a readable string (for demonstration)
    public static String byteArrayToString(byte[] byteArray) {
        StringBuilder sb = new StringBuilder();
        for (byte b : byteArray) {
            sb.append(String.format("%02X ", b)); // Hex representation for clearer output
        }
        return sb.toString();
    }
}



