import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCharacters {

    static void CountCharacters(String str, int[] charCounts) {
        str = str.toLowerCase(); // Case-insensitive counting
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charCounts[c - 'a']++;
            }
        }
    }

    static void showDuplicates(String str) {
        int[] charCounts = new int[26]; // For 'a' to 'z'
        CountCharacters(str, charCounts);

        System.out.print("Duplicate characters in the string \"" + str + "\": ");
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

        System.out.println(); // Newline for better output formatting
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        showDuplicates(inputString);
        scanner.close();

        // Example usage (you can remove these lines if you only want user input):
        showDuplicates("Programming");
        showDuplicates("Java");
        showDuplicates("aabbccddeeff");
        showDuplicates("NoDuplicates");

    }
}
