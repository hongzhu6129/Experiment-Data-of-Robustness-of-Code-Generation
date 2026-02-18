import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LastModifiedDate {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Please provide the file path as a command-line argument.");
            return;
        }

        String filePath = args[0];
        File file = new File(filePath);

        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            return;
        }

        try {
            // Method 1: Using Java NIO's Files.getLastModifiedTime() (Simpler)
            FileTime lastModifiedTime = Files.getLastModifiedTime(file.toPath());
            long lastModifiedEpoch = lastModifiedTime.toMillis();  // Get milliseconds since epoch
            Date lastModifiedDate = new Date(lastModifiedEpoch);

            // Format the date for better readability (optional)
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = dateFormat.format(lastModifiedDate);


            System.out.println("Last Modified Date (using Files.getLastModifiedTime): " + formattedDate);



             // Method 2: Using File.lastModified() (Less preferred, but still works)
            long lastModifiedMillis = file.lastModified(); // Returns milliseconds since epoch
            Date lastModifiedDate2 = new Date(lastModifiedMillis);

            // Format the date (optional)
            String formattedDate2 = dateFormat.format(lastModifiedDate2);


            System.out.println("Last Modified Date (using File.lastModified): " + formattedDate2);


        } catch (IOException e) {
            System.err.println("Error getting last modified date: " + e.getMessage());
        }


        // Example using BasicFileAttributes (more info available)
        try {
            BasicFileAttributes attrs = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
            FileTime lastModifiedTime3 = attrs.lastModifiedTime();
            System.out.println("Last Modified Time (using BasicFileAttributes): " + lastModifiedTime3);  // Already formatted by toString()

        } catch (IOException e) {
             System.err.println("Error getting attributes: " + e.getMessage());
        }

    }
}
