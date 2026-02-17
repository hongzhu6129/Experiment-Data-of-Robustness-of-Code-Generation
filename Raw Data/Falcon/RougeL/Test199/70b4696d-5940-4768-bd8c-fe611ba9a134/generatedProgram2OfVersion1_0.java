import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileToByteArrayFileInputStream {

    public static void main(String[] args) {
        // ... (argument checking same as above)

        try (FileInputStream fis = new FileInputStream(filename)) {
            byte[] byteArray = fis.readAllBytes(); // Java 9+
            // ... (rest of the code for processing byteArray is the same)
        } catch (IOException e) {
            // ... (error handling same as above)
        }

    }
}

