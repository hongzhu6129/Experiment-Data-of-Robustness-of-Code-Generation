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

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            int comparisonResult = 0;

            while (line1 != null && line2 != null && comparisonResult == 0) {
                comparisonResult = line1.compareTo(line2);
                line1 = reader1.readLine();
                line2 = reader2.readLine();
            }


            if (comparisonResult < 0) {
                System.out.println("File1 comes before File2 lexicographically.");
            } else if (comparisonResult > 0) {
                System.out.println("File2 comes before File1 lexicographically.");
            } else { // comparisonResult == 0
                if (line1 == null && line2 == null) {
                    System.out.println("Files are lexicographically equal.");
                } else if (line1 == null) {
                    System.out.println("File1 comes before File2 lexicographically."); // File1 is shorter
                } else {  // line2 == null
                    System.out.println("File2 comes before File1 lexicographically."); // File2 is shorter
                }
            }


        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }
}
