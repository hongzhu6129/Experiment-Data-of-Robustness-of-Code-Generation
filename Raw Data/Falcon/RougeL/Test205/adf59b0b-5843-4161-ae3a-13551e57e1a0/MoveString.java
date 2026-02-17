import java.util.Scanner;

public class MoveString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String string = scanner.nextLine();

        // Move the string characters one position to the right
        String movedString = moveString(string);

        // Print the moved string
        System.out.println(movedString);
    }

    public static String moveString(String string) {
        // Base case: if the string is empty, return an empty string
        if (string.equals("")) {
            return "";
        }

        // Recursive case: move the first character of the string to the end of the string and call the function again on the remaining string
        else {
            return moveString(string.substring(1)) + string.charAt(0);
        }
    }
}
