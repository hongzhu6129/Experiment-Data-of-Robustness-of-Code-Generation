import java.util.Scanner;

public class StringToLowerCase {

    public static String convertToLowercase(String inputString) {
        if (inputString == null) {
            return null; // Handle null input
        }
        return inputString.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();
        String lowercaseString = convertToLowercase(inputString);
        System.out.println(lowercaseString);
        scanner.close();
    }
}


