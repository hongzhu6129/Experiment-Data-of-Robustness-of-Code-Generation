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
        int[] charCounts = new int[26];  // Assuming only lowercase English alphabet
        CountCharacters(str, charCounts);

        System.out.println("Duplicate characters in the string \"" + str + "\":");
        boolean foundDuplicates = false;
        for (int i = 0; i < 26; i++) {
            if (charCounts[i] > 1) {
                System.out.println((char) ('a' + i) + ": " + charCounts[i] + " times");
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.println("No duplicate characters found.");
        }
    }

    public static void main(String[] args) {
        String str1 = "programming";
        showDuplicates(str1);

        String str2 = "Java";
        showDuplicates(str2);

        String str3 = "abcd";  // Example with no duplicates
        showDuplicates(str3);


        String str4 = "aA"; //Testing case sensitivity
        showDuplicates(str4);

        String str5 = "This is a test string"; // Testing with spaces and mixed case
        showDuplicates(str5);




    }
}

