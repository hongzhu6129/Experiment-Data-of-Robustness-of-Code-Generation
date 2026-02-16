import java.io.File;

public class CheckPathFile {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a pathname as a command-line argument.");
            return;
        }

        String pathname = args[0];
        File file = new File(pathname);

        if (file.isDirectory()) {
            System.out.println(pathname + " is a directory.");
        } else if (file.isFile()) {
            System.out.println(pathname + " is a file.");
        } else {
            System.out.println(pathname + " does not exist or is not a regular file or directory."); // More descriptive message
        }
    }
}
