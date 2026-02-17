import java.util.Scanner;

public class PrintWordsStartingWith {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Read the starting letter
        System.out.println("Enter the starting letter: ");
        char startingLetter = scanner.nextLine().charAt(0);

        // Print the words starting with the given letter
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.charAt(0) == startingLetter) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
