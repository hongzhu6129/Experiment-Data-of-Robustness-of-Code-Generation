import java.util.Scanner;

public class CompositeString {

    public static boolean isComposite(String str) {
        int len = str.length();

        // Check if the string is empty
        if (len == 0) {
            return false;
        }

        // Check if the string is a single character
        if (len == 1) {
            return true;
        }

        // Find the length of the potential substring
        int subLen = 1;
        while (subLen < len / 2) {
            subLen++;
        }

        // Check if the string is a multiple of the potential substring
        if (len % subLen != 0) {
            return false;
        }

        // Check if the substring repeats throughout the string
        for (int i = subLen; i < len; i += subLen) {
            if (!str.substring(i, i + subLen).equals(str.substring(0, subLen))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Check if the string is composite
        if (isComposite(str)) {
            System.out.println("The string is composite.");
        } else {
            System.out.println("The string is not composite.");
        }
    }
}
