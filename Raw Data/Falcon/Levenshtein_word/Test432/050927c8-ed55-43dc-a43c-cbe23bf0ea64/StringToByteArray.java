public class StringToByteArray {

    public static void main(String[] args) {
        String str = "This is a sample string.";

        // Method 1: Using getBytes() with default charset
        byte[] byteArray1 = str.getBytes();
        System.out.print("Byte array (default charset): ");
        for (byte b : byteArray1) {
            System.out.print(b + " ");
        }
        System.out.println();


        // Method 2: Using getBytes() with specified charset (e.g., UTF-8)
        try {
            byte[] byteArray2 = str.getBytes("UTF-8");
            System.out.print("Byte array (UTF-8): ");
            for (byte b : byteArray2) {
                System.out.print(b + " ");
            }
            System.out.println();

        } catch (java.io.UnsupportedEncodingException e) {
            System.err.println("Unsupported character encoding: " + e.getMessage());
        }


        //More descriptive output (optional - just for demonstration)
        System.out.println("\nMore descriptive output (UTF-8):");
        try {
             byte[] byteArray3 = str.getBytes("UTF-8");
             for (byte b : byteArray3) {
                 System.out.println(b + " represents character: " + (char)b);  // Cast to char for better readability. Important:  This might not always produce the expected character for multi-byte characters like those in UTF-8.
             }


        } catch (java.io.UnsupportedEncodingException e) {
            System.err.println("Unsupported character encoding: " + e.getMessage());
        }

    }
}
