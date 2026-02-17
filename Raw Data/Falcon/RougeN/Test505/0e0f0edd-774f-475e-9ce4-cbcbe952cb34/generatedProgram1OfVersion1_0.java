import java.io.File;

public class FilePermissionsChecker {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FilePermissionsChecker <file_or_directory_path>");
            return;
        }

        String filePath = args[0];
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File/Directory does not exist: " + filePath);
            return;
        }

        System.out.println("Checking permissions for: " + filePath);


        // Check Read Permission
        boolean readable = file.canRead();
        if (readable) {
            System.out.println("Read Permission: Granted");
        } else {
            System.out.println("Read Permission: Denied");
        }

        // Check Write Permission
        boolean writable = file.canWrite();
        if (writable) {
            System.out.println("Write Permission: Granted");
        } else {
            System.out.println("Write Permission: Denied");
        }


        //  Example of how to handle a situation where you NEED write permission:
        if (!writable) {
            System.err.println("Error: This program requires write access to " + filePath + ". Please grant write permission and try again.");
            // In a real application, you might exit the program or try to handle the lack of permissions gracefully.
        }


        //Explanatory Note:  The canExecute() method checks execute permission, which is relevant for files that can be run as programs (e.g., scripts, executables). 
        boolean executable = file.canExecute();
        if (executable) {
            System.out.println("Execute Permission: Granted");
        } else {
            System.out.println("Execute Permission: Denied");
        }

    }
}
