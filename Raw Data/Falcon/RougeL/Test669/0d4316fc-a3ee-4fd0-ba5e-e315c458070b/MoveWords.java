import java.util.Arrays;
import java.util.Scanner;

public class MoveWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input strings
        System.out.println("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.println("Enter the words to move: ");
        String wordsToMove = scanner.nextLine();

        // Convert the words to move to an array
        String[] wordsToMoveArray = wordsToMove.split(" ");

        // Move the words
        String movedString = moveWords(originalString, wordsToMoveArray);

        // Print the moved string
        System.out.println("The moved string is: " + movedString);
    }

    public static String moveWords(String originalString, String[] wordsToMove) {
        // Convert the original string to an array of words
        String[] originalStringArray = originalString.split(" ");

        // Create a new array to store the moved string
        String[] movedStringArray = new String[originalStringArray.length];

        // Iterate over the original string array
        int index = 0;
        for (String word : originalStringArray) {
            // If the word is in the words to move array, move it to the end of the moved string array
            if (Arrays.asList(wordsToMove).contains(word)) {
                movedStringArray[movedStringArray.length - 1] = word;
            } else {
                // Otherwise, add the word to the moved string array
                movedStringArray[index] = word;
                index++;
            }
        }

        // Convert the moved string array to a string
        String movedString = String.join(" ", movedStringArray);

        // Return the moved string
        return movedString;
    }
}
