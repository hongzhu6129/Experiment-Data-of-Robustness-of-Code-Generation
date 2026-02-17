import java.util.Arrays;

public class StringAnalysis {

    static void CountCharacters(String str, int[] counts) {
        // Initialize the counts array to 0
        Arrays.fill(counts, 0);

        str = str.toLowerCase(); // Case-insensitive counting

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                counts[c - 'a']++;
            }
        }
    }

    static void showDuplicates(String str) {
        str = str.toLowerCase(); // Case-insensitive duplicate checking

        int[] charCounts = new int[26]; // Assuming only lowercase English alphabet
        CountCharacters(str, charCounts);

        System.out.print("Duplicate Characters: ");
        boolean foundDuplicates = false; // Flag to check if any duplicates exist


        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1) {
                System.out.print((char)('a' + i) + " ");
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.print("No duplicates found.");
        }
        System.out.println(); // Newline for better output formatting


    }


    public static void main(String[] args) {
        String inputString = "Programming"; 

        int[] charCounts = new int[26]; 
        CountCharacters(inputString, charCounts);



        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char)('a' + i) + ": " + charCounts[i]);
            }
        }

        showDuplicates(inputString); // Call the function to display duplicates


        inputString =  "abccdeffggh"; // Test with more duplicates
        showDuplicates(inputString);

        inputString = "NoDuplicates"; //Test with no duplicates
        showDuplicates(inputString);


    }
}
