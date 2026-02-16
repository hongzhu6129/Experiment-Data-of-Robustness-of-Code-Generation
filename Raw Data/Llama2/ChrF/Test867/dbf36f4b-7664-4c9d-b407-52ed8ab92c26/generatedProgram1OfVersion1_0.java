import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicallyCorrectFiles {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java LexicographicallyCorrectFiles <file1> <file2>");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];

        try {
            correctFiles(file1, file2);
            System.out.println("Files corrected lexicographically.");
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }


    private static void correctFiles(String file1, String file2) throws IOException {
        List<String> lines = new ArrayList<>();

        // Read lines from both files
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {

            String line;
            while ((line = reader1.readLine()) != null) {
                lines.add(line);
            }
            while ((line = reader2.readLine()) != null) {
                lines.add(line);
            }
        }

        // Sort lines lexicographically
        Collections.sort(lines);

        // Write sorted lines back to the files, distributing evenly
        int mid = lines.size() / 2; 
        try (BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2))) {
            for (int i = 0; i < mid; i++) {
                writer1.write(lines.get(i));
                writer1.newLine();
            }
            for (int i = mid; i < lines.size(); i++) {
                writer2.write(lines.get(i));
                writer2.newLine();
            }
        }


    }
}
