import java.io.File;

public class CheckFileExists {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java CheckFileExists <pathname>");
            System.exit(1); // Exit with an error code
        }

        String pathname = args[0];
        File file = new File(pathname);

        if (file.exists()) {
            System.out.println(pathname + " exists.");

            if (file.isFile()) {
                System.out.println(pathname + " is a file.");
            } else if (file.isDirectory()) {
                System.out.println(pathname + " is a directory.");
            }
        } else {
            System.out.println(pathname + " does not exist.");
        }
    }
}
