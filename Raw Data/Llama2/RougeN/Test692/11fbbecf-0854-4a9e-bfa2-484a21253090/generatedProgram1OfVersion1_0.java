import java.util.Scanner;

public class ReplaceCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        // Get the character to be replaced
        System.out.println("Enter the character to be replaced: ");
        char ch1 = scanner.nextLine().charAt(0);

        // Get the character to replace with
        System.out.println("Enter the character to replace with: ");
        char ch2 = scanner.nextLine().charAt(0);

        // Replace the character
        String newStr = str.replace(ch1, ch2);

        // Print the new string
        System.out.println("The new string is: " + newStr);
    }
}
