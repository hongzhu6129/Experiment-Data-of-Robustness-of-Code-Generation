import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileToByteArray {

    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt"; // Replace with the actual file path

        try {
            byte[] fileBytes = readFile(filePath);

            if (fileBytes != null) {
                System.out.println("File contents successfully read into byte array.");
                // Process the byte array as needed
                // For example, print the bytes:
                // for (byte b : fileBytes) {
                //     System.out.print(b + " ");
                // }
            }


        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }


    private static byte[] readFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            return null;
        }

        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[(int) file.length()]; // Create a byte array with the file size
            int bytesRead = fis.read(buffer); // Read file contents into the byte array

            if (bytesRead == -1) {  // Check for end of file or errors
                System.err.println("Error reading file contents."); // Handle the error if needed
                return null;
            }

            return buffer;
        }
    }
}


