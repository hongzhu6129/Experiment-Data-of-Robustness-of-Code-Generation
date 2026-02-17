import java.io.File;

public class FileSize {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file path as an argument.");
            return;
        }

        File file = new File(args[0]);

        if (!file.exists() || !file.isFile()) {
            System.out.println("Invalid file path or the path does not point to a file.");
            return;
        }

        System.out.println("File size in Bytes: " + filesize_in_Bytes(file));
        System.out.println("File size in KiloBytes: " + filesize_in_kiloBytes(file));
        System.out.println("File size in MegaBytes: " + filesize_in_megaBytes(file));


    }


    private static String filesize_in_megaBytes(File file) {
        long fileSizeInBytes = file.length();
        double fileSizeInMegaBytes = (double) fileSizeInBytes / (1024 * 1024);
        return String.format("%.2f MB", fileSizeInMegaBytes); // Format to two decimal places
    }

    private static String filesize_in_kiloBytes(File file) {
        long fileSizeInBytes = file.length();
        double fileSizeInKiloBytes = (double) fileSizeInBytes / 1024;
        return String.format("%.2f KB", fileSizeInKiloBytes); // Format to two decimal places
    }

    private static String filesize_in_Bytes(File file) {
        long fileSizeInBytes = file.length();
        return String.format("%d Bytes", fileSizeInBytes);
    }
}
