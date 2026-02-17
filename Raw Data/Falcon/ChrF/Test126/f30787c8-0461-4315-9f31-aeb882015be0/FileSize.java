import java.io.File;

public class FileSize {

    public static void main(String[] args) {
        String[] filePaths = { "/home/students/abc.txt", "/home/students/test.txt" }; // Array of file paths

        for (String filePath : filePaths) {
            File file = new File(filePath);

            if (file.exists()) {
                long fileSizeInBytes = file.length();
                System.out.println(filePath + ": " + fileSizeInBytes + " bytes");
            } else {
                System.out.println(filePath + ": File not found.");
            }
        }
    }
}
