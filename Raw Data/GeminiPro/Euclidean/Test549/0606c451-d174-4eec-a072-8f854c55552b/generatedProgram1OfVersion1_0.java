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
            // Method 1: Using ArrayList (dynamic sizing) - Preferred Approach
            List<String> linesList = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                linesList.add(line);
            }
            reader.close();

            // Convert ArrayList to String array if needed
            String[] linesArray = linesList.toArray(new String[0]); 

            System.out.println("File content stored in an array (ArrayList approach):");
            System.out.println(Arrays.toString(linesArray));


            // Method 2: Using a fixed-size array (less flexible)
            // *Requires knowing the number of lines in advance or overestimating*
            //  Not recommended for general use as it can lead to wasted space or ArrayIndexOutOfBoundsException
            /*
            String[] fixedSizeArray = new String[100]; // Example: Assuming max 100 lines
            BufferedReader reader2 = new BufferedReader(new FileReader(filePath));
            int i = 0;
            String line2;
            while ((line2 = reader2.readLine()) != null && i < fixedSizeArray.length) { 
                fixedSizeArray[i++] = line2;
            }
            reader2.close();

            System.out.println("\nFile content stored in a fixed-size array:");
             // Print only the filled portion of the array (to avoid nulls)
            for (int j = 0; j < i; j++) {  
                System.out.println(fixedSizeArray[j]);
            }
            */

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
