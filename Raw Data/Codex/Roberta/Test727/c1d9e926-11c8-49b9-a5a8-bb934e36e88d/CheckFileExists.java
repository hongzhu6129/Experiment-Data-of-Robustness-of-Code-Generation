import java.io.File;

public class CheckFileExists {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CheckFileExists <pathname>");
            return;
        }

        String pathname = args[0];
        File file = new File(pathname);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println(pathname + " exists and is a file.");
            } else if (file.isDirectory()) {
                System.out.println(pathname + " exists and is a directory.");
            }
        } else {
            System.out.println(pathname + " does not exist.");
        }


        // Illustrating other useful File methods:

        if(file.exists()) { // Check if exists before using other methods
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Absolute Path: " + file.getAbsolutePath());

            if(file.isFile()) {
                System.out.println("File size: " + file.length() + " bytes");
            }
         }
    }
}
