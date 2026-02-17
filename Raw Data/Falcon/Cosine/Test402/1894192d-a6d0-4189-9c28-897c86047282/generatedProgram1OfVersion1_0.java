import java.util.Scanner;

public class RemoveFabricate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Remove all occurrences of "fabricate" from the input string
        String output = input.replaceAll("fabricate", "");

        // Print the output string
        System.out.println("The output string is: " + output);
    }
}
