import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    public static void main(String[] args) {
        String fileName = "my_text_file.txt";
        String textToWrite = "This is some text to write to the file.\nThis is another line.";

        try {
            // Write to file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(textToWrite);
            writer.close();

            System.out.println("Successfully wrote to file: " + fileName);

            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuilder fileContent = new StringBuilder(); 

            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n"); // Append each line and a newline
            }
            reader.close();

            System.out.println("File content:\n" + fileContent.toString());


        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}



