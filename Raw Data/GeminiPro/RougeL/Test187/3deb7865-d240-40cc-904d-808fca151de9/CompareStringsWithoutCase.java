import java.util.Scanner;

public class CompareStringsWithoutCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the two strings from the user.
        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();

        // Convert the strings to lowercase and compare them.
        int comparison = string1.toLowerCase().compareTo(string2.toLowerCase());

        // Print the result of the comparison.
        if (comparison == 0) {
            System.out.println("The two strings are lexicographically equal.");
        } else if (comparison < 0) {
            System.out.println("The first string is lexicographically less than the second string.");
        } else {
            System.out.println("The first string is lexicographically greater than the second string.");
        }
    }
}
