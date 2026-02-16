import java.util.Scanner;

public class ConvertToUppercase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Convert the string to lowercase
        String lowercase = str.toLowerCase();

        // Print the lowercase string
        System.out.println("The lowercase string is: " + lowercase);
    }
}
