import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckPathType {

    public static void main(String[] args) {
        // Example usage:  You can provide the path as a command-line argument
        //                 or directly within the code as shown below.

        // Method 1: Get path from command-line arguments
        if (args.length > 0) {
            checkPath(args[0]);  // Check the first argument provided
        } else {
            System.out.println("Please provide a pathname as a command-line argument.");
        }

        // Method 2: Hardcoded path (for demonstration)
        String examplePath1 = "/path/to/your/directory"; // Replace with a real directory
        String examplePath2 = "/path/to/your/file.txt";  // Replace with a real file


        checkPath(examplePath1);
        checkPath(examplePath2);

        // Method 3: Using Path object 
        Path path1 = Paths.get(examplePath1);
        Path path2 = Paths.get(examplePath2);

        checkPath(path1);
        checkPath(path2);



    }


    private static void checkPath(String pathString) {
        File file = new File(pathString);
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println(pathString + " is a directory.");
            } else if (file.isFile()) {
                System.out.println(pathString + " is a file.");
            }
        } else {
            System.out.println(pathString + " does not exist.");
        }
    }

    // Overloaded method to handle Path objects directly
    private static void checkPath(Path path) {
        if (Files.exists(path)) { // More robust check, handles symbolic links better
            if (Files.isDirectory(path)) {
                System.out.println(path + " is a directory.");
            } else if (Files.isRegularFile(path)) { // Use isRegularFile to specifically check for files (not symbolic links etc.)
                System.out.println(path + " is a file.");
            } else {
                System.out.println(path + " exists but is not a regular file or directory (e.g., could be a symbolic link).");
            }
        } else {
            System.out.println(path + " does not exist.");
        }
    }




}
