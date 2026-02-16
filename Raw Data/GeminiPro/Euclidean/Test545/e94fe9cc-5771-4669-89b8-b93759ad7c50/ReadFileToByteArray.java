import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileToByteArray {

    public static void main(String[] args) {
        // Specify the path to your file
        String filePath = "path/to/your/file.txt"; // Replace with your actual file path

        try {
            File file = new File(filePath);
            byte[] fileContent = readFileToByteArray(file);

            // Print the byte array (optional - for verification)
            System.out.println("File content as byte array:");
            for (byte b : fileContent) {
                System.out.print(b + " ");
            }
            System.out.println();

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }


    private static byte[] readFileToByteArray(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()]; // Create a byte array of the file size

        int bytesRead = fis.read(buffer); // Read the file into the byte array

        if (bytesRead != file.length()) { // Check if all bytes were read successfully
            throw new IOException("Could not read entire file.");
        }

        fis.close();
        return buffer;
    }
}
