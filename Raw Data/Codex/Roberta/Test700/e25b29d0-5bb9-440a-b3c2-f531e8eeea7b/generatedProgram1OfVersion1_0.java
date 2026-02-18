import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetChangeTimestamp {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file path as an argument.");
            return;
        }

        String filePath = args[0];

        try {
            Path path = Paths.get(filePath);
            
            if (!Files.exists(path)) {
                System.out.println("File not found: " + filePath);
                return;
            }

            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
            FileTime lastModifiedTime = attributes.lastModifiedTime();

            // Convert FileTime to milliseconds
            long milliseconds = lastModifiedTime.toMillis();

            // Create a Date object from milliseconds
            Date date = new Date(milliseconds);

            // Format the date using a SimpleDateFormat object
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(date);

            System.out.println("Last Modified Time: " + formattedDate);



        } catch (IOException e) {
            System.err.println("Error getting file attributes: " + e.getMessage());
        }
    }
}
