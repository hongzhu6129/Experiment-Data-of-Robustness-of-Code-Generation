public class StringToByteArray {

    public static void main(String[] args) {
        String str = "Hello, World!";

        // Method 1: Using getBytes() with default charset
        byte[] byteArray1 = str.getBytes();
        System.out.print("Byte array (default charset): ");
        printByteArray(byteArray1);

        // Method 2: Using getBytes() with specified charset (e.g., UTF-8)
        try {
            byte[] byteArray2 = str.getBytes("UTF-8");
            System.out.print("Byte array (UTF-8): ");
            printByteArray(byteArray2);

        } catch (java.io.UnsupportedEncodingException e) {
            System.err.println("Unsupported encoding: " + e.getMessage());
        }



    }

    // Helper function to print byte array contents
    public static void printByteArray(byte[] byteArray) {
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
