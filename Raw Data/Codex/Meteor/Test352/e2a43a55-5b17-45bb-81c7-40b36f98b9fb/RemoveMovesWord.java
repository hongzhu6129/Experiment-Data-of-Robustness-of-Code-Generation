import java.util.Scanner;

public class RemoveMovesWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter the input string:");
        String inputString = scanner.nextLine();

        // Remove the word "moves" from the input string
        String outputString = inputString.replaceAll("moves", "");

        // Print the output string
        System.out.println("The output string is:");
        System.out.println(outputString);
    }
}
