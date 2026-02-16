import java.util.Scanner;

public class SingleLineInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a single line of input from the console.
        String input = scanner.nextLine();

        // Print the input string.
        System.out.println(input);
    }
}
