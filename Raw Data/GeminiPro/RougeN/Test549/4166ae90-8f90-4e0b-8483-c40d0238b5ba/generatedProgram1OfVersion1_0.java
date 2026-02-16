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
            // Method 1: Using ArrayList (dynamic sizing) - Preferred
            List<String> linesList = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                linesList.add(line);
            }
            reader.close();

            // Convert ArrayList to String array if needed
            String[] linesArray = linesList.toArray(new String[0]); 

            // Print the array contents (for demonstration)
            System.out.println("File content stored in an array (ArrayList method):");
            for (String s : linesArray) {
                System.out.println(s);
            }



            // Method 2: Using a fixed-size array (less flexible)
            //  Only use if you know the number of lines beforehand.
            /*
             *  This method is less practical because it requires knowing the number of
             * lines in advance.  The ArrayList approach is generally preferred.  I've 
             * included this example just to demonstrate the fixed-size array approach,
             * but it's not recommended unless absolutely necessary.
             *
            int numLines = countLines(filePath); // Helper function (see below)  
            if (numLines > 0) { // Check if the file is not empty
                String[] fixedSizeArray = new String[numLines]; 
                BufferedReader reader2 = new BufferedReader(new FileReader(filePath));
                for(int i=0; i < numLines; i++) {
                    fixedSizeArray[i] = reader2.readLine();
                }
                reader2.close();


                System.out.println("\nFile content stored in a fixed-size array:");
                System.out.println(Arrays.toString(fixedSizeArray)); // Print array
            } else {
                System.out.println("The file is empty or an error occurred.");
            }
            */





        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }


    // Helper function to count lines (for fixed-size array method - Method 2)
    // Not needed for the preferred ArrayList method (Method 1)
    private static int countLines(String filePath) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                count++;
            }
        }
        return count;
    }
}
