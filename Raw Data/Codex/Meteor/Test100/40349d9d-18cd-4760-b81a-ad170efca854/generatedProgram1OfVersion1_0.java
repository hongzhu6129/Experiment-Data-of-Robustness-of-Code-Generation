import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LastModifiedDate {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the file path as a command-line argument.");
            return;
        }

        String filePath = args[0];

        try {
            // Method 1: Using java.io.File (Less preferred for file attributes)
            File file = new File(filePath);
            if (file.exists()) {
                long lastModifiedMillis = file.lastModified();
                Date lastModifiedDate = new Date(lastModifiedMillis);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // Format the date
                String formattedDate = sdf.format(lastModifiedDate);
                System.out.println("Last Modified Date (using java.io.File): " + formattedDate);


                // Method 2: Using java.nio.file.Files (Preferred for file attributes)
                FileTime lastModifiedTime = Files.getLastModifiedTime(Paths.get(filePath));
                long lastModifiedTimeMillis = lastModifiedTime.toMillis();
                Date lastModifiedDateNio = new Date(lastModifiedTimeMillis);


                String formattedDateNio = sdf.format(lastModifiedDateNio);  // Reuse the SimpleDateFormat object


                System.out.println("Last Modified Date (using java.nio.file.Files): " + formattedDateNio);



                // Method 3: More detailed attributes (using java.nio.file.Files)
                BasicFileAttributes attributes = Files.readAttributes(Paths.get(filePath), BasicFileAttributes.class);

                FileTime creationTime = attributes.creationTime();
                FileTime lastAccessTime = attributes.lastAccessTime();

                System.out.println("Creation Time: " + sdf.format(creationTime.toMillis()));
                System.out.println("Last Access Time: " + sdf.format(lastAccessTime.toMillis()));



            } else {
                System.out.println("File not found: " + filePath);
            }


        } catch (IOException e) {
            System.err.println("Error getting last modified date: " + e.getMessage());
        }
    }
}
