import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileToArray {

    public static void main(String[] args) {
        // Replace "your_file.txt" with the actual path to your text file
        String filePath = "your_file.txt";

        try {
            // Method 1: Using List and then converting to array (more flexible)
            List<String> linesList = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    linesList.add(line);
                }
            }
            String[] linesArray = linesList.toArray(new String[0]); 

            System.out.println("File content stored in an array (Method 1 - List to Array):");
            System.out.println(Arrays.toString(linesArray));


            // Method 2: Pre-determining array size (less flexible, requires knowing file length beforehand)
           /* int lineCount = countLines(filePath); // You would need to implement countLines()
            if (lineCount > 0) {  // Check to prevent creating a zero-length array if the file is empty.
                String[] linesArray2 = new String[lineCount];
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    for (int i = 0; i < lineCount; i++) {
                        linesArray2[i] = reader.readLine();
                    }
                }


                System.out.println("\nFile content stored in an array (Method 2 - Fixed Size Array):");
                System.out.println(Arrays.toString(linesArray2));
            } else {
                System.out.println("File is empty or does not exist.");
            }*/
           

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    // Helper function to count lines (for method 2 - not essential for the core functionality)
   /* private static int countLines(String filePath) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                count++;
            }
        }
        return count;
    } */ 
}
