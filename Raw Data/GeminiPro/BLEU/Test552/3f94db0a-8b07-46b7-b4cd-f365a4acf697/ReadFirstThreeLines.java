import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstThreeLines {

    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt"; // Replace with the actual file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < 3; i++) {
                String line = reader.readLine();
                if (line == null) { // Handle cases where the file has fewer than 3 lines
                    break; 
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
