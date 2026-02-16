import java.io.File;
import java.util.Arrays;

public class ListFilesAndDirectories {

    public static void main(String[] args) {
        // Specify the directory path.  Handle potential missing args.
        if (args.length == 0) {
            System.out.println("Usage: java ListFilesAndDirectories <directory_path>");
            return; // Exit if no path provided
        }

        String directoryPath = args[0];

        File directory = new File(directoryPath);

        if (!directory.exists()) {
            System.out.println("Directory '" + directoryPath + "' does not exist.");
            return; // Exit if directory doesn't exist
        }

        if (!directory.isDirectory()) {
            System.out.println("'" + directoryPath + "' is not a directory.");
            return; // Exit if it's not a directory
        }


        String[] filesAndDirectories = directory.list(); // Get the list of names


        if (filesAndDirectories != null) {    // Check for null in case of error
            Arrays.sort(filesAndDirectories); // Sort for consistent order (optional)

            System.out.println("Files and directories in '" + directoryPath + "':");
            for (String name : filesAndDirectories) {
                System.out.println(name);
            }
        } else {
            System.err.println("Error listing contents of directory."); // Handle potential I/O errors
        }

    }
}
