import java.util.Arrays;

public class StringAnalysis {

    static void CountCharacters(String str, int[] charCounts) {
        str = str.toLowerCase(); // Case-insensitive counting
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charCounts[c - 'a']++;
            }
        }
    }

    static void showDuplicates(String str) {
        int[] charCounts = new int[26]; // Assuming only lowercase English alphabet
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
        String str1 = "Programming";
        String str2 = "Java";
        String str3 = "abcabcabc";
        String str4 = "xyz";  // Example with no duplicates


        showDuplicates(str1);  // Output: Duplicate characters in "Programming": r g m
        showDuplicates(str2);  // Output: Duplicate characters in "Java": a
        showDuplicates(str3);  // Output: Duplicate characters in "abcabcabc": a b c
        showDuplicates(str4);  // Output: Duplicate characters in "xyz": None
    }
}
