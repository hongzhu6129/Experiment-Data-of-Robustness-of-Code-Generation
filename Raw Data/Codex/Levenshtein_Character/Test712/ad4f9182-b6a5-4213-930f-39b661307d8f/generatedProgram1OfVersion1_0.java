import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirst3Lines {

    public static void main(String[] args) {
        String filePath = "your_file_path.txt"; // Replace with the actual file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < 3; i++) {
                String line = reader.readLine();
                if (line == null) { // Check for end of file before reaching 3 lines
                    break; 
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
