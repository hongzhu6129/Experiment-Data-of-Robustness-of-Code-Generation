import java.io.File;

public class FileSize {

    public static long getFileSize(String filePath) {
        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            return -1; // Return -1 to indicate file not found or not a regular file
        }

        return file.length();
    }

    public static void main(String[] args) {
        // Test cases
        String[] filePaths = {
                "/home/students/abc.txt",
                "/home/students/test.txt",
                "nonexistent_file.txt",
                "/path/to/a/directory", // Test with a directory
                "", // Empty file path
                null // Null file path
                , "/home/students/large_file.txt" // A potentially very large file (handle potential overflow)
        };



        for (String filePath : filePaths) {
            long size = getFileSize(filePath);

             if (size == -1) {
                 System.out.println(filePath == null ? "null" : filePath + " : File not found or not a regular file");

             } else {
                 System.out.println(filePath == null ? "null" : filePath + " : " + size + " bytes");
             }

        }


        //Create test files (for demonstration/testing)
         try {
             File largeFile = new File("/home/students/large_file.txt");  // Replace with your desired path

             if (largeFile.createNewFile()) {
                 System.out.println("File created: " + largeFile.getAbsolutePath());
             } else {
                 System.out.println("File already exists.");
             }


         } catch (Exception e) {
             System.err.println("Error creating large file: " + e.getMessage());
         }
    }
}
