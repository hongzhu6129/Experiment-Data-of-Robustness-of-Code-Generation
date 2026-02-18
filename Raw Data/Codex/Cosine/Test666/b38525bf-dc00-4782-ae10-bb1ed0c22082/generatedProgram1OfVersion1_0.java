import java.io.File;

public class FileSize {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileSize <filename>");
            return;
        }

        File file = new File(args[0]);

        if (!file.exists() || !file.isFile()) {
            System.out.println("File not found or not a regular file: " + args[0]);
            return;
        }


        System.out.println("File size in bytes: " + filesize_in_Bytes(file));
        System.out.println("File size in kilobytes: " + filesize_in_kiloBytes(file));
        System.out.println("File size in megabytes: " + filesize_in_megaBytes(file));

    }

    private static String filesize_in_megaBytes(File file) {
        double sizeInBytes = file.length();
        double sizeInMB = sizeInBytes / (1024 * 1024); // Convert to MB
        return String.format("%.2f MB", sizeInMB); // Format to two decimal places
    }

    private static String filesize_in_kiloBytes(File file) {
        double sizeInBytes = file.length();
        double sizeInKB = sizeInBytes / 1024; // Convert to KB
        return String.format("%.2f KB", sizeInKB); // Format to two decimal places
    }

    private static String filesize_in_Bytes(File file) {
        long sizeInBytes = file.length();
        return String.format("%d bytes", sizeInBytes);
    }
}
