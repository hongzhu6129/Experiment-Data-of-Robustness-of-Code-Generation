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

        // Using java.nio.file.Files (Preferred in modern Java)
        Path path = Paths.get(pathname);

        if (Files.exists(path)) {  // Check if the path exists
            if (Files.isDirectory(path)) {
                System.out.println(pathname + " is a directory.");
            } else if (Files.isRegularFile(path)) {
                System.out.println(pathname + " is a file.");
            } else {
                System.out.println(pathname + " is neither a file nor a directory (could be a symbolic link, etc.).");
            }
        } else {
            System.out.println(pathname + " does not exist.");
        }


        // Using java.io.File (Older approach, still works)
        /*
        File file = new File(pathname);

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println(pathname + " is a directory.");
            } else if (file.isFile()) {
                System.out.println(pathname + " is a file.");
            } else {
                System.out.println(pathname + " is neither a file nor a directory.");
            }
        } else {
            System.out.println(pathname + " does not exist.");
        }
        */
    }
}
