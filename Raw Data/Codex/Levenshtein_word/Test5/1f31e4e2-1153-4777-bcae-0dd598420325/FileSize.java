import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSize {

    public static long getFileSize(String filePath) {
        try {
            // Using Java NIO's Files.size for efficiency and handling large files
            return Files.size(Paths.get(filePath)); 
        } catch (IOException e) {
            // Handle exceptions like file not found, permissions issues, etc.
            System.err.println("Error getting file size: " + e.getMessage());
            return -1; // Return -1 to indicate an error
        }
    }


    public static void main(String[] args) {
        // Test cases
        String[] filePaths = {
                "/home/students/abc.txt", // Example empty file
                "/home/students/test.txt", // Example file (you'll need to create this)
                "nonexistent_file.txt",  // Non-existent file
                "",                       // Empty file path
                null,                    // Null file path
                "/path/to/very/large/file.txt", //  (Create a large file for testing if you can)
                "/path/to/a/directory"  // Path to a directory (not a file)
        };


        for (String filePath : filePaths) {
             long size = getFileSize(filePath);
             if (size != -1) {
                 System.out.println(filePath + ": " + size + " bytes");
             }
         }
    }
}
