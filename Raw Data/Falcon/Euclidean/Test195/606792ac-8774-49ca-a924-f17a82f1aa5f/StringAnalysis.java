import java.util.Arrays;

public class StringAnalysis {

    static void CountCharacters(String str, int[] counts) {
        // Initialize the counts array to 0
        Arrays.fill(counts, 0);

        // Convert the string to lowercase for case-insensitive counting
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                counts[c - 'a']++;
            }
        }
    }


    static void showDuplicates(String str) {
        str = str.toLowerCase(); // Case-insensitive duplicates
        int[] charCounts = new int[26]; // Assuming only English alphabet

        CountCharacters(str, charCounts);

        System.out.print("Duplicate Characters: ");
        boolean foundDuplicates = false; // Flag to check if any duplicates were found

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1) {
                System.out.print((char) ('a' + i) + " ");
                foundDuplicates = true;
            }
        }


        if (!foundDuplicates) {
            System.out.print("No duplicates found.");
        }

        System.out.println(); // Newline for better formatting
    }


    public static void main(String[] args) {
        String testString1 = "Programming";
        String testString2 = "Java";
        String testString3 = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";


        showDuplicates(testString1); // Output: Duplicate Characters: r g m
        showDuplicates(testString2); // Output: Duplicate Characters: a
        showDuplicates(testString3);  // Output: Duplicate Characters: a b c d e f g h i j k l m n o p q r s t u v w x y z

        // Example showing character counts (you can uncomment if needed)
        int[] counts = new int[26];
        CountCharacters(testString1, counts);

        /*
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) ('a' + i) + ": " + counts[i]);
            }
        }
        */

    }
}
