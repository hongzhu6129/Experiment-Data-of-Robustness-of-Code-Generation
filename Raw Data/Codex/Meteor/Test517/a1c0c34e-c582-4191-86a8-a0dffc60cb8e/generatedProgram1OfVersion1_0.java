import java.io.File;

public class CheckFileExists {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CheckFileExists <pathname>");
            return; // Exit if pathname isn't provided
        }

        String pathname = args[0];
        File file = new File(pathname);

        if (file.exists()) {
            System.out.println(pathname + " exists.");

            if (file.isDirectory()) {
                System.out.println(pathname + " is a directory.");
            } else {
                System.out.println(pathname + " is a file.");
            }
        } else {
            System.out.println(pathname + " does not exist.");
        }
    }
}
