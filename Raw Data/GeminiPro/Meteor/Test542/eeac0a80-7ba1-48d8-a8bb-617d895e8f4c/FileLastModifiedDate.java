import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLastModifiedDate {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Please provide the file path as a command-line argument.");
            return;
        }

        String filePath = args[0];

        try {
            // Method 1: Using java.io.File
            File file = new File(filePath);
            if (!file.exists()) {
                System.err.println("File not found: " + filePath);
                return;
            }
            long lastModified = file.lastModified();
            Date lastModifiedDate = new Date(lastModified);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(lastModifiedDate);
            System.out.println("Last Modified Date (using java.io.File): " + formattedDate);

            // Method 2: Using java.nio.file.Files (preferred for more attributes)
            BasicFileAttributes attributes = Files.readAttributes(Paths.get(filePath), BasicFileAttributes.class);
            lastModified = attributes.lastModifiedTime().toMillis();  // More precise, can handle nanoseconds
            lastModifiedDate = new Date(lastModified);
            formattedDate = sdf.format(lastModifiedDate); // Reusing the SimpleDateFormat object
            System.out.println("Last Modified Date (using java.nio.file.Files): " + formattedDate);



        } catch (IOException e) {
            System.err.println("Error accessing file: " + e.getMessage());
        }

    }
}
