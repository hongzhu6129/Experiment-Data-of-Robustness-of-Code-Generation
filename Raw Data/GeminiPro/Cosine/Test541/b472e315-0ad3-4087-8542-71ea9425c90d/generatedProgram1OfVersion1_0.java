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

            while (true) {
                line1 = reader1.readLine();
                line2 = reader2.readLine();

                if (line1 == null && line2 == null) {
                    break; // Both files have reached the end
                } else if (line1 == null) {
                    comparisonResult = -1; // File1 is shorter
                    break;
                } else if (line2 == null) {
                    comparisonResult = 1;  // File2 is shorter
                    break;
                }

                comparisonResult = line1.compareTo(line2);

                if (comparisonResult != 0) {
                    break; // Found a difference
                }
            }

            if (comparisonResult == 0) {
                System.out.println("Files are lexicographically equal.");
            } else if (comparisonResult < 0) {
                System.out.println("File1 is lexicographically smaller than File2.");
            } else {
                System.out.println("File1 is lexicographically greater than File2.");
            }


        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
