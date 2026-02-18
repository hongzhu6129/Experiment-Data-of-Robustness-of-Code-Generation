import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreFileInArray {

    public static void main(String[] args) {
        String filePath = "products.txt"; // Replace with your file path

        try {
            List<String> lines = readLinesFromFile(filePath);

            // Convert List<String> to String[] if needed
            String[] productArray = lines.toArray(new String[0]);

            // Print the array to verify (optional)
            System.out.println(Arrays.toString(productArray));


        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }


    private static List<String> readLinesFromFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

}

