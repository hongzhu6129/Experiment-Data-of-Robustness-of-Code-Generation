import java.util.Scanner;

public class SplitString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Split the string into parts based on the delimiter
        String[] parts = str.split(" ");

        // Print the parts
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
