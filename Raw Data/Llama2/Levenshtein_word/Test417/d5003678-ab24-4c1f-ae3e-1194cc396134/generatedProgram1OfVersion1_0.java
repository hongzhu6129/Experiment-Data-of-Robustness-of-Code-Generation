import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListFilesAndDirectories {

    public static void main(String[] args) {
        // Get the directory path from command-line arguments or use a default
        String directoryPath = "."; // Default to current directory
        if (args.length > 0) {
            directoryPath = args[0];
        }

        // Method 1: Using java.io.File
        listUsingFile(directoryPath);

        // Method 2: Using java.nio.file (Java 7 and later - preferred for modern Java)
        listUsingNIO(directoryPath);
    }


    private static void listUsingFile(String directoryPath) {
        System.out.println("Listing using java.io.File:");
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] filesAndDirs = directory.listFiles(); // Returns null if an error occurs

            if (filesAndDirs != null) {  // Handle potential null if directory is inaccessible
                 for (File fileOrDir : filesAndDirs) {
                    System.out.println(fileOrDir.getName());
                }
            } else {
                System.err.println("Error accessing directory: " + directoryPath);
            }


        } else {
            System.err.println("Invalid directory: " + directoryPath);
        }
        System.out.println(); // Add a separator between the two methods
    }




    private static void listUsingNIO(String directoryPath) {

        System.out.println("Listing using java.nio.file:");
        Path path = Paths.get(directoryPath);

        try (Stream<Path> stream = Files.list(path)) { // Try-with-resources for automatic stream closure

            stream.forEach(filePath -> System.out.println(filePath.getFileName())); // Print file/directory name

        } catch (IOException e) {
            System.err.println("Error listing directory: " + directoryPath);
            e.printStackTrace(); // Print the exception details for debugging
        }

    }

}
