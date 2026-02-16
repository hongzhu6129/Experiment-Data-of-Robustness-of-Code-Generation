import java.util.Scanner;

class ReplaceCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter the input string: ");
        String inputString = scanner.nextLine();

        // Get the character to replace with
        System.out.println("Enter the character to replace with: ");
        char replaceWith = scanner.nextLine().charAt(0);

        // Replace all applicable characters with the given character
        String replacedString = inputString.replaceAll("[aeiouAEIOU]", String.valueOf(replaceWith));

        // Print the replaced string
        System.out.println("The replaced string is: " + replacedString);
    }
}
