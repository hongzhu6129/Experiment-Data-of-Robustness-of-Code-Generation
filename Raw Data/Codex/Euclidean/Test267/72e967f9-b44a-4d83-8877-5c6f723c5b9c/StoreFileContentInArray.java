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
            // Method 1: Using ArrayList (Dynamic Sizing) - Preferred
            List<String> linesList = new ArrayList<>();
            BufferedReader reader1 = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader1.readLine()) != null) {
                linesList.add(line);
            }
            reader1.close();

            // Convert ArrayList to String array if needed
            String[] linesArrayFromList = linesList.toArray(new String[0]);

            // Print the array (for demonstration)
            System.out.println("Content from ArrayList:");
            System.out.println(Arrays.toString(linesArrayFromList));



            // Method 2: Using a fixed-size array (Less Flexible) -  Not recommended unless you know the exact number of lines
            //  Caution: If the file has more lines than the array size, data will be lost!
            String[] fixedSizeArray = new String[10]; // Example: Array of size 10.  Adjust as needed. 
            BufferedReader reader2 = new BufferedReader(new FileReader(filePath));
            int i = 0;
            while ((line = reader2.readLine()) != null && i < fixedSizeArray.length) {  // Important Check: i < array.length
                fixedSizeArray[i++] = line;
            }
            reader2.close();

            // Print the array (for demonstration)
            System.out.println("\nContent from fixed-size array:");
            System.out.println(Arrays.toString(fixedSizeArray));



        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
