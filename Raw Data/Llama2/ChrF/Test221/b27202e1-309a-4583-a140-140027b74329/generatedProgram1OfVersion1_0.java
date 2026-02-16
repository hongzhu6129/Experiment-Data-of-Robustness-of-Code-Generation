import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        // 1. Specify the file path.  Make sure this path is correct for your system.
        String filePath = "my_file.txt"; // Replace with your file's path

        // 2. Create a List to store each line as a String.
        List<String> fileLines = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            // 3. Read the file line by line until the end of the file is reached.
            while ((line = reader.readLine()) != null) {
                // 4. Add each line to the List.
                fileLines.add(line); 
            }

        } catch (IOException e) {
            // 5. Handle potential IOExceptions (e.g., file not found).
            System.err.println("Error reading the file: " + e.getMessage());
            // You might want to exit the program or take other actions here
            System.exit(1); // Exit with an error code
        }

        // 6. Now 'fileLines' contains all lines from the file. You can process them.

        // Example: Print the lines to the console:
        System.out.println("File contents:");
        for (String l : fileLines) {
            System.out.println(l);
        }


        // Example: Store the entire file content as a single String (if needed)
        StringBuilder sb = new StringBuilder();
        for(String l : fileLines) {
            sb.append(l).append("\n"); // Append each line with a newline character
        }
        String entireFileContent = sb.toString();


        System.out.println("\nEntire file content as a single String:");
        System.out.println(entireFileContent);


    }
}
