import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreFileContentInArray {

    public static void main(String[] args) {
        // Replace "your_file.txt" with the actual path to your text file
        String filePath = "your_file.txt"; 

        try {
            // Method 1: Using ArrayList (dynamic sizing) - Preferred
            List<String> linesList = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                linesList.add(line);
            }
            reader.close();

            // Convert ArrayList to array if needed
            String[] linesArray = linesList.toArray(new String[0]);

            System.out.println("File content stored in an array (using ArrayList):");
            System.out.println(Arrays.toString(linesArray));



            // Method 2: Using array (fixed size - requires knowing the number of lines beforehand)
            // Less efficient if the file size is unknown.
            /*
            int numLines = countLines(filePath); // Helper function to count lines (implementation below)
            if (numLines == -1) { // Handle errors in countLines
                System.err.println("Error reading file or file not found.");
                return;
            }

            String[] fixedSizeArray = new String[numLines]; 
            reader = new BufferedReader(new FileReader(filePath));
            for (int i = 0; i < numLines; i++) {
                fixedSizeArray[i] = reader.readLine();
            }
            reader.close();
            
            System.out.println("\nFile content stored in an array (fixed size):");
            System.out.println(Arrays.toString(fixedSizeArray)); 
            */


        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Helper function to count lines in a file (for Method 2 - fixed size array)
   /* private static int countLines(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int lines = 0;
            while (reader.readLine() != null) lines++;
            return lines;
        } catch (IOException e) {
            return -1; // Return -1 to indicate an error
        }
    }*/

}
