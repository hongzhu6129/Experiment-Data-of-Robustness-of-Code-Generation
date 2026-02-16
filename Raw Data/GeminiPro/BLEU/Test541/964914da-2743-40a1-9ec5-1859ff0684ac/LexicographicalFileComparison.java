import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LexicographicalFileComparison {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java LexicographicalFileComparison <file1> <file2>");
            return;
        }

        String file1Path = args[0];
        String file2Path = args[1];

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2Path))) {

            int comparisonResult = compareFiles(reader1, reader2);

            if (comparisonResult < 0) {
                System.out.println(file1Path + " comes before " + file2Path + " lexicographically.");
            } else if (comparisonResult > 0) {
                System.out.println(file1Path + " comes after " + file2Path + " lexicographically.");
            } else {
                System.out.println(file1Path + " and " + file2Path + " are lexicographically equal.");
            }

        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }


    private static int compareFiles(BufferedReader reader1, BufferedReader reader2) throws IOException {
        String line1;
        String line2;

        while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
            int lineComparison = line1.compareTo(line2);
            if (lineComparison != 0) {
                return lineComparison; // Files differ at this line
            }
        }

        // One file is a prefix of the other or both files have been fully read
        if (line1 == null && line2 == null) {
            return 0; // Files are equal
        } else if (line1 == null) {
            return -1; // File 1 is shorter (a prefix of File 2)
        } else {
            return 1; // File 2 is shorter (a prefix of File 1)
        }
    }
}


