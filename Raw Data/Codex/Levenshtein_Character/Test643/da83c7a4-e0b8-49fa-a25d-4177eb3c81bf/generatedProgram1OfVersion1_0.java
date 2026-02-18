import java.util.Arrays;

public class StringDuplicates {

    static void CountCharacters(String str, int[] charCounts) {
        str = str.toLowerCase(); // Case-insensitive counting
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charCounts[c - 'a']++;
            }
        }
    }

    static void showDuplicates(String str) {
        int[] charCounts = new int[26]; // Assuming only lowercase English alphabets
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
            System.out.print("None");
        }
        System.out.println(); // Add a newline for better formatting

    }

    public static void main(String[] args) {
        showDuplicates("Programming");
        showDuplicates("Java");
        showDuplicates("abracadabra");
        showDuplicates("hello");
        showDuplicates("wxyz");  // Example with no duplicates
    }
}
