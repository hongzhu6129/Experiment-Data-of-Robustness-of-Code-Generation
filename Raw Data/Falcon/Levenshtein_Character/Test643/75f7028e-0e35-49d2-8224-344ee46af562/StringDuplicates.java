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

        System.out.print("Duplicate characters: ");
        boolean foundDuplicates = false; // Flag to track if any duplicates were found

        for (int i = 0; i < 26; i++) {
            if (charCounts[i] > 1) {
                System.out.print((char) ('a' + i) + " ");
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.print("No duplicates found.");
        }
        System.out.println();  // Add a newline for cleaner output


    }

    public static void main(String[] args) {
        String str1 = "Programming";
        System.out.println("Input String: " + str1);
        showDuplicates(str1);


        String str2 = "Java";
        System.out.println("Input String: " + str2);

        showDuplicates(str2);

        String str3 = "abcab";
        System.out.println("Input String: " + str3);
        showDuplicates(str3);


        String str4 = "xyz";        
        System.out.println("Input String: " + str4);
        showDuplicates(str4);


    }
}
