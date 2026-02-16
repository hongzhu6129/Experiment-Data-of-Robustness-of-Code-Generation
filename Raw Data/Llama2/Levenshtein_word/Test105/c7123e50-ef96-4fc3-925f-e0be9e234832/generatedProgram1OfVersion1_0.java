import java.util.Scanner;

public class RemoveFabricate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String input = scanner.nextLine();

        // Remove the word "fabricate" from the string
        String output = input.replaceAll("fabricate", "");

        // Print the resulting string
        System.out.println(output);
    }
}
