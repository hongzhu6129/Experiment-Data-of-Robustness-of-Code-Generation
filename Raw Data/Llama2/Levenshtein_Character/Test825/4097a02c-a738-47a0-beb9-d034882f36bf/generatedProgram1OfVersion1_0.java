import java.util.Scanner;

public class RemoveDuplicateAdjacentCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove duplicate adjacent characters
        String outputString = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (i == 0 || inputString.charAt(i) != inputString.charAt(i - 1)) {
                outputString += inputString.charAt(i);
            }
        }

        // Print the output string
        System.out.println("Output string: " + outputString);
    }
}
