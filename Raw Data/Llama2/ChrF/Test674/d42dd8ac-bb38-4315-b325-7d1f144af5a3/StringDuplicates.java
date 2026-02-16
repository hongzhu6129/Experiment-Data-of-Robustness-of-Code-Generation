import java.util.Arrays;

public class StringDuplicates {

    static void CountCharacters(String str, int[] charCounts) {
        str = str.toLowerCase(); // Case-insensitive counting
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') { // Only count letters
                charCounts[c - 'a']++;
            }
        }
    }

    static void showDuplicates(String str) {
        int[] charCounts = new int[26]; // Array to store counts for each letter

        CountCharacters(str, charCounts);

        System.out.print("Duplicate characters in \"" + str + "\": ");
        boolean foundDuplicates = false;  // Flag to check if any duplicates exist
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
        showDuplicates("Programming");
        showDuplicates("Java");
        showDuplicates("abbcdeffg"); 
        showDuplicates("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz");
        showDuplicates("NoDuplicates");


    }
}
