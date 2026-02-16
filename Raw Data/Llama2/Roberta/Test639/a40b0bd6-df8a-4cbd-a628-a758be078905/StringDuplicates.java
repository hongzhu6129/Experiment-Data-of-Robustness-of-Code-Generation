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
        int[] charCounts = new int[26]; // Array to store character counts (a-z)
        CountCharacters(str, charCounts);

        System.out.print("Duplicate characters: ");
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
        System.out.println(); // Add a newline for better formatting
    }

    public static void main(String[] args) {
        String testString1 = "Programming";
        System.out.println("Input String: " + testString1);
        showDuplicates(testString1);


        String testString2 = "abcde";
        System.out.println("Input String: " + testString2);
        showDuplicates(testString2);



        String testString3 = "aA11";
        System.out.println("Input String: " + testString3);
        showDuplicates(testString3);


    }
}


