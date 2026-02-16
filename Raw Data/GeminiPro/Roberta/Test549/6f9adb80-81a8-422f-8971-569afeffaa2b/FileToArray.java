import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileToArray {

    public static void main(String[] args) {

        // 1. Declare the file path.  Replace "your_file.txt" with the actual path.
        String filePath = "your_file.txt";


        // 2. Use try-with-resources for automatic resource management (closes the file automatically)
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // 3. Use a List to store the lines dynamically (since we don't know the file size beforehand)
            List<String> lines = new ArrayList<>();

            // 4. Read the file line by line
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line); 
            }


            // 5. Convert the List to an array (if you absolutely need an array)
            String[] linesArray = lines.toArray(new String[0]); // Efficient way to create an array from a List


            // 6. Print the array content (or process it as needed)
            System.out.println("File content stored in an array:");
            for (String s : linesArray) {
                System.out.println(s);
            }



            //  Alternative: Direct conversion to array using streams (Java 8+)
            //  This approach is more concise but might be slightly less efficient for very large files
             try (BufferedReader reader2 = new BufferedReader(new FileReader(filePath))) {
                String[] linesArray2 = reader2.lines().toArray(String[]::new);
                System.out.println("\nFile content using streams:");
                Arrays.stream(linesArray2).forEach(System.out::println); 
             }


        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}



