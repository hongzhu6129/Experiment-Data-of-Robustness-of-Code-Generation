import java.util.Scanner;

public class ExtractThirdWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split(" ");

        // Check if the string has at least three words
        if (words.length < 3) {
            System.out.println("The string does not have at least three words.");
        } else {
            // Get the third word
            String thirdWord = words[2];

            // Print the third word
            System.out.println("The third word is: " + thirdWord);
        }

        scanner.close();
    }
}
