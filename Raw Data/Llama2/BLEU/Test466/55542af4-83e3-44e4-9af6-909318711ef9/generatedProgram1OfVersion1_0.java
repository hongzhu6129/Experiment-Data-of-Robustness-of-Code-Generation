import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileToArray {

    public static void main(String[] args) {
        // Replace "your_file.txt" with the actual path to your text file.
        String filePath = "your_file.txt"; 

        try {
            // Method 1: Using ArrayList (dynamic sizing) - Preferred
            List<String> linesList = new ArrayList<>();
            BufferedReader reader1 = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader1.readLine()) != null) {
                linesList.add(line);
            }
            reader1.close();

            // Convert ArrayList to String array if needed
            String[] linesArray1 = linesList.toArray(new String[0]); 
            System.out.println("Content (ArrayList method): " + Arrays.toString(linesArray1));


            // Method 2: Using a fixed-size array (less efficient, requires knowing the number of lines beforehand)
            // This method is shown for demonstration, but using ArrayList is generally better
            int numLines = countLines(filePath);  //Helper function (see below) to count lines

            if (numLines > 0) {
                String[] linesArray2 = new String[numLines];
                BufferedReader reader2 = new BufferedReader(new FileReader(filePath));
                for (int i = 0; i < numLines; i++) {
                    linesArray2[i] = reader2.readLine();
                }
                reader2.close();

                System.out.println("Content (fixed-size array method): " + Arrays.toString(linesArray2));
            } else {
                System.out.println("File is empty or does not exist.");
            }


        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }


    // Helper function to count lines in a file (for fixed-size array method)
    private static int countLines(String filePath) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {  // Try-with-resources for automatic resource closing
            while (reader.readLine() != null) {
                count++;
            }
        }
        return count;
    }
}
