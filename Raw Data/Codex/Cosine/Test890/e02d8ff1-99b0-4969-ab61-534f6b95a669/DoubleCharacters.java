import java.util.Scanner;

public class DoubleCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Create a new string to store the doubled characters
        StringBuilder doubledStr = new StringBuilder();

        // Iterate over each character in the input string
        for (char c : str.toCharArray()) {
            // Append the character twice to the doubled string
            doubledStr.append(c).append(c);
        }

        // Print the doubled string
        System.out.println("The doubled string is: " + doubledStr.toString());
    }
}
