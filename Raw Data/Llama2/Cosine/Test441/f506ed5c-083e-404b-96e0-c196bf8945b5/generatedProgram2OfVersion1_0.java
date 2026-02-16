import java.io.File;

public class FileSize {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide file paths as command-line arguments.");
            return;
        }


        for (String filePath : args) {
            File file = new File(filePath);

            if (file.exists()) {
                long fileSizeInBytes = file.length();
                System.out.println(filePath + ": " + fileSizeInBytes + " bytes");
            } else {
                System.out.println(filePath + ": File not found.");
            }
        }
    }
}
