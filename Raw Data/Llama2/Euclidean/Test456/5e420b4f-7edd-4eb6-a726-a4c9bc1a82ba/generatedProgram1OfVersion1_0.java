import java.util.Scanner;

public class RemoveCwellMilan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();

        // Remove "c well milan" from the input string
        String output = input.replace("c well milan", "");

        // Print the output string
        System.out.println("The output string is:");
        System.out.println(output);
    }
}
