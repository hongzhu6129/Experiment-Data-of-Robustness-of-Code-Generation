import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompareFilesLexicographically {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CompareFilesLexicographically <file1> <file2>");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {

            String line1;
            String line2;
            int comparisonResult = 0;

            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                comparisonResult = line1.compareTo(line2);
                if (comparisonResult != 0) {
                    break;  // Exit loop if lines are different
                }
            }

            // Handle cases where one file is shorter than the other
            if (comparisonResult == 0) {
                if (line1 == null && line2 != null) {
                    comparisonResult = -1; // file1 is shorter
                } else if (line1 != null && line2 == null) {
                    comparisonResult = 1; // file2 is shorter
                }
            }

            if (comparisonResult < 0) {
                System.out.println("File1 comes before File2 lexicographically.");
            } else if (comparisonResult > 0) {
                System.out.println("File2 comes before File1 lexicographically.");
            } else {
                System.out.println("The files are lexicographically equal.");
            }

        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }
}
