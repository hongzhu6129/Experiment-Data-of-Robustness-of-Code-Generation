import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Split the string into words
        String[] words = str.split(" ");

        // Print the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        System.out.println();
    }
}
