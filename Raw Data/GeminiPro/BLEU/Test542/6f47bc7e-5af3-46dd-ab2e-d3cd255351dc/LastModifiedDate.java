import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LastModifiedDate {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file path as a command-line argument.");
            return;
        }

        String filePath = args[0];

        try {
            // Method 1: Using java.io.File
            File file = new File(filePath);
            if (file.exists()) {
                long lastModified = file.lastModified();
                Date lastModifiedDate = new Date(lastModified);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // Customize date format if needed
                String formattedDate = sdf.format(lastModifiedDate);
                System.out.println("Last Modified Date (using java.io.File): " + formattedDate);


                // Method 2: Using java.nio.file (preferred for more attributes)
                Path path = Paths.get(filePath);
                BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
                FileTime lastModifiedTime = attributes.lastModifiedTime();
                long lastModifiedMillis = lastModifiedTime.toMillis();  // Get milliseconds since epoch
                Date lastModifiedDate2 = new Date(lastModifiedMillis);
                String formattedDate2 = sdf.format(lastModifiedDate2);
                System.out.println("Last Modified Date (using java.nio.file): " + formattedDate2);

            } else {
                System.out.println("File not found: " + filePath);
            }

        } catch (IOException e) {
            System.err.println("Error accessing file: " + e.getMessage());
        }
    }
}

