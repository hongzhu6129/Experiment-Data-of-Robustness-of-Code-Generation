import java.util.Scanner;

public class AppendStringsWithoutDoubleChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two strings from the user
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check if the concatenation of the two strings contains any double characters
        boolean containsDoubleChars = false;
        for (int i = 0; i < firstString.length() + secondString.length() - 1; i++) {
            if (firstString.charAt(i) == secondString.charAt(i + 1)) {
                containsDoubleChars = true;
                break;
            }
        }

        // If the concatenation contains double characters, omit one character from the second string
        String resultString;
        if (containsDoubleChars) {
            resultString = firstString + secondString.substring(1);
        } else {
            resultString = firstString + secondString;
        }

        // Print the result string
        System.out.println("The result string is: " + resultString);
    }
}
