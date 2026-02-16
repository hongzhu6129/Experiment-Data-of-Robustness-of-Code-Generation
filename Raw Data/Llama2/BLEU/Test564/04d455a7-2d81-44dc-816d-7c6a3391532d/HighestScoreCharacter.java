import java.util.Scanner;

public class HighestScoreCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Find the highest score character
        int highestScore = 0;
        char highestScoreCharacter = ' ';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int score = (int)c - 96;
            if (score > highestScore) {
                highestScore = score;
                highestScoreCharacter = c;
            }
        }

        // Print the highest score character
        System.out.println("The character with the highest score is: " + highestScoreCharacter);
    }
}
