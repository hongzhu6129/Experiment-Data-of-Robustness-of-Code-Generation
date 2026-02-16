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

            // Convert ArrayList to String array if needed
            String[] linesArray = linesList.toArray(new String[0]);

            System.out.println("File content stored in an array (ArrayList method):");
            System.out.println(Arrays.toString(linesArray));



            // Method 2: Using a fixed-size array (less flexible) -  Only suitable if you know the number of lines beforehand.
            // Not recommended in general. Demonstrated for educational purposes.
            /*
            int numLines = countLines(filePath); //  A separate function would be needed to count lines first (see below).


            if (numLines > 0) { // Check if the file has any lines
                String[] fixedSizeArray = new String[numLines];
                BufferedReader reader2 = new BufferedReader(new FileReader(filePath));

                for (int i = 0; i < numLines; i++) {
                    fixedSizeArray[i] = reader2.readLine();
                }
                reader2.close();

                System.out.println("\nFile content stored in a fixed-size array:");
                System.out.println(Arrays.toString(fixedSizeArray));
            } else {
                System.out.println("The file is empty or does not exist.");

            }
            */



        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }



     /* Helper function to count lines (needed only for fixed-size array method - Method 2)
    private static int countLines(String filePath) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {  // Try-with-resources for automatic closing
            while (reader.readLine() != null) {
                count++;
            }
        }
        return count;
    }*/

}


