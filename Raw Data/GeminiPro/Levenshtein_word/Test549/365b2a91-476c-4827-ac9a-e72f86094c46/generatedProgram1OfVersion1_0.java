import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreFileContentInArray {

    public static void main(String[] args) {
        // Replace "your_file.txt" with the actual path to your text file.
        String filePath = "your_file.txt";

        try {
            // Method 1: Using ArrayList (dynamic sizing) - Preferred
            List<String> linesList = readLinesUsingArrayList(filePath);
            String[] linesArrayFromList = linesList.toArray(new String[0]); // Convert to array if needed
            System.out.println("File content (using ArrayList): " + Arrays.toString(linesArrayFromList));


            // Method 2: Using a fixed-size array (less flexible)
            //  Only suitable if you know the number of lines in advance or set a maximum.
            String[] fixedSizeArray = readLinesUsingFixedSizeArray(filePath, 100); // Example: Max 100 lines
            System.out.println("File content (using fixed-size array): " + Arrays.toString(fixedSizeArray));


        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }



    private static List<String> readLinesUsingArrayList(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }


    private static String[] readLinesUsingFixedSizeArray(String filePath, int maxSize) throws IOException {
        String[] lines = new String[maxSize];
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null && i < maxSize) {
                lines[i++] = line;
            }

           // If the file has fewer lines than maxSize, resize the array to avoid nulls:
            if(i < maxSize) {
                lines = Arrays.copyOf(lines,i);
            }

        }
        return lines;
    }
}
