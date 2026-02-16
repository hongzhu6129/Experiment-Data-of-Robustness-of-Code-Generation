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
        System.out.println(); // Add a newline for cleaner output
    }


    public static void main(String[] args) {
        String str1 = "Programming";
        showDuplicates(str1); // Output: Duplicate characters in "Programming": r g m 

        String str2 = "Java";
        showDuplicates(str2);  // Output: Duplicate characters in "Java": a

        String str3 = "abcdef";
        showDuplicates(str3);  // Output: Duplicate characters in "abcdef": None

        String str4 = "Banana"; //Mixed case
        showDuplicates(str4); // Output: Duplicate characters in "Banana": a n



    }
}
