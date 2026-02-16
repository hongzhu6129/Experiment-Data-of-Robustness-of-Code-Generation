import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLastModifiedDate {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the file path as a command-line argument.");
            return;
        }

        String filePath = args[0];

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }

        try {
            // Method 1: Using BasicFileAttributes (preferred for more detailed info)
            BasicFileAttributes attributes = Files.readAttributes(Paths.get(filePath), BasicFileAttributes.class);
            FileTime lastModifiedTime = attributes.lastModifiedTime();
            
             //Convert to a Date object for easier formatting if needed.
             Date lastModifiedDate = new Date(lastModifiedTime.toMillis());

            //  Method 2: Using File.lastModified() (simpler, but less info)
            // long lastModifiedMillis = file.lastModified(); 
            // Date lastModifiedDate = new Date(lastModifiedMillis);



            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // Customize the format as needed
            String formattedDate = dateFormat.format(lastModifiedDate);


            System.out.println("Last Modified Date (using BasicFileAttributes): " + formattedDate);

             // Method 2 output: Less versatile, but works if you just want the milliseconds.
            // System.out.println("Last Modified Date (using file.lastModified()): " + lastModifiedDate);
            



        } catch (IOException e) {
            System.err.println("Error reading file attributes: " + e.getMessage());
        }
    }
}


