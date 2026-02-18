public class StringToByteArray {

    public static void main(String[] args) {
        // Sample String
        String sampleString = "Hello, World!";

        // Method 1: Using getBytes() with default charset
        byte[] byteArray1 = sampleString.getBytes();
        System.out.println("Byte array using default charset:");
        printByteArray(byteArray1);


        // Method 2: Using getBytes() with specified charset (UTF-8)
        try {
            byte[] byteArray2 = sampleString.getBytes("UTF-8");
            System.out.println("\nByte array using UTF-8 charset:");
            printByteArray(byteArray2);
        } catch (java.io.UnsupportedEncodingException e) {
            System.err.println("UTF-8 encoding not supported!");  // Should not happen in practice
        }

        // Method 3:  Demonstrating character encoding issues (Latin-1) - for educational purposes
        try {
            String stringWithSpecialChars = "H�llo, W�rld!"; // Characters outside basic ASCII
            byte[] byteArrayLatin1 = stringWithSpecialChars.getBytes("ISO-8859-1"); // Latin-1 (ISO-8859-1)
            System.out.println("\nByte array using Latin-1 charset (demonstrating encoding):");
            printByteArray(byteArrayLatin1);

            // Converting back to String - important to use the same charset!
            String recoveredString = new String(byteArrayLatin1, "ISO-8859-1");
            System.out.println("Recovered String (using Latin-1): " + recoveredString);



            // Illustrating encoding issues: if we try to decode with a different charset:
            String incorrectlyDecoded = new String(byteArrayLatin1, "UTF-8");  // Incorrect charset
            System.out.println("Incorrectly decoded String (using UTF-8 on Latin-1 bytes): " + incorrectlyDecoded); // Gibberish


        } catch (java.io.UnsupportedEncodingException e) {
            System.err.println("Encoding not supported!");
        }


    }

    // Helper function to print byte array contents
    public static void printByteArray(byte[] byteArray) {
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();


        // Also print as hex for clarity (especially for non-printable characters)
        System.out.print("Hex: ");
        for (byte b : byteArray) {
            System.out.printf("%02X ", b); // 2-digit hex with leading zero
        }
        System.out.println();
    }
}
