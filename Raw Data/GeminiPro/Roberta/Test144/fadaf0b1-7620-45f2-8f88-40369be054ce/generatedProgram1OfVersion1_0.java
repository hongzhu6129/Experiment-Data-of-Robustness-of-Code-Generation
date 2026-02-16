import java.util.Scanner;

public class StringBuffer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String input = scanner.nextLine();

        // Create a string buffer
        StringBuffer buffer = new StringBuffer(input);

        // Reverse the string buffer
        buffer.reverse();

        // Print the reversed string
        System.out.println(buffer.toString());
    }
}
