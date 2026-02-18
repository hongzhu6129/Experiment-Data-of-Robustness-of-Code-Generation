import java.io.File;

public class FileSizeChecker {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide file paths as command-line arguments.");
            return;
        }

        for (String filePath : args) {
            File file = new File(filePath);
            // ... (rest of the code is the same as before)
        }
    }
}
