import java.util.Scanner;

public class StringEndsWith {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input strings
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        // Check if the first string ends with the second string
        boolean result = str1.endsWith(str2);

        // Print the result
        System.out.println("The first string " + (result ? "ends with" : "does not end with") + " the second string.");
    }
}
