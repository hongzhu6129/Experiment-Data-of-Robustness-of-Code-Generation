import java.util.Scanner;

public class RemoveCharsFromString {

    public static void main(String[] args) {
        // Get the input string from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove the characters 'b' and "ac" from the input string
        String outputString = inputString.replaceAll("b", "").replaceAll("ac", "");

        // Print the output string
        System.out.println("The output string is: " + outputString);
    }
}
