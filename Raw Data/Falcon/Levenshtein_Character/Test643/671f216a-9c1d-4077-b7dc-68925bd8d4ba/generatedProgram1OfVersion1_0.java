import java.util.Arrays;

public class StringDuplicates {

    static void CountCharacters(String str, int[] charCounts) {
        str = str.toLowerCase(); // Case-insensitive counting
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
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
                System.out.print((char) ('a' + i) + " ");
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.print("No duplicates found.");
        }
        System.out.println(); 

    }

    public static void main(String[] args) {
        showDuplicates("programming"); // Example usage 1
        showDuplicates("Java"); // Example usage 2
        showDuplicates("Mississippi"); // Example usage 3 with uppercase and mixed case
        showDuplicates("abcd"); // Example with no duplicates
    }
}
