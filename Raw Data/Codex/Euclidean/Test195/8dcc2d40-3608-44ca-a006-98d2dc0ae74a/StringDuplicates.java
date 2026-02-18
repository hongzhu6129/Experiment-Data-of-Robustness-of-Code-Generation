import java.util.Arrays;

public class StringDuplicates {

    static void CountCharacters(String str, int[] charCounts) {
        str = str.toLowerCase(); // Case-insensitive counting
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) { // Only count letters
                charCounts[c - 'a']++; 
            }
        }
    }

    static void showDuplicates(String str) {
        int[] charCounts = new int[26]; // Assuming only lowercase English letters
        CountCharacters(str, charCounts);


        System.out.print("Duplicate characters in \"" + str + "\": ");
        boolean foundDuplicates = false; // Flag to check if any duplicates were found
        for (int i = 0; i < 26; i++) {
            if (charCounts[i] > 1) {
                System.out.print((char) ('a' + i) + " ");
                foundDuplicates = true;
            }
        }
        if (!foundDuplicates) {
            System.out.print("No duplicates found.");
        }

        System.out.println(); // Newline for cleaner output

    }

    public static void main(String[] args) {
        String str1 = "Programming";
        showDuplicates(str1);  // Output: Duplicate characters in "Programming": r g m 

        String str2 = "Java";
        showDuplicates(str2); // Output: Duplicate characters in "Java": a

        String str3 = "abcdef";
        showDuplicates(str3); // Output: No duplicates found.

        String str4 = "Abccb";
        showDuplicates(str4); //Output: Duplicate characters in "Abccb": b c



    }
}
