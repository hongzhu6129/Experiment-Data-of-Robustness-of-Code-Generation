import java.util.*;

public class replaceParameters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the original string
        System.out.println("Enter the original string:");
        String originalString = scanner.nextLine();

        // Get the parameter to be replaced
        System.out.println("Enter the parameter to be replaced:");
        String parameterToBeReplaced = scanner.nextLine();

        // Get the replacement character
        System.out.println("Enter the replacement character:");
        char replacementCharacter = scanner.next().charAt(0);

        // Replace the parameter with the replacement character
        String modifiedString = originalString.replaceAll(parameterToBeReplaced, String.valueOf(replacementCharacter));

        // Print the modified string
        System.out.println("The modified string is:");
        System.out.println(modifiedString);
    }
}
