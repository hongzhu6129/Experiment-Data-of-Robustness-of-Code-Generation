import java.util.Scanner;

public class ReplaceCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Get the character to be replaced
        System.out.println("Enter the character to be replaced: ");
        char oldChar = sc.next().charAt(0);

        // Get the character to replace with
        System.out.println("Enter the character to replace with: ");
        char newChar = sc.next().charAt(0);

        // Replace the characters
        String newStr = str.replace(oldChar, newChar);

        // Print the new string
        System.out.println("The new string is: " + newStr);
    }
}
