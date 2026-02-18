import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreTextFileInArray {

    public static void main(String[] args) {
        String filePath = "path/to/your/textfile.txt"; // Replace with the actual path to your text file

        try {
            // Method 1: Using BufferedReader and ArrayList (Dynamic Sizing)
            List<String> linesList = readLinesUsingList(filePath);
            String[] linesArrayFromList = linesList.toArray(new String[0]);

            System.out.println("Lines from ArrayList (converted to array):");
            System.out.println(Arrays.toString(linesArrayFromList));


            // Method 2: Using BufferedReader and pre-counting lines for fixed-size array (Less efficient if file is large)
            int lineCount = countLines(filePath);  // Count lines first
            if (lineCount > 0) { // Check if file has content before proceeding
                String[] linesArrayFixed = readLinesUsingArray(filePath, lineCount);

                System.out.println("\nLines from fixed-size array:");
                System.out.println(Arrays.toString(linesArrayFixed));
            } else {
                System.out.println("The file is empty or does not exist.");
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }


    }

    private static List<String> readLinesUsingList(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    private static int countLines(String filePath) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                count++;
            }
        }
        return count;
    }

    private static String[] readLinesUsingArray(String filePath, int lineCount) throws IOException {
        String[] lines = new String[lineCount];
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < lineCount; i++) {
                lines[i] = reader.readLine();
            }
        }
        return lines;
    }
}
