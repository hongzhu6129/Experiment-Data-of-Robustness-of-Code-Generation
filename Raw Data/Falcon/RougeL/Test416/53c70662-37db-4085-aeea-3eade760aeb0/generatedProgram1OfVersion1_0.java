import java.util.Scanner;

public class SubstringBeforePeriod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the substring appears before a period
        boolean substringAppears = inputString.contains(".") && inputString.indexOf(".") > inputString.indexOf("substring");

        // Print the result
        System.out.println("The substring appears before a period: " + substringAppears);
    }
}
