import java.util.Scanner;

public class SubstringBeforePeriod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input string from the user.
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Check if the string contains a period.
        int periodIndex = str.indexOf('.');
        if (periodIndex == -1) {
            System.out.println("The string does not contain a period.");
            return;
        }

        // Get the substring before the period.
        String substring = str.substring(0, periodIndex);

        // Check if the substring appears before the period.
        if (str.indexOf(substring) < periodIndex) {
            System.out.println("The substring appears before the period.");
        } else {
            System.out.println("The substring does not appear before the period.");
        }
    }
}
