import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreFileContentInArray {

    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt"; // Replace with your file path

        try {
            // Method 1: Using ArrayList and converting to array (More flexible)
            List<String> linesList = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                linesList.add(line);
            }
            reader.close();

            String[] linesArray = linesList.toArray(new String[0]); // Convert to array

            System.out.println("File content stored in array (Method 1 - ArrayList):");
            System.out.println(Arrays.toString(linesArray));



            // Method 2: Directly using array (Less flexible - requires knowing file size beforehand)
            //  This method is generally less preferred because you need to know the number
            // of lines in the file in advance, which isn't always practical.

             // First, count the lines in the file (requires reading it twice unfortunately)
            int lineCount = 0;
            BufferedReader lineCounter = new BufferedReader(new FileReader(filePath));
            while (lineCounter.readLine() != null) {
                lineCount++;
            }
            lineCounter.close();


            String[] linesArray2 = new String[lineCount];  // Initialize array with correct size
            BufferedReader reader2 = new BufferedReader(new FileReader(filePath));
            int i = 0;
            while ((line = reader2.readLine()) != null) {
                linesArray2[i++] = line;
            }
            reader2.close();

            System.out.println("\nFile content stored in array (Method 2 - Direct Array):");
            System.out.println(Arrays.toString(linesArray2));




        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
