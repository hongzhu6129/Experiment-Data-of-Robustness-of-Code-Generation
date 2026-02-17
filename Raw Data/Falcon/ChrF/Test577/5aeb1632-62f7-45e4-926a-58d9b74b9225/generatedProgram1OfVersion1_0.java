import java.io.File;

public class FilePermissions {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java FilePermissions <file_or_directory_path>");
            System.exit(1); // Exit with an error code
        }

        String filePath = args[0];
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File or directory does not exist: " + filePath);
            return; // or System.exit(1); if you want to indicate an error
        }

        boolean canRead = file.canRead();
        boolean canWrite = file.canWrite();

        System.out.println("File/Directory: " + filePath);
        System.out.println("Read Permission: " + canRead);
        System.out.println("Write Permission: " + canWrite);


    }
}
