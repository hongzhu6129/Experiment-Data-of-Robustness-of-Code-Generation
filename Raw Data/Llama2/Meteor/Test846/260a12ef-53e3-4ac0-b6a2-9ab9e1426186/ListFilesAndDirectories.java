import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListFilesAndDirectories {

    public static void main(String[] args) {
        // Get the directory path from command-line arguments.  Defaults to current directory if no argument is provided.
        String directoryPath = ".";  // Default to current directory
        if (args.length > 0) {
            directoryPath = args[0];
        }

        try {
            List<String> fileAndDirectoryNames = listFileAndDirectoryNames(directoryPath);
            for (String name : fileAndDirectoryNames) {
                System.out.println(name);
            }
        } catch (IOException e) {
            System.err.println("Error listing files and directories: " + e.getMessage());
        }
    }


    private static List<String> listFileAndDirectoryNames(String directoryPath) throws IOException {
        List<String> names = new ArrayList<>();

        // Use try-with-resources for automatic resource management
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(directoryPath))) { 
            for (Path path : stream) {
                names.add(path.getFileName().toString()); // Get just the file/directory name
            }
        }
        return names;

        /*  Alternative using File class (less efficient, handles symbolic links differently):

        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] filesAndDirectories = directory.listFiles();  // Can return null!
            if (filesAndDirectories != null) { // Check for null in case of error
                 for (File file : filesAndDirectories) {
                    names.add(file.getName());
                }
            } else {
                System.err.println("Error reading directory contents (listFiles returned null). Check permissions or if the path is valid."); // More informative error message
                //  You may want to throw an exception or return an empty list depending on your needs.
            }
        } else {
            System.err.println("Invalid directory path: " + directoryPath);
            //  You may want to throw an exception or return an empty list depending on your needs.
        }
        return names; */


    }
}
