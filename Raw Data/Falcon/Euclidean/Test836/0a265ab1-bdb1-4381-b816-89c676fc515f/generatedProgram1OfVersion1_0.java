import java.io.File;

public class FilePermissions {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java FilePermissions <file_or_directory_path>");
            System.exit(1); 
        }

        String filePath = args[0];
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println(filePath + " does not exist.");
            return;
        }

        String type = file.isDirectory() ? "Directory" : "File";

        System.out.println(type + ": " + filePath);

        if (file.canRead()) {
            System.out.println("  Readable: Yes");
        } else {
            System.out.println("  Readable: No");
        }

        if (file.canWrite()) {
            System.out.println("  Writable: Yes");
        } else {
            System.out.println("  Writable: No");
        }
    }
}
