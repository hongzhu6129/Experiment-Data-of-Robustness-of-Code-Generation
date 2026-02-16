import java.util.Arrays;

public class StringDuplicates {

    static void CountCharacters(String str, int[] charCounts) {
        str = str.toLowerCase(); // Case-insensitive counting
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { // Consider only letters
                charCounts[c - 'a']++;
            }
        }
    }

    static void showDuplicates(String str) {
        int[] charCounts = new int[26]; // Assuming only lowercase English letters

        CountCharacters(str, charCounts);

        System.out.print("Duplicate characters in \"" + str + "\": ");
        boolean foundDuplicates = false;

        for (int i = 0; i < 26; i++) {
            if (charCounts[i] > 1) {
                System.out.print((char) ('a' + i) + " ");  // Print the duplicate character
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.print("No duplicates found.");
        }
        System.out.println(); // Add a newline for cleaner output
    }


    public static void main(String[] args) {
        showDuplicates("Programming");
        showDuplicates("Java");
        showDuplicates("ABBA"); // Example with uppercase
        showDuplicates("123"); // Example with no duplicates
        showDuplicates("better butter"); // Example with spaces and mixed case


    }
}
