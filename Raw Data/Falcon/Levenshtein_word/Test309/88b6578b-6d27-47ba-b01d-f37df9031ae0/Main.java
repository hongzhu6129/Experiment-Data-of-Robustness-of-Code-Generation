import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String inputString = scanner.nextLine();

        // Read the character to be searched
        char character = scanner.nextLine().charAt(0);

        // Create a new string that contains all the characters in the input string that are different from the character to be searched
        String newString = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != character) {
                newString += inputString.charAt(i);
            }
        }

        // Print the new string
        System.out.println(newString);
    }
}
