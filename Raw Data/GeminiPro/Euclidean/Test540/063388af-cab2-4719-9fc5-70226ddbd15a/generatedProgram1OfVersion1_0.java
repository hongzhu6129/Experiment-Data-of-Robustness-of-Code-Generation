import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckPath {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a pathname as a command-line argument.");
            return;
        }

        String pathname = args[0];

        try {
            Path path = Paths.get(pathname);

            if (Files.isDirectory(path)) {
                System.out.println(pathname + " is a directory.");
            } else if (Files.isRegularFile(path)) {
                System.out.println(pathname + " is a file.");
            } else {
                System.out.println(pathname + " is neither a directory nor a regular file.");
            }
        } catch (Exception e) { // Catch any potential exceptions (e.g., invalid path)
            System.err.println("Error: " + e.getMessage());
        }
    }
}
